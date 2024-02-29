package Heroes;

import Utilites.BaseChar;
import Utilites.Position;

import java.util.ArrayList;

public class Rogue extends BaseChar {
    private int energy = 50;

    public Rogue(String name, int x, int y) {
        super(name, 10, 10, 40,
                30, 60, true, x, y, 2);
    }

    @Override
    public void step(ArrayList<BaseChar> enemy, ArrayList<BaseChar> friends) {
        if ((health <= 0) || (Rogue.this.getEnergy() <= 0)) return;
        BaseChar target = super.nearestTarget(enemy);
        System.out.println("Рога " + this.getName() + " нашел цель " + target.getName());
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
        int damage = r.nextInt(5);
        System.out.println("damage - " + damage);
        target.getDamage(damage);
        this.setEnergy(this.getEnergy() - 2);
    }

    public int getEnergy() {return energy;}

    public void setEnergy(int energy) {this.energy = energy;}
}
