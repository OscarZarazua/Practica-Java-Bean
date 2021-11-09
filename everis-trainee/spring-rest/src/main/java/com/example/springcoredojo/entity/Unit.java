package com.example.springcoredojo.entity;

public class Unit {

    private int id;
    private int hp;
    private int attack;
    private int armor;
    private int pierceArmor;
    private int range;
    private int speed;
    private String name;
    private String description;

    public Unit(int hp, int attack, int armor, int pierceArmor, int range, int speed, String name, String description) {
        this.hp = hp;
        this.attack = attack;
        this.armor = armor;
        this.pierceArmor = pierceArmor;
        this.range = range;
        this.speed = speed;
        this.name = name;
        this.description = description;
    }

    public Unit() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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
