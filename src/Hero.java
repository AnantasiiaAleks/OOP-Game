import java.util.Random;

abstract class Hero {
    protected static Random r = new Random();
    protected String name;
    protected int health;
    protected int defence;
    protected int attackPower;
    protected String weapon;

    protected Hero(String name, int stamina, String weapon) {
        this.name = name;
        this.health = stamina * Hero.r.nextInt(stamina + 1);
        this.weapon = weapon;
        this.defence = stamina / (health + 1);
        this.attackPower = this.weapon.length() * Hero.r.nextInt(10);
    }


    protected void attack(Hero target) {
        int damage = Hero.r.nextInt(attackPower);
        target.getDamage(damage);
    }

    protected void getDamage(int damage) {
        if (this.health > 0) {
            this.health -= damage / this.defence;
        }
        else {
            System.out.println("Вас убили!");
        }
    }

    protected void getHealth(int healthPoints) {
        health += healthPoints;
    }


}
