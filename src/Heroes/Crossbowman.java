package Heroes;

import Utilites.BaseChar;

import java.util.ArrayList;
import java.util.LinkedList;

public class Crossbowman extends BaseChar {
    private int arrows = 100;

    public Crossbowman(String name, int x, int y) {
        super(name, 100, 30,
                40, 60, true, x, y);
    }

    @Override
    public void attack (BaseChar target) {
        int damage = BaseChar.r.nextInt(target.getStamina() / 30);
        target.getDamage(damage);
    }



}
