package Heroes;

import Utilites.BaseChar;

public class Rogue extends BaseChar {
    private int energy = 50;

    public Rogue(String name, int x, int y) {
        super(name, 100, 40, 30, 60, true, x, y);
    }

    @Override
    public void attack (BaseChar target) {
        int damage = BaseChar.r.nextInt(target.getStamina() / 20);
        target.getDamage(damage);
    }


}
