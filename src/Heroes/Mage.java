package Heroes;

import Utilites.BaseChar;

import java.util.ArrayList;

public class Mage extends BaseChar {
    private int mana = 50;

    public Mage(String name, int x, int y) {
        super(name, 10, 10, 30,
                40, 60, true, x, y, 1);
    }

    @Override
    public void step(ArrayList<BaseChar> enemys) {
        if (Mage.this.isDead(health)) {
            System.out.println(this.getInfo() + " умер.");
            System.out.println("--------------------");
        } else if (Mage.this.getMana() <= 0) {
            System.out.println(this.getInfo() + ": Мало маны.");
            System.out.println("--------------------");
        } else {
            BaseChar target = Mage.this.nearestTarget(enemys);
            System.out.println(this.getInfo() + ": Цель найдена - " + target.getInfo());
            attack(target);
            System.out.println(this.getInfo() + "Фаер, " + target.getInfo() + "!");
            System.out.println("--------------------");
        }
    }
    private void attack(BaseChar target) {
        int damage = target.getHealth() / 5;
        System.out.println("damage - " + damage);
        target.getDamage(damage);
        this.setMana(this.getMana() - 10);
    }

    public int getMana() {return mana;}

    public void setMana(int mana) {this.mana = mana;}
}
