package Heroes;

import Utilites.BaseChar;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class Mage extends BaseChar {
    private int mana = 30;

    public Mage(String name, int x, int y) {
        super(name, 40, 40, 30,
                40, 60, true, x, y, 1);
    }

    @Override
    public void step(ArrayList<BaseChar> enemy, ArrayList<BaseChar> friends) {
        if (health < 1 || getMana() <= 0) return;
        attack(nearestTarget(enemy));
    }

    private void attack(BaseChar target) {
        int damage =  ThreadLocalRandom.current().nextInt(2, 15);
        mana--;
        target.getDamage(damage);
    }

    public int getMana() {return mana;}

    public void setMana(int mana) {this.mana = mana;}

    public String getInfo() {
        return "Ведьмак";
    }

    @Override
    public String toString() {
        return super.toString() + ", \u26a1 " + mana;
    }
}



