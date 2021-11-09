package repository;

import model.user.User;

import java.util.*;
import java.util.HashMap;
import java.util.Map;

public class UserRepository {
    private static Map<String,User> userMap = new HashMap<>();
    private static List<User> userList = new ArrayList<>();

    public static Map<String, User> getUserMap() {
        return userMap;
    }

    public static void setUserMap(Map<String, User> userMap) {
        UserRepository.userMap = userMap;
    }

    public static List<User> getUserList() {
        return userList;
    }

    public static void setUserList(List<User> userList) {
        UserRepository.userList = userList;
    }
}
