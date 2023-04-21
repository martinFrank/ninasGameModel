package com.github.martinfrank.ninasgame.model.map;


import com.github.martinfrank.ninasgame.model.item.Item;
import com.github.martinfrank.ninasgame.model.monster.Monster;

import java.util.ArrayList;
import java.util.List;

public class Map {

    private String name;

    private String mapFilename;

    private String queueName;

    private List<String> requiredFilenames = new ArrayList<>();

    private List<Item> items = new ArrayList<>();

    private List<Monster> monsters = new ArrayList<>();


    public Map() {
    }

    public Map(String name, String mapFilename, String queueName, List<String> requiredFilenames, List<Item> items, List<Monster> monsters) {
        this.name = name;
        this.mapFilename = mapFilename;
        this.queueName = queueName;
        this.requiredFilenames = requiredFilenames;
        this.items = items;
        this.monsters = monsters;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMapFilename() {
        return mapFilename;
    }

    public void setMapFilename(String mapFilename) {
        this.mapFilename = mapFilename;
    }

    public String getQueueName() {
        return queueName;
    }

    public void setQueueName(String queueName) {
        this.queueName = queueName;
    }

    public List<String> getRequiredFilenames() {
        return requiredFilenames;
    }

    public void setRequiredFilenames(List<String> requiredFilenames) {
        this.requiredFilenames = requiredFilenames;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public List<Monster> getMonsters() {
        return monsters;
    }

    public void setMonsters(List<Monster> monsters) {
        this.monsters = monsters;
    }
}
