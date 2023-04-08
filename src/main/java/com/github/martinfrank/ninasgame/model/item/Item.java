package com.github.martinfrank.games.rpgmodel.item;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Item {

    @JsonProperty
    private Long id;

    @JsonProperty
    private String name;

    @JsonProperty
    private double weight;

    public Item(){
    }

    public Item(Long id, String name, int weight) {
        this.id = id;
        this.name = name;
        this.weight = weight;
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

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
