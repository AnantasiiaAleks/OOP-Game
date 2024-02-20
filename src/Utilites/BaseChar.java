package Utilites;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

public abstract class BaseChar implements Step, Comparable<BaseChar> {
    protected static Random r = new Random();
    protected String name;
    protected int health;
    protected int strength;
    protected int aqility;
    protected int stamina;
    protected boolean alive;
    public Position position;
    protected int initiative;

    public BaseChar(String name, int health, int strength, int aqility, int stamina, boolean alive, int x, int y, int initiative) {
        this.name = name;
        this.health = health;
        this.strength = strength;
        this.aqility = aqility;
        this.stamina = stamina;
        this.alive = alive;
        this.position = new Position(x, y);
        this.initiative = initiative;
    }

    public BaseChar(String name, int x, int y, int initiative) {
        this.name = name;
        this.health = 100;
        this.strength = 20;
        this.aqility = 20;
        this.stamina = 50;
        this.alive = true;
        this.position = new Position(x, y);
        this.initiative = initiative;
    }
    @Override
    public String toString() {
        return "Class " + this.getClass().getSimpleName() +
                " name: " + name + ", health: " + health +
                ", position: (" + position.getX() + ", " + position.getY() + ").";
    }
    public String getInfo() {
        return "Class " + this.getClass().getSimpleName();
    }

    public BaseChar nearestTarget(ArrayList<BaseChar> enemys) {
        if (enemys.isEmpty()) {
            return null;
        }
        double minDistance = position.getDistance(enemys.get(0));
        BaseChar nearestTarget = enemys.get(0);
        for (int i = 0; i < enemys.size(); i++) {
            if (position.getDistance(enemys.get(i)) < minDistance) {
                minDistance = position.getDistance(enemys.get(i));
                nearestTarget = enemys.get(i);
            }
        }
        return nearestTarget;
    }

    public boolean isDead(int health) {
        if(health <= 0) {
            return true;
        } else {
            return false;
        }
    }
    public void getHealing(int healthPoints) {
        health += healthPoints;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public  int getHealth() {return health;}

    public void setHealth(int health) {this.health = health;}

    public int getStamina() { return stamina; }

    @Override
    public int compareTo(BaseChar o) {
        if (this.initiative > o.initiative)
            return -1;
        else if (this.initiative < o.initiative)
            return 1;
        else
            return 0;
    }

}
