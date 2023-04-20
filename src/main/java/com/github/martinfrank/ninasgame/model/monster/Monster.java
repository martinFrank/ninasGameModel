package com.github.martinfrank.ninasgame.model.monster;


import com.github.martinfrank.ninasgame.model.item.Item;
import com.github.martinfrank.ninasgame.model.map.Map;

import java.util.HashMap;
public class Monster {

    private String name;
    private Archetype archetype;

    private Statistics statistics;
    private double xpos;
    private double ypos;

    private String mapName;
//    private Map<Item, String> inventory = new HashMap<>(); //item/slot


    public Monster(){
    }

    public Monster(String name, Archetype archetype, Statistics statistics, double xpos, double ypos, String mapName) {
        this.name = name;
        this.archetype = archetype;
        this.statistics = statistics;
        this.xpos = xpos;
        this.ypos = ypos;
        this.mapName = mapName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Archetype getArchetype() {
        return archetype;
    }

    public void setArchetype(Archetype archetype) {
        this.archetype = archetype;
    }

    public Statistics getStatistics() {
        return statistics;
    }

    public void setStatistics(Statistics statistics) {
        this.statistics = statistics;
    }

    public double getXpos() {
        return xpos;
    }

    public void setXpos(double xpos) {
        this.xpos = xpos;
    }

    public double getYpos() {
        return ypos;
    }

    public void setYpos(double ypos) {
        this.ypos = ypos;
    }

    public String getMapName() {
        return mapName;
    }

    public void setMapName(String mapName) {
        this.mapName = mapName;
    }

    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
//                ", archetype=" + archetype +
//                ", statistics=" + statistics +
//                ", xpos=" + xpos +
//                ", ypos=" + ypos +
                ", mapName='" + mapName + '\'' +
                '}';
    }
}
