package Heroes;

import Utilites.BaseChar;

import java.util.ArrayList;

public class Spearman extends BaseChar {
    private int energy = 10;

    public Spearman(String name, int x, int y) {
        super(name, 10, 10, 50,
                30, 80, true, x, y, 2);
    }

    @Override
    public void step(ArrayList<BaseChar> enemys) {
        if (Spearman.this.isDead(health)) {
            System.out.println(this.getInfo() + " умер.");
            System.out.println("--------------------");
        } else if (Spearman.this.getEnergy() <= 0) {
            System.out.println(this.getInfo() + ": нет энергии.");
            System.out.println("--------------------");
        } else {
            BaseChar target = Spearman.this.nearestTarget(enemys);
            System.out.println(this.getInfo() + ": Цель найдена - " + target.getInfo());
            attack(target);
            System.out.println(this.getInfo() + ": На кол,  " + target.getInfo() + "!");
            System.out.println("--------------------");
        }
    }

    private void attack(BaseChar target) {
        int damage = target.getHealth() / 5;
        System.out.println("damage - " + damage);
        target.getDamage(damage);
        this.setEnergy(this.getEnergy() - 2);
    }

    public int getEnergy() {return energy;}

    public void setEnergy(int energy) {this.energy = energy;}
}
