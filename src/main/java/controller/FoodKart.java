package controller;

import model.restaurant.Filter;
import model.user.Gender;
import service.OnBoardingService;
import service.OrderService;
import service.RestaurantService;
import service.impl.OnBoardingServiceImpl;
import service.impl.OrderServiceImpl;
import service.impl.RestaurantServiceImpl;

public class FoodKart {
    public static void main(String[] args){
        RestaurantService restaurantService = new RestaurantServiceImpl();
        OnBoardingService onBoardingService = new OnBoardingServiceImpl();
        OrderService orderService = new OrderServiceImpl();

        onBoardingService.register_user("Pralove", Gender.M, "phoneNumber-1", "HSR");
        onBoardingService.register_user("Nitesh", Gender.M, "phoneNumber-2", "BTM");
        onBoardingService.register_user("Vatsal", Gender.M, "phoneNumber-3", "BTM");

        onBoardingService.login_user("phoneNumber-1");
        restaurantService.register_restaurant("Food Court-1", "BTM/HSR", "NI Thali", 100, 5);
        restaurantService.register_restaurant("Food Court-2", "BTM", "Burger", 120, 3);

        onBoardingService.login_user("phoneNumber-2");
        restaurantService.register_restaurant("Food Court-3", "HSR", "SI Thali", 150, 1);
        onBoardingService.login_user("phoneNumber-3");

        restaurantService.show_restaurant(Filter.PRICE);

        orderService.place_order("Food Court-1",2);
        orderService.place_order("Food Court-2",7);

        restaurantService.create_review("Food Court-2",3,"Good Food");
        restaurantService.create_review("Food Court-1",5,"Nice Food");

        restaurantService.show_restaurant(Filter.RATING);
        onBoardingService.login_user("phoneNumber-1");
        restaurantService.update_quantity("Food Court-2",5);

        restaurantService.update_quantity("Food Court-2",5);
        restaurantService.update_location("Food Court-2","BTM/HSR");


    }
}
