package Heroes;

import java.util.Random;

public abstract class BaseChar {
    protected static Random r = new Random();
    protected String name;
    protected int health;
    protected int strength;
    protected int aqility;
    protected int stamina;
    protected boolean alive;

    public BaseChar(String name, int health, int strength, int agility, int stamina, Boolean alive) {
        this.name = name;
        this.health = 100;
        this.strength = 20;
        this.aqility = 20;
        this.stamina = 50;
        this.alive = true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public  int getStamina() {
        return stamina;
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
