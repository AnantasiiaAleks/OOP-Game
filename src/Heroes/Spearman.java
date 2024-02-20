package Heroes;

import Utilites.BaseChar;

import java.util.ArrayList;

public class Spearman extends BaseChar {
    private int energy = 50;

    public Spearman(String name, int x, int y) {
        super(name, 100, 50,
                30, 80, true, x, y, 2);
    }

    @Override
    public void step(ArrayList<BaseChar> enemys) {
        if (Spearman.this.isDead(health)) {
            System.out.println("Всем пока, меня убили");
        } else if (Spearman.this.getEnergy() <= 0) {
            System.out.println("Все, я в отпуск");
        } else {
            BaseChar target = Spearman.this.nearestTarget(enemys);
            System.out.println("Цель найдена");
            attack(target);
            System.out.println("На кол посажу!");
        }
    }

    private void attack(BaseChar target) {
        int damage = target.getHealth() / 5;
        target.setHealth(target.getHealth() - damage);
        this.setEnergy(this.getEnergy() - 10);
    }

    public int getEnergy() {return energy;}

    public void setEnergy(int energy) {this.energy = energy;}
}
