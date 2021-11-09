package com.example.springcoredojo.dto;

public class UnitDTO {

    private int hp;
    private int attack;
    private int armor;
    private int pierceArmor;
    private int range;
    private int speed;
    private String name;
    private String description;

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public int getPierceArmor() {
        return pierceArmor;
    }

    public void setPierceArmor(int pierceArmor) {
        this.pierceArmor = pierceArmor;
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
