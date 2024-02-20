package Heroes;

import Utilites.BaseChar;

import java.util.ArrayList;

public class Sniper extends BaseChar {
    private int bullets = 100;

    public Sniper(String name, int x, int y) {
        super(name, 100, 30,
                40, 60, true, x, y, 3);
    }

    @Override
    public void step(ArrayList<BaseChar> enemys) {
        if (Sniper.this.isDead(health)) {
            System.out.println("А потом мне прострелили колено...");
        } else if (Sniper.this.getBullets() <= 0) {
            System.out.println("Я пустой! Патронов мне!");
        } else {
            BaseChar target = Sniper.this.nearestTarget(enemys);
            System.out.println("Цель найдена");
            attack(target);
            System.out.println("Пиф-паф!");
        }
    }

    private void attack(BaseChar target) {
        int damage = target.getHealth() / 4;
        target.setHealth(target.getHealth() - damage);
        this.setBullets(this.getBullets() - 5);
    }

    public int getBullets() {return bullets;}

    public void setBullets(int bullets) {this.bullets = bullets;}
}
