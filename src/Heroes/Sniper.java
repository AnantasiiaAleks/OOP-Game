package Heroes;

import Utilites.BaseChar;

import java.util.ArrayList;

public class Sniper extends BaseChar {
    private int bullets = 10;

    public Sniper(String name, int x, int y) {
        super(name, 10, 10, 30,
                40, 60, true, x, y, 3);
    }

    @Override
    public void step(ArrayList<BaseChar> enemys) {
        if (Sniper.this.isDead(health)) {
            System.out.println(this.getInfo() + " умер.");
            System.out.println("--------------------");
        } else if (Sniper.this.getBullets() <= 0) {
            System.out.println(this.getInfo() + ": нет патронов.");
            System.out.println("--------------------");
        } else {
            BaseChar target = Sniper.this.nearestTarget(enemys);
            System.out.println(this.getInfo() + ": Цель найдена - " + target.getInfo());
            attack(target);
            System.out.println(this.getInfo() + ": Пиф-паф, " + target.getInfo() + "!");
            System.out.println("--------------------");
        }
    }

    private void attack(BaseChar target) {
        int damage = target.getHealth() / 2;
        System.out.println("damage - " + damage);
        target.getDamage(damage);
        this.setBullets(this.getBullets() - 5);
    }

    public int getBullets() {return bullets;}

    public void setBullets(int bullets) {this.bullets = bullets;}
}
