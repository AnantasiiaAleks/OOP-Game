package Heroes;

import Utilites.BaseChar;
import java.util.ArrayList;

public class Peasant extends BaseChar {
    private int energy = 10;

    public Peasant(String name, int x, int y) {
        super(name, 10, 10, 10,
                10, 50, true, x, y, 0);
    }

    @Override
    public void step(ArrayList<BaseChar> enemys) {
        if (Peasant.this.isDead(health)) {
            System.out.println(this.getInfo() + " умер.");
            System.out.println("--------------------");
        } else if (Peasant.this.getEnergy() <= 0) {
            System.out.println(this.getInfo() + ": нет энергии.");
            System.out.println("--------------------");
        } else {
            BaseChar target = Peasant.this.nearestTarget(enemys);
            System.out.println(this.getInfo() + ": Цель найдена - " + target.getInfo());
            attack(target);
            System.out.println(this.getInfo() + ": на вилы - " + target.getInfo() + "!");
            System.out.println("--------------------");
        }
    }

    private void attack(BaseChar target) {
        int damage = target.getHealth() / 10;
        System.out.println("damage - " + damage);
        target.getDamage(damage);
        this.setEnergy(this.getEnergy() - 1);
    }



    public int getEnergy() {return energy;}

    public void setEnergy(int energy) {this.energy = energy;}


//    @Override
//    public String toString() {
//        return "Class " + this.getClass().getSimpleName() +
//                " name: " + name + ", health: " + health;
//    }

}
