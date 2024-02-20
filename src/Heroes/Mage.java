package Heroes;

import Utilites.BaseChar;

import java.util.ArrayList;

public class Mage extends BaseChar {
    private int mana = 100;

    public Mage(String name, int x, int y) {
        super(name, 100, 30,
                40, 60, true, x, y, 1);
    }

    @Override
    public void step(ArrayList<BaseChar> enemys) {
        if (Mage.this.isDead(health)) {
            System.out.println("Я умер, ничего не могу, поднимите мне веки, тогда замогу.");
        } else if (Mage.this.getMana() <= 0) {
            System.out.println("Я пустой! Дайте попить.");
        } else {
            BaseChar target = Mage.this.nearestTarget(enemys);
            System.out.println("Цель найдена");
            attack(target);
            System.out.println("Фаер!");
        }
    }
    private void attack(BaseChar target) {
        int damage = target.getHealth() / 5;
        target.setHealth(target.getHealth() - damage);
        this.setMana(this.getMana() - 10);
    }

    public int getMana() {return mana;}

    public void setMana(int mana) {this.mana = mana;}
}
