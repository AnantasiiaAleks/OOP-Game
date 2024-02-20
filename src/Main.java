import Heroes.*;
import Utilites.*;

import java.util.*;

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

        Collections.sort(team1);
        Collections.sort(team2);
        Queue<BaseChar> round = new ArrayDeque<>();
        for (BaseChar tm1: team1) {
            for (BaseChar tm2: team2) {
                round.add(tm1);
                round.add(tm2);
            }
        }
        while(!round.isEmpty()) {
            System.out.println("Атакует команда 1");
            round.poll().step(team2);
            System.out.println("Атакует команда 2");
            round.poll().step(team1);
        }
    }

    private static String getName(){
        return String.valueOf(Names.values()[new Random().nextInt(Names.values().length-1)]);
    }



}