package com.albo.fightclub.person;

public abstract class AbstractPerson {

    private String name;
    private boolean isAlive;
    private boolean isHeadBlocked;
    private boolean isBodyBlocked;
    private boolean isLegsBlocked;
    private boolean isHeadAtack;
    private boolean isBodyAtack;
    private boolean isLegsAtack;
    private int healthPoint;
    protected int power;
    protected int speed;
    private int experince;
    protected int lvl;

    public AbstractPerson(String name) {
        super();
        this.name = name;
        this.isAlive = true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public boolean isHeadBlocked() {
        return isHeadBlocked;
    }

    public void setHeadBlocked(boolean headBlocked) {
        isHeadBlocked = headBlocked;
    }

    public boolean isBodyBlocked() {
        return isBodyBlocked;
    }

    public void setBodyBlocked(boolean bodyBlocked) {
        isBodyBlocked = bodyBlocked;
    }

    public boolean isLegsBlocked() {
        return isLegsBlocked;
    }

    public void setLegsBlocked(boolean legsBlocked) {
        isLegsBlocked = legsBlocked;
    }

    public boolean isHeadAtack() {
        return isHeadAtack;
    }

    public void setHeadAtack(boolean headAtack) {
        isHeadAtack = headAtack;
    }

    public boolean isBodyAtack() {
        return isBodyAtack;
    }

    public void setBodyAtack(boolean bodyAtack) {
        isBodyAtack = bodyAtack;
    }

    public boolean isLegsAtack() {
        return isLegsAtack;
    }

    public void setLegsAtack(boolean legsAtack) {
        isLegsAtack = legsAtack;
    }

    public int getHealthPoint() {
        return healthPoint;
    }

    public void setHealthPoint(int healthPoint) {
        this.healthPoint = healthPoint;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getExperince() {
        return experince;
    }

    public void setExperince(int experince) {
        this.experince = experince;
    }

    public int getLvl() {
        return lvl;
    }

    public void setLvl(int lvl) {
        this.lvl = lvl;
    }

    public abstract int getKickPower();

    public void clearDefenseCash() {
        isHeadBlocked = false;
        isBodyBlocked = false;
        isLegsBlocked = false;
    }

    public void clearAtackCash() {
        isHeadAtack = false;
        isBodyAtack = false;
        isLegsAtack = false;
    }

    public abstract void renumerateHealth();
}
