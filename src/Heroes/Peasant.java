package Heroes;

import Utilites.BaseChar;
import Utilites.Position;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class Peasant extends BaseChar {
    protected boolean busy;

    public Peasant(String name, int x, int y) {
        super(name, 50, 50, 10,
                10, 50, true, x, y, 0);
        busy = false;
    }

    @Override
    public void step(ArrayList<BaseChar> enemy, ArrayList<BaseChar> friends) {
        if (health <= 0) return;
        busy = false;
        }

    public String getInfo() {
        return "Фермер";
    }

}
