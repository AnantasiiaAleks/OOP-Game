package Heroes;

import Utilites.BaseChar;

import java.util.ArrayList;

public class Monk extends BaseChar {
    private int mana = 30;
    private int runePower = 100;


    public Monk(String name, int x, int y) {
        super(name, 10, 10, 10,
                10, 60, true, x, y, 1);
    }

    @Override
    public void step(ArrayList<BaseChar> enemy, ArrayList<BaseChar> friends) {
        if (isDead(health) || getMana() <= 0) return;
        attack(nearestTarget(enemy));
        System.out.println("Chakra");
    }

    private void attack(BaseChar target) {
        int damage = r.nextInt(5);
        mana--;
        target.getDamage(damage);
    }

    public int getMana() {return mana;}

    public void setMana(int mana) {this.mana = mana;}

    public int toHeal(BaseChar target, int runePower) {
            return BaseChar.r.nextInt(runePower);
    }

}
