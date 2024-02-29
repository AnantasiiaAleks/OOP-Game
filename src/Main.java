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

        //Реализация сортировки по инициативе:

        List<BaseChar> teamForRound = new ArrayList<>();
        teamForRound.addAll(team1);
        teamForRound.addAll(team2);
        teamForRound.sort((o1, o2) -> o2.getInitiative() - o1.getInitiative());

        // teamForRound.forEach(n -> System.out.println(n.toString()));
        System.out.println("-".repeat(50));
        Scanner scanner = new Scanner(System.in);


        while (true) {
            scanner.nextLine();

            for (BaseChar element : teamForRound) {
                if (team1.contains(element)) element.step(team2, team1);
                else element.step(team1, team2);
            }

            teamForRound.forEach(n -> System.out.println(n.toString()));
        }

    }

    private static String getName(){
        return String.valueOf(Names.values()[new Random().nextInt(Names.values().length-1)]);
    }



}