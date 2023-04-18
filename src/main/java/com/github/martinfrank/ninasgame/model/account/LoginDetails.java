package com.github.martinfrank.ninasgame.model.account;

public class LoginDetails {

    private String userName;
    private String userPass;

    public LoginDetails() {
    }

    public LoginDetails(String userName, String userPass) {
        this.userName = userName;
        this.userPass = userPass;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPass() {
        return userPass;
    }

    public void setUserPass(String userPass) {
        this.userPass = userPass;
    }
}
