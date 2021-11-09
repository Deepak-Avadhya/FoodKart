package model.user;

public class User {
    private String name;
    private Gender gender;
    private String pincode;
    private String phoneNumber;

    public User(String name, Gender gender, String phoneNumber,String pincode) {
        this.name = name;
        this.gender = gender;
        this.pincode = pincode;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
