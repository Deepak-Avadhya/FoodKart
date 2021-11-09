package repository;

import model.restaurant.Restaurant;

import java.util.*;

public class RestaurantRepository {
    private static Map<String,Restaurant> restaurantMap = new HashMap<>();
    private static List<Restaurant> restaurantList = new ArrayList<>();

    public static Map<String, Restaurant> getRestaurantMap() {
        return restaurantMap;
    }

    public static void setRestaurantMap(Map<String, Restaurant> restaurantMap) {
        RestaurantRepository.restaurantMap = restaurantMap;
    }

    public static List<Restaurant> getRestaurantList() {
        return restaurantList;
    }

    public static void setRestaurantList(List<Restaurant> restaurantList) {
        RestaurantRepository.restaurantList = restaurantList;
    }
}
