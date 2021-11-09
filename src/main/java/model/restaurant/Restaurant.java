package model.restaurant;

import java.util.Arrays;
import java.util.List;

public class Restaurant {
    private List<String> pincodes;
    private String restaurantName;
    private Food specializedFood;
    private Rating rating;

    public Restaurant(String restaurantName,String pinCodeStr,String foodName,Integer price,Integer quantity) {
        this.restaurantName=restaurantName;
        pincodes = Arrays.asList(pinCodeStr.split("\\/"));
        specializedFood=new Food(foodName,quantity,price);
        rating=new Rating();
    }

    public Rating getRating() {
        return rating;
    }

    public void setRating(Rating rating) {
        this.rating = rating;
    }

    public List<String> getPincodes() {
        return pincodes;
    }

    public void setPincodes(List<String> pincodes) {
        this.pincodes = pincodes;
    }

    public void updateLocation(String pinCodeStr){
        this.pincodes = Arrays.asList(pinCodeStr.split("\\/"));
    }


    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public Food getSpecializedFood() {
        return specializedFood;
    }

    public void setSpecializedFood(Food specializedFood) {
        this.specializedFood = specializedFood;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "pincodes=" + pincodes +
                ", restaurantName='" + restaurantName + '\'' +
                ", specializedFood=" + specializedFood +
                ", rating=" + rating +
                '}';
    }
}
