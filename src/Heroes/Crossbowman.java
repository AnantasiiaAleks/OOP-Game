package Heroes;

import Utilites.BaseChar;
import java.util.ArrayList;

public class Crossbowman extends BaseChar{
    private int arrows = 10;

    public Crossbowman(String name, int x, int y) {
        super(name, 10, 10, 30,
                40, 60, true, x, y, 3);
    }
    @Override
    public void step(ArrayList<BaseChar> enemys) {
        if (Crossbowman.this.isDead(health)) {
            System.out.println(this.getInfo() + " умер.");
            System.out.println("--------------------");
        } else if (Crossbowman.this.getArrows() <= 0) {
            System.out.println(this.getInfo() + ": нет стрел.");
            System.out.println("--------------------");
        } else {
            BaseChar target = Crossbowman.this.nearestTarget(enemys);
            System.out.println(this.getInfo() + ": Цель найдена - " + target.getInfo());
            attack(target);
            System.out.println(this.getInfo() + ": Получай, каналья, " + target.getInfo() + "!");
            System.out.println("--------------------");
        }
    }

    private void attack(BaseChar target) {
        int damage = target.getHealth() / 5;
        System.out.println("damage - " + damage);
        target.getDamage(damage);
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
