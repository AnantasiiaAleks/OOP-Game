package Heroes;

import Utilites.BaseChar;
import Utilites.Position;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public abstract class Melee extends BaseChar {

    public Melee(String name, int x, int y) {
        super(name, 50, 50, 10,
                10, 50, true, x, y, 2);
    }

    @Override
    public void step(ArrayList<BaseChar> enemy, ArrayList<BaseChar> friends) {
        if (health <= 0) return;
        BaseChar target = super.nearestTarget(enemy);
        if (position.getDistance(target) < 2.0) {
            attack(target);
            return;
        }

        Position diff = position.getDiff(target.position);
        Position newPosition = new Position(position.x, position.y);
        if (Math.abs(diff.x) > Math.abs(diff.y))
            newPosition.x += diff.x < 0 ? 1 : -1;
        else
            newPosition.y += diff.y < 0 ? 1 : -1;

        for (BaseChar unit : friends) {
            if (unit.position.equals(newPosition) && unit.getHealth() > 0) return;
        }
        this.position = newPosition;
    }

    private void attack(BaseChar target) {
        int damage =  ThreadLocalRandom.current().nextInt(2, 15);
        target.getDamage(damage);
    }
    @Override
    public String toString() {
        return super.toString() + ", \uD83D\uDCAA " + initiative ;
    }
}
