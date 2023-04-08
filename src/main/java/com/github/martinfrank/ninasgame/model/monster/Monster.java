package com.github.martinfrank.games.rpgmodel.monster;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Monster {

    @JsonProperty
    private Long id;

    @JsonProperty
    private String name;

    public Monster(){
    }

    public Monster(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
