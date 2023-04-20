package com.github.martinfrank.ninasgame.model.monster;

public class Archetype {

    private String clazz;
    private String race;
    //attack/defense/armor/damage


    public Archetype() {
    }

    public Archetype(String clazz, String race) {
        this.clazz = clazz;
        this.race = race;
    }

    public String getClazz() {
        return clazz;
    }

    public void setClazz(String clazz) {
        this.clazz = clazz;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }
}
