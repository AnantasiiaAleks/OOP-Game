package Heroes;

import Utilites.BaseChar;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class Monk extends BaseChar {
    private int mana = 30;
    private int runePower = 100;


    public Monk(String name, int x, int y) {
        super(name, 45, 45, 10,
                10, 60, true, x, y, 1);
    }

    @Override
    public void step(ArrayList<BaseChar> enemy, ArrayList<BaseChar> friends) {
        if (health < 1 || getMana() <= 0) return;
        attack(nearestTarget(enemy));
    }

    private void attack(BaseChar target) {
        int damage =  ThreadLocalRandom.current().nextInt(2, 10);
        mana--;
        target.getDamage(damage);
    }

    public int getMana() {return mana;}

    public void setMana(int mana) {this.mana = mana;}

    public int toHeal(BaseChar target, int runePower) {
            return BaseChar.r.nextInt(runePower);
    }

    public String getInfo() {
        return "Монах";
    }

    @Override
    public String toString() {
        return super.toString() + ", \u26a1 " + mana;
    }
}
