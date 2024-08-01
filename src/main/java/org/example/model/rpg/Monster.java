package org.example.model.rpg;

public abstract class Monster {

    private String name;
    private int hitPoints;
    private double damage;

    private boolean isBleed;
    private boolean isPoison;

    public Monster(String name, int hitPoints, double damage) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.damage = damage;
    }

    public Monster(String name, int hitPoints, double damage, boolean isBleed, boolean isPoison) {
        this(name, hitPoints, damage);
        this.isBleed = isBleed;
        this.isPoison = isPoison;
    }

    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public double getDamage() {
        return damage;
    }

    public boolean getIsBleed() {
        return isBleed;
    }

    public boolean getIsPoison() {
        return isPoison;
    }

    public abstract double attack();
}
