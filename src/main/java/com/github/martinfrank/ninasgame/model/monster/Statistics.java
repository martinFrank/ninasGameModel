package com.github.martinfrank.ninasgame.model.monster;

public class Statistics {

    private double maxLife;
    private double currentLife;
    private double speed;

    public Statistics() {
    }

    public Statistics(double maxLife, double currentLife, double speed) {
        this.maxLife = maxLife;
        this.currentLife = currentLife;
        this.speed = speed;
    }

    public double getMaxLife() {
        return maxLife;
    }

    public void setMaxLife(double maxLife) {
        this.maxLife = maxLife;
    }

    public double getCurrentLife() {
        return currentLife;
    }

    public void setCurrentLife(double currentLife) {
        this.currentLife = currentLife;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }
}
