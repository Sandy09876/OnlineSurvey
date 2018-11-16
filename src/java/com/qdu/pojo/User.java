
package com.qdu.pojo;

import java.io.Serializable;

public class User implements Serializable{
    private int userId;
    private String userPassword;
    private String userName;
    private String userGender;
    private int userAge;
    private String userMobile;

    public User() {
    }

    public User(int userId, String userPassword, String userName, String userGender, int userAge, String userMobile) {
        this.userId = userId;
        this.userPassword = userPassword;
        this.userName = userName;
        this.userGender = userGender;
        this.userAge = userAge;
        this.userMobile = userMobile;
    }

    
    
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserGender() {
        return userGender;
    }

    public void setUserGender(String userGender) {
        this.userGender = userGender;
    }

    public int getUserAge() {
        return userAge;
    }

    public void setUserAge(int userAge) {
        this.userAge = userAge;
    }

    public String getUserMobile() {
        return userMobile;
    }

    public void setUserMobile(String userMobile) {
        this.userMobile = userMobile;
    }
    
    
    
}
