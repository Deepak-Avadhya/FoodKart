package model.restaurant;

import model.common.Pair;
import model.user.User;
import repository.Sesson;

import java.util.HashMap;
import java.util.Map;

public class Rating {
    private Double avgRating;
    private Map<String,Pair<Integer,String>> userRateMap;

    Rating(){
        avgRating=0.0;
        userRateMap=new HashMap<>();
    }
    public Double getAvgRating() {
        return avgRating;
    }

    public void setAvgRating(Double avgRating) {
        this.avgRating = avgRating;
    }

    public Map<String, Pair<Integer, String>> getUserRateMap() {
        return userRateMap;
    }

    public void setUserRateMap(Map<String, Pair<Integer, String>> userRateMap) {
        this.userRateMap = userRateMap;
    }

    public void addRating(Integer rating, String comment){
        User user = Sesson.getCurrentUser();
        if(user==null){
            System.out.println("plz login first");
            return;
        }
        int size=userRateMap.size();
        avgRating=(avgRating*size+rating)/(double) (size+1);
        userRateMap.put(user.getPhoneNumber(),new Pair<>(rating,comment));
    }

    @Override
    public String toString() {
        return "Rating{" +
                "avgRating=" + avgRating +
                '}';
    }
}
