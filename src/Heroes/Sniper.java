package Heroes;

import Utilites.BaseChar;

public class Sniper extends BaseChar {
    private int bullets = 100;

    public Sniper(String name, int x, int y) {
        super(name, 100, 30, 40, 60, true, x, y);
    }

    @Override
    public void attack (BaseChar target) {
        int damage = BaseChar.r.nextInt(target.getStamina() / 30);
        target.getDamage(damage);
    }


}
