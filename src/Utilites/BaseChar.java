package Utilites;

import java.util.ArrayList;
import java.util.Random;

public abstract class BaseChar {
    protected static Random r = new Random();
    protected String name;
    protected int health;
    protected int strength;
    protected int aqility;
    protected int stamina;
    protected boolean alive;
    public Position position;

    public BaseChar(String name, int health, int strength, int aqility, int stamina, boolean alive, int x, int y) {
        this.name = name;
        this.health = health;
        this.strength = strength;
        this.aqility = aqility;
        this.stamina = stamina;
        this.alive = alive;
        this.position = new Position(x, y);
    }

    public BaseChar(String name, int x, int y) {
        this.name = name;
        this.health = 100;
        this.strength = 20;
        this.aqility = 20;
        this.stamina = 50;
        this.alive = true;
        this.position = new Position(x, y);
    }
    @Override
    public String toString() {
        return "Class " + this.getClass().getSimpleName() +
                " name: " + name + ", health: " + health +
                ", position: (" + position.getX() + ", " + position.getY() + ").";
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

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public boolean getAlive() {
        return alive;
    }
    public void setAlive() {
        this.alive = alive;
    }

    public  int getHealth() {
        return health;
    }

    public int getStamina() { return stamina; }

    public void GetDamage(int damage) {
        if (this.health - damage > 0) {
            this.health -= damage;
        }
    }

    public void deathStatus( int health) {
        if(health <= 0) {
            boolean alive = false;
            setAlive();
            System.out.println("Ваш персонаж умер.");
        }
    }

    public void attack(BaseChar target) {
        int damage = BaseChar.r.nextInt(target.stamina / 2);
        target.getDamage(damage);
    }

    public void getDamage(int damage) {
        if (this.health - damage > 0) {
            this.health -= damage / this.stamina;
        }
        else {
            System.out.println("Вас убили!");
        }
    }

    public void getHealth(int healthPoints) {
        health += healthPoints;
    }




}
