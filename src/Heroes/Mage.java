package Heroes;

import Utilites.BaseChar;

public class Mage extends BaseChar {
    private int mana = 100;

    public Mage(String name, int x, int y) {
        super(name, 100, 30, 40, 60, true, x, y);
    }
    @Override
    public void attack (BaseChar target) {
        int damage = BaseChar.r.nextInt(target.getStamina() / 40);
        target.getDamage(damage);
    }


}
