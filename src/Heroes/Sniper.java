package Heroes;

import Utilites.BaseChar;

import java.util.ArrayList;

public class Sniper extends BaseChar {
    private int bullets = 30;

    public Sniper(String name, int x, int y) {
        super(name, 10, 10, 30,
                40, 60, true, x, y, 3);
    }

    @Override
    public void step(ArrayList<BaseChar> enemy, ArrayList<BaseChar> friends) {
        if (isDead(health) || getBullets() <= 0) return;
        attack(nearestTarget(enemy));
        System.out.println("Попался");
    }

    private void attack(BaseChar target) {
        int damage = r.nextInt(5);
        bullets--;
        target.getDamage(damage);
    }

    public int getBullets() {return bullets;}

    public void setBullets(int bullets) {this.bullets = bullets;}
}
