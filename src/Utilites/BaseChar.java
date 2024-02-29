package Utilites;

import java.util.*;

public abstract class BaseChar implements Step, Comparable<BaseChar> {
    protected static Random r = new Random();
    protected String name;
    protected int health;
    protected int maxHealth;
    protected int strength;
    protected int aqility;
    protected int stamina;
    protected boolean alive;
    public Position position;
    protected int initiative;

    public BaseChar(String name, int health, int maxHealth, int strength, int aqility, int stamina, boolean alive, int x, int y, int initiative) {
        this.name = name;
        this.health = health;
        this.maxHealth = maxHealth;
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
        this.maxHealth = 100;
        this.strength = 20;
        this.aqility = 20;
        this.stamina = 50;
        this.alive = true;
        this.position = new Position(x, y);
        this.initiative = initiative;
    }
    @Override
    public String toString() {
        return String.format("Class %s name: %s, health: %d, position: (%d, %d), initiative: %d",
                this.getClass().getSimpleName(), this.getName(), this.getHealth(), position.getX(),
                position.getY(), this.getInitiative());
    }
    public String getInfo() {
        return "Class " + this.getClass().getSimpleName() + " " + this.getName() +
                ", health:" + this.getHealth() + "/" + this.getMaxHealth();
    }

    public BaseChar nearestTarget(ArrayList<BaseChar> enemys) {
        BaseChar target = null;
        double minDistance = 10;
        for (BaseChar enemy : enemys) {
            if (position.getDistance(enemy) < minDistance && !enemy.isDead(enemy.getHealth())) {
                minDistance = position.getDistance(enemy);
                target = enemy;
            }
        }
        return target;
    }

    public boolean isDead(int health) {
        return health <= 0;
    }
    public void getDamage(int damage) {
        health -= damage;
        if (health <= 0) this.setHealth(0); isDead(0);
        if (health > maxHealth) health = maxHealth;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public  int getHealth() {return health;}

    public int getMaxHealth() {return maxHealth;}

    public void setHealth(int health) {this.health = health;}

    public int getStamina() { return stamina; }

    public int getInitiative() {return initiative; }

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
