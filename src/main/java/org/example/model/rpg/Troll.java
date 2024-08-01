package org.example.model.rpg;

public class Troll extends Monster implements Poisonable, Bleedable{


    public Troll(String name, int hitPoints, double damage) {
        super(name, hitPoints, damage);
    }

    public Troll(String name, int hitPoints, double damage, boolean isBleed, boolean isPoison) {
        super(name, hitPoints, damage, isBleed, isPoison);
    }

    @Override
    public double attack() {
        return getDamage() + bleed() + poison();
    }


    @Override
    public double bleed() {
        return getDamage() * 0.25;
    }

    @Override
    public double poison() {
        return getDamage() * 0.3;
    }


/*
    @Override
    public double attack(Monster monster) {
        if (monster instanceof Troll) {
            Troll troll = (Troll) monster;
            return troll.getDamage() + troll.bleed() + troll.poison();
        }
    }

 */
}
