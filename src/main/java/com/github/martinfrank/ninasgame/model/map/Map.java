package com.github.martinfrank.ninasgame.model.map;


public class Map {

    private Long id;

    private int width;

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
