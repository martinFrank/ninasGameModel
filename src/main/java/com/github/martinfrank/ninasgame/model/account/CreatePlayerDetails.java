package com.github.martinfrank.ninasgame.model.account;

import com.github.martinfrank.ninasgame.model.monster.Monster;

public class CreatePlayerDetails {

    private AccountDetails accountDetails; //sind genung um den account zu finden afaik
    private Monster player;


    public CreatePlayerDetails() {
    }

    public CreatePlayerDetails(AccountDetails accountDetails, Monster player) {
        this.accountDetails = accountDetails;
        this.player = player;
    }

    public AccountDetails getAccountDetails() {
        return accountDetails;
    }

    public void setAccountDetails(AccountDetails accountDetails) {
        this.accountDetails = accountDetails;
    }

    public Monster getPlayer() {
        return player;
    }

    public void setPlayer(Monster player) {
        this.player = player;
    }
}
