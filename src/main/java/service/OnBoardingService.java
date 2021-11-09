package service;

import model.user.Gender;

public interface OnBoardingService {
    Boolean register_user(String userName, Gender gender,String phoneNumber,String pinCode);
    Boolean login_user(String phoneNumber);
}
