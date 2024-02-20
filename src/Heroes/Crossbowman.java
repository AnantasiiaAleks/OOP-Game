package Heroes;

import Utilites.BaseChar;

import java.util.ArrayList;

public class Crossbowman extends BaseChar{
    private int arrows = 100;

    public Crossbowman(String name, int x, int y) {
        super(name, 100, 30,
                40, 60, true, x, y, 3);
    }
    @Override
    public void step(ArrayList<BaseChar> enemys) {
        if (Crossbowman.this.isDead(health)) {
            System.out.println(this.getInfo() + " умер, ничего не могу, поднимите мне веки, тогда замогу.");
        } else if (Crossbowman.this.getArrows() <= 0) {
            System.out.println(this.getInfo() + ": Я пустой! Дайте стрел.");
        } else {
            BaseChar target = Crossbowman.this.nearestTarget(enemys);
            System.out.println("Цель найдена - " + target.getInfo());
            attack(target);
            System.out.println(this.getInfo() + ": Получай, каналья!");
        }
    }

    private void attack(BaseChar target) {
        int damage = target.getHealth() / 5;
        System.out.println("damage - " + damage);
        target.setHealth(target.getHealth() - damage);
        this.setArrows(this.getArrows() - 1);
    }
    public int getArrows() {return arrows;}

    public void setArrows(int arrows) {this.arrows = arrows;}



//    @Override
//    public void attack (BaseChar target) {
//        int damage = BaseChar.r.nextInt(target.getStamina() / 30);
//        target.getDamage(damage);
//    }

}
