package Heroes;

import Utilites.BaseChar;

import java.util.ArrayList;

public class Monk extends BaseChar {
    private int mana = 80;
    private int runePower = 100;


    public Monk(String name, int x, int y) {
        super(name, 100, 10,
                10, 60, true, x, y, 1);
    }

    @Override
    public void step(ArrayList<BaseChar> enemys) {
        if (Monk.this.isDead(health)) {
            System.out.println("Я умер, ничего не могу, поднимите мне веки, тогда замогу.");
        } else if (Monk.this.getMana() <= 0) {
            System.out.println("Я пустой! Дайте помолиться.");
        } else {
            BaseChar target = Monk.this.nearestTarget(enemys);
            System.out.println("Цель найдена");
            attack(target);
            System.out.println("Черню чакру!");
        }
    }

    private void attack(BaseChar target) {
        int damage = target.getHealth() / 10;
        target.setHealth(target.getHealth() - damage);
        this.setMana(this.getMana() - 20);
    }

    public int getMana() {return mana;}

    public void setMana(int mana) {this.mana = mana;}

    public int toHeal(BaseChar target, int runePower) {
            return BaseChar.r.nextInt(runePower);
    }

}
