import Heroes.*;
import Utilites.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int teamCount = 10;
        Random random = new Random();

        ArrayList<BaseChar> team1 = new ArrayList<>();
        ArrayList<BaseChar> team2 = new ArrayList<>();
        for (int i = 0; i < teamCount; i++) {
            int variant = random.nextInt(7);
            switch (variant) {
                case 0:
                    team1.add(new Crossbowman(getName(), i, 0));
                    break;
                case 1:
                    team1.add(new Mage(getName(), i, 0));
                    break;
                case 2:
                    team1.add(new Monk(getName(), i, 0));
                    break;
                case 3:
                    team1.add(new Peasant(getName(), i, 0));
                    break;
                case 4:
                    team1.add(new Rogue(getName(), i, 0));
                    break;
                case 5:
                    team1.add(new Sniper(getName(), i, 0));
                    break;
                case 6:
                    team1.add(new Spearman(getName(), i, 0));
                    break;
            }
        }

        for (int i = 0; i < teamCount; i++) {
            int variant = random.nextInt(7);
            switch (variant) {
                case 0:
                    team2.add(new Crossbowman(getName(), i, 9));
                    break;
                case 1:
                    team2.add(new Mage(getName(), i, 9));
                    break;
                case 2:
                    team2.add(new Monk(getName(), i, 9));
                    break;
                case 3:
                    team2.add(new Peasant(getName(), i, 9));
                    break;
                case 4:
                    team2.add(new Rogue(getName(), i, 9));
                    break;
                case 5:
                    team2.add(new Sniper(getName(), i, 9));
                    break;
                case 6:
                    team2.add(new Spearman(getName(), i, 9));
                    break;
            }
        }

        System.out.println("Team1:");
        for (BaseChar tm: team1) {
            System.out.println(tm.toString());
        }
        System.out.println("Team2:");
        for (BaseChar tm: team2) {
            System.out.println(tm.toString());
        }
        System.out.println("____Nearest target____");
        System.out.println(team1.get(0).nearestTarget(team2));


//        Peasant peasant = new Peasant(getName(), 0, 9);
//        Spearman spearman = new Spearman("Копейщик");
//        BaseChar rogue = new Rogue("Разбойник");
//        BaseChar crossbowman = new Crossbowman("Арбалетчик");
//        BaseChar sniper = new Sniper("Снайпер");
//        BaseChar mage = new Mage("Маг");
//        BaseChar monk = new Monk("Монах");

//        System.out.println(peasant.toString());
//        System.out.println(spearman.toString());
//        System.out.println(rogue.toString());
//        System.out.println(crossbowman.toString());
//        System.out.println(sniper.toString());
//        System.out.println(mage.toString());
//        System.out.println(monk.toString());
    }

    private static String getName(){
        return String.valueOf(Names.values()[new Random().nextInt(Names.values().length-1)]);
    }



}