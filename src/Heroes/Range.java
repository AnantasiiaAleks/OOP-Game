package Heroes;

import Utilites.BaseChar;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public abstract class Range extends BaseChar {
    private int arrows = 20;
    public Range(String name, int x, int y) {
        super(name, 50, 50, 30,
                40, 60, true, x, y, 3);
    }
    @Override
    public void step(ArrayList<BaseChar> enemy, ArrayList<BaseChar> friends) {
        if (health < 1 || getArrows() <= 0) return;
        attack(nearestTarget(enemy));
    }

    private void attack(BaseChar target) {
        int damage =  ThreadLocalRandom.current().nextInt(2, 15);
        arrows--;
        target.getDamage(damage);
    }
    public int getArrows() {return arrows;}

    public void setArrows(int arrows) {this.arrows = arrows;}

    @Override
    public String toString() {
        return super.toString() + ", \u27b6 " + arrows;
    }
}