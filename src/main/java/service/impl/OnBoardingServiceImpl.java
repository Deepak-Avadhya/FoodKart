package service.impl;

import model.user.Gender;
import model.user.User;
import repository.Sesson;
import repository.UserRepository;
import service.OnBoardingService;

import java.util.List;
import java.util.Map;

public class OnBoardingServiceImpl implements OnBoardingService {
    @Override
    public Boolean register_user(String userName, Gender gender, String phoneNumber, String pinCode) {
        Map<String, User> userMap = UserRepository.getUserMap();
        List<User> userList = UserRepository.getUserList();

        if(userMap.containsKey(phoneNumber)){
            System.out.println(userName+" has been failed register");
            return false;
        }
        User user = new User(userName,gender,phoneNumber,pinCode);
        userMap.put(phoneNumber,user);
        userList.add(user);
        System.out.println(phoneNumber+" has been successfully register");
        return true;
    }

    @Override
    public Boolean login_user(String phoneNumber) {
        Map<String, User> userMap = UserRepository.getUserMap();

        if(!userMap.containsKey(phoneNumber)){
            System.out.println(phoneNumber+" userId not found");
            return false;
        }
        User user = userMap.get(phoneNumber);
        Sesson.setCurrentUser(user);
        System.out.println(user.getPhoneNumber()+" welcome");
        return true;
    }
}
