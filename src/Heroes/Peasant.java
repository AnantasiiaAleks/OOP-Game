package Heroes;

import Utilites.BaseChar;

import java.util.ArrayList;

public class Peasant extends BaseChar {
    private int energy = 20;

    public Peasant(String name, int x, int y) {
        super(name, 100, 10,
                10, 50, true, x, y, 0);
    }

    @Override
    public void step(ArrayList<BaseChar> enemys) {
        if (Peasant.this.isDead(health)) {
            System.out.println("Спаситя-памагитя!");
        } else if (Peasant.this.getEnergy() <= 0) {
            System.out.println("Вот те, батюшка, и Юрьев день.");
        } else {
            BaseChar target = Peasant.this.nearestTarget(enemys);
            System.out.println("Иду на вы");
            attack(target);
            System.out.println("На вилы!");
        }
    }

    private void attack(BaseChar target) {
        int damage = target.getHealth() / 2;
        target.setHealth(target.getHealth() - damage);
        this.setEnergy(this.getEnergy() - 10);
    }

    public int getEnergy() {return energy;}

    public void setEnergy(int energy) {this.energy = energy;}
//    @Override
//    public String toString() {
//        return "Class " + this.getClass().getSimpleName() +
//                " name: " + name + ", health: " + health;
//    }

}
