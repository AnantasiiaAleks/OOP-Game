package Heroes;

import Utilites.BaseChar;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public abstract class Magic extends BaseChar {
    private int mana = 5;

    public Magic(String name, int x, int y) {
        super(name, 40, 40, 30,
                40, 60, true, x, y, 1);


    }
    @Override
    public void step(ArrayList<BaseChar> enemy, ArrayList<BaseChar> friends) {
        if (health < 1 || getMana() <= 0) return;
        BaseChar target = super.nearestTarget(enemy);
        if(target == null) return;
        attack(target);
    }

    private void attack(BaseChar target) {
        int damage =  ThreadLocalRandom.current().nextInt(2, 15);
        mana--;
        target.getDamage(damage);
    }
    public int getMana() {return mana;}

    public void setMana(int mana) {this.mana = mana;}

    @Override
    public String toString() {
        return super.toString() + ", \u26a1 " + mana;
    }
}
