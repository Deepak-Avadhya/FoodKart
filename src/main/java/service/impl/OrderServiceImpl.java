package service.impl;

import model.restaurant.Restaurant;
import model.user.User;
import repository.RestaurantRepository;
import repository.Sesson;
import service.OrderService;

import java.util.Map;

public class OrderServiceImpl implements OrderService {
    @Override
    public Boolean place_order(String restaurantName, Integer quantity) {
        User currentUser = Sesson.getCurrentUser();
        if(currentUser==null){
            System.out.println("please login first");
            return null;
        }
        Map<String, Restaurant> restaurantMap = RestaurantRepository.getRestaurantMap();
        if(!restaurantMap.containsKey(restaurantName)){
            System.out.println(restaurantName+" order failded to place");
            return false;
        }
        Restaurant restaurant = restaurantMap.get(restaurantName);
        if(restaurant.getSpecializedFood().getQuantity()-quantity<0){
            System.out.println(restaurantName+" order failed placed for userId "+ currentUser.getPhoneNumber());
            return false;
        }
        restaurant.getSpecializedFood().updateQuantity(-quantity);
        System.out.println(restaurantName+" order successfully placed for userId "+ currentUser.getPhoneNumber());
        return true;
    }
}
