package Heroes;

import Utilites.BaseChar;

public class Monk extends BaseChar {
    private int mana = 80;
    private int runePower = 100;


    public Monk(String name, int x, int y) {
        super(name, 100, 10, 10, 60, true, x, y);
    }
    @Override
    public void attack (BaseChar target) {
        int damage = BaseChar.r.nextInt(target.getStamina() / 40);
        target.getDamage(damage);
    }



    public int toHeal(BaseChar target, int runePower) {
            return BaseChar.r.nextInt(runePower);
    }

}
