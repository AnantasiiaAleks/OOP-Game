package Heroes;

import Utilites.BaseChar;

import java.util.ArrayList;

public class Rogue extends BaseChar {
    private int energy = 50;

    public Rogue(String name, int x, int y) {
        super(name, 100, 40,
                30, 60, true, x, y, 2);
    }

    @Override
    public void step(ArrayList<BaseChar> enemys) {
        if (Rogue.this.isDead(health)) {
            System.out.println("Был фартовый, и весь вышел...");
        } else if (Rogue.this.getEnergy() <= 0) {
            System.out.println("Клинки затупились");
        } else {
            BaseChar target = Rogue.this.nearestTarget(enemys);
            System.out.println("Цель найдена");
            attack(target);
            System.out.println("Вжух - и дырочка в правом боку.");
        }
    }

    private void attack(BaseChar target) {
        int damage = target.getHealth() / 4;
        target.setHealth(target.getHealth() - damage);
        this.setEnergy(this.getEnergy() - 10);
    }

    public int getEnergy() {return energy;}

    public void setEnergy(int energy) {this.energy = energy;}
}
