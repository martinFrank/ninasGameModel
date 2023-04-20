package com.github.martinfrank.ninasgame.model.account;

import com.github.martinfrank.ninasgame.model.monster.Monster;

import java.util.ArrayList;
import java.util.List;

public class AccountDetails {

    private String name;
    private LoginDetails loginDetails;


    private List<Monster> players = new ArrayList<>();

    public AccountDetails() {
    }

    public AccountDetails(String name,LoginDetails loginDetails,  List<Monster> players) {
        this.name = name;
        this.loginDetails = loginDetails;
        this.players = players;
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

    public List<Monster> getPlayers() {
        return players;
    }

    public void setPlayers(List<Monster> playerCharacters) {
        this.players = playerCharacters;
    }
}
