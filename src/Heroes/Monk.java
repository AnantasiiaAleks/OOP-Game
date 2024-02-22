package Heroes;

import Utilites.BaseChar;

import java.util.ArrayList;

public class Monk extends BaseChar {
    private int mana = 50;
    private int runePower = 100;


    public Monk(String name, int x, int y) {
        super(name, 10, 10, 10,
                10, 60, true, x, y, 1);
    }

    @Override
    public void step(ArrayList<BaseChar> enemys) {
        if (Monk.this.isDead(health)) {
            System.out.println(this.getInfo() + " умер.");
            System.out.println("--------------------");
        } else if (Monk.this.getMana() <= 0) {
            System.out.println(this.getInfo() + ": мало маны.");
            System.out.println("--------------------");
        } else {
            BaseChar target = Monk.this.nearestTarget(enemys);
            System.out.println(this.getInfo() + ": Цель найдена - " + target.getInfo());
            attack(target);
            System.out.println(this.getInfo() + ": вынос мозга для " + target.getInfo() + "!");
            System.out.println("--------------------");
        }
    }

    private void attack(BaseChar target) {
        int damage = target.getHealth() / 5;
        System.out.println("damage - " + damage);
        target.getDamage(damage);
        this.setMana(this.getMana() - 2);
    }

    public int getMana() {return mana;}

    public void setMana(int mana) {this.mana = mana;}

    public int toHeal(BaseChar target, int runePower) {
            return BaseChar.r.nextInt(runePower);
    }

}
