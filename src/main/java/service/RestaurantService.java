package service;

import model.restaurant.Filter;
import model.restaurant.Restaurant;
import model.user.Gender;

import java.util.List;

public interface RestaurantService {
    Boolean register_restaurant(String restaurantName, String pincodes, String foodName, Integer price, Integer quantity);
    Boolean create_review(String restaurantName,Integer rating, String comment);
    Boolean update_quantity(String restaurantName, Integer quantity);
    Boolean update_location(String restaurantName, String pincodes);
    List<Restaurant> show_restaurant(Filter filter);

}
