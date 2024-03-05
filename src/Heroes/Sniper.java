package Heroes;

import Utilites.BaseChar;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class Sniper extends BaseChar {
    private int bullets = 30;

    public Sniper(String name, int x, int y) {
        super(name, 50, 50, 30,
                40, 60, true, x, y, 3);
    }

    @Override
    public void step(ArrayList<BaseChar> enemy, ArrayList<BaseChar> friends) {
        if (health < 1 || getBullets() <= 0) return;
        attack(nearestTarget(enemy));
    }

    private void attack(BaseChar target) {
        int damage =  ThreadLocalRandom.current().nextInt(2, 15);
        bullets--;
        target.getDamage(damage);
    }

    public int getBullets() {return bullets;}

    public void setBullets(int bullets) {this.bullets = bullets;}

    public String getInfo() {
        return "Снайпер";
    }

    @Override
    public String toString() {
        return super.toString() + ", \u27b6 " + bullets;
    }
}
