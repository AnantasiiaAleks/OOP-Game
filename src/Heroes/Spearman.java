package Heroes;

import Utilites.BaseChar;

public class Spearman extends BaseChar {
    private int energy = 50;

    public Spearman(String name, int x, int y) {
        super(name, 100, 50, 30, 80, true, x, y);
    }

    @Override
    public void attack (BaseChar target) {
        int damage = BaseChar.r.nextInt(target.getStamina() / 20);
        target.getDamage(damage);
    }


}
