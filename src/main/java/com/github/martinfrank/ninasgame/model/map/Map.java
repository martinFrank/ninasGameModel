package com.github.martinfrank.games.rpgmodel.map;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Map {

    @JsonProperty
    private Long id;

    @JsonProperty
    private int width;

    @JsonProperty
    private int height;


    public Map(){
    }

    public Map(Long id, int width, int height) {
        this.id = id;
        this.width = width;
        this.height = height;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
