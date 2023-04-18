package com.github.martinfrank.ninasgame.model.account;

import com.github.martinfrank.ninasgame.model.monster.Monster;

import java.util.ArrayList;
import java.util.List;

public class AccountDetails {

    private String name;
    private LoginDetails loginDetails;


    private List<Monster> playerCharacters = new ArrayList<>();

    public AccountDetails() {
    }

    public AccountDetails(LoginDetails loginDetails, String name, List<Monster> playerCharacters) {
        this.loginDetails = loginDetails;
        this.name = name;
        this.playerCharacters = playerCharacters;
    }

    public LoginDetails getLoginDetails() {
        return loginDetails;
    }

    public void setLoginDetails(LoginDetails loginDetails) {
        this.loginDetails = loginDetails;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Monster> getPlayerCharacters() {
        return playerCharacters;
    }

    public void setPlayerCharacters(List<Monster> playerCharacters) {
        this.playerCharacters = playerCharacters;
    }
}
