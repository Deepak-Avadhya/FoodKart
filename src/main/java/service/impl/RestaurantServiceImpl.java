package service.impl;

import model.restaurant.Filter;
import model.restaurant.Restaurant;
import model.user.User;
import repository.RestaurantRepository;
import repository.Sesson;
import service.RestaurantService;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class RestaurantServiceImpl implements RestaurantService {

    @Override
    public Boolean register_restaurant(String restaurantName, String pincodes, String foodName, Integer price, Integer quantity) {
        Map<String,Restaurant> restaurantMap = RestaurantRepository.getRestaurantMap();
        List<Restaurant> restaurantList = RestaurantRepository.getRestaurantList();
        if(restaurantMap.containsKey(restaurantName)){
            System.out.println(restaurantName+" failed to register");
            return false;
        }
        Restaurant restaurant = new Restaurant(restaurantName,pincodes,foodName,price,quantity);
        restaurantMap.put(restaurantName,restaurant);
        restaurantList.add(restaurant);
        System.out.println(restaurant);
        return true;
    }

    @Override
    public Boolean create_review(String restaurantName, Integer rating, String comment) {
        User currentUser = Sesson.getCurrentUser();
        if(currentUser==null){
            System.out.println("please login first");
            return null;
        }

        Map<String,Restaurant> restaurantMap = RestaurantRepository.getRestaurantMap();
        if(!restaurantMap.containsKey(restaurantName)){
            System.out.println(restaurantName+" failed to created review");
            return false;
        }
        Restaurant restaurant = restaurantMap.get(restaurantName);
        restaurant.getRating().addRating(rating,comment);
        System.out.println(restaurant);
        return true;
    }

    @Override
    public Boolean update_quantity(String restaurantName, Integer quantity) {
        Map<String,Restaurant> restaurantMap = RestaurantRepository.getRestaurantMap();
        if(!restaurantMap.containsKey(restaurantName)){
            System.out.println(restaurantName+" failed to update quantity");

            return false;
        }
        Restaurant restaurant = restaurantMap.get(restaurantName);
        if(restaurant.getSpecializedFood().getQuantity()+quantity<0)return false;
        restaurant.getSpecializedFood().updateQuantity(quantity);
        System.out.println(restaurant);
        return true;
    }

    @Override
    public Boolean update_location(String restaurantName, String pincodes) {
        Map<String,Restaurant> restaurantMap = RestaurantRepository.getRestaurantMap();
        if(!restaurantMap.containsKey(restaurantName)){
            System.out.println(restaurantName+" failed to update location");
            return false;
        }
        Restaurant restaurant = restaurantMap.get(restaurantName);
        restaurant.updateLocation(pincodes);
        System.out.println(restaurant);
        return true;
    }

    @Override
    public List<Restaurant> show_restaurant(Filter filter) {
        List<Restaurant> restaurantList = RestaurantRepository.getRestaurantList();
        User currentUser = Sesson.getCurrentUser();
        if(currentUser==null){
            System.out.println("please login first");
            return null;
        }
        List<Restaurant> restaurantList1= restaurantList.stream()
                .filter((restaurant -> restaurant.getPincodes().stream().anyMatch((pincode) -> pincode.equalsIgnoreCase(currentUser.getPincode()))))
                .sorted((restaurant1,restaurant2)->{
            if(filter==Filter.PRICE){
                return restaurant1.getSpecializedFood().getPrice().compareTo(restaurant2.getSpecializedFood().getPrice());
            }else if(filter==Filter.RATING){
                return restaurant2.getRating().getAvgRating().compareTo(restaurant1.getRating().getAvgRating());
            }
            return 1;
        }).collect(Collectors.toList());
        System.out.println(restaurantList1);
        return restaurantList1;
    }
}
