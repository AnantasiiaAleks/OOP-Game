package Heroes;

import Utilites.BaseChar;
import java.util.ArrayList;

public class Crossbowman extends BaseChar{
    private int arrows = 20;

    public Crossbowman(String name, int x, int y) {
        super(name, 10, 10, 30,
                40, 60, true, x, y, 3);
    }
    @Override
    public void step(ArrayList<BaseChar> enemy, ArrayList<BaseChar> friends) {
        if (isDead(health) || getArrows() <= 0) return;
        attack(nearestTarget(enemy));
        System.out.println("Попался");
    }

    private void attack(BaseChar target) {
        int damage = r.nextInt(5);
        arrows--;
        target.getDamage(damage);
    }
    public int getArrows() {return arrows;}

    public void setArrows(int arrows) {this.arrows = arrows;}



//    @Override
//    public void attack (BaseChar target) {
//        int damage = BaseChar.r.nextInt(target.getStamina() / 30);
//        target.getDamage(damage);
//    }

}
