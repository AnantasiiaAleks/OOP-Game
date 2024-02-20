package Heroes;

import Utilites.BaseChar;

public class Peasant extends BaseChar {
    private int energy = 20;

    public Peasant(String name, int x, int y) {
        super(name, 100, 10,
                10, 50, true, x, y);
    }

    @Override
    public void attack (BaseChar target) {
        int damage = BaseChar.r.nextInt(target.getStamina() / 5);
        target.getDamage(damage);
    }

//    @Override
//    public String toString() {
//        return "Class " + this.getClass().getSimpleName() +
//                " name: " + name + ", health: " + health;
//    }

}
