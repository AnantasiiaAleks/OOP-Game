import Heroes.*;
import Heroes.MagicUnits.Mage;
import Heroes.MagicUnits.Monk;
import Heroes.MeleeUnits.Rogue;
import Heroes.MeleeUnits.Spearman;
import Heroes.RangeUnits.Crossbowman;
import Heroes.RangeUnits.Sniper;
import Utilites.*;

import java.util.*;

public class Main {

    public static ArrayList<BaseChar> holyTeam = new ArrayList<>();
    public static ArrayList<BaseChar> darkTeam = new ArrayList<>();
    public static ArrayList<BaseChar> allTeam = new ArrayList<>();
    public static void main(String[] args) {
        int teamCount = 10;
        Random random = new Random();


        for (int i = 1; i < teamCount + 1; i++) {
            int variant = random.nextInt(4);
            switch (variant) {
                case 0:
                    holyTeam.add(new Crossbowman(getName(), i, 1));
                    break;
                case 1:
                    holyTeam.add(new Monk(getName(), i, 1));
                    break;
                case 2:
                    holyTeam.add(new Spearman(getName(), i, 1));
                    break;
                case 3:
                    holyTeam.add(new Peasant(getName(), i, 1));
                    break;
            }
        }

        for (int i = 1; i < teamCount+1; i++) {
            int variant = random.nextInt(4);
            switch (variant) {
                case 0:
                    darkTeam.add(new Sniper(getName(), i, 10));
                    break;
                case 1:
                    darkTeam.add(new Mage(getName(), i, 10));
                    break;
                case 2:
                    darkTeam.add(new Rogue(getName(), i, 10));
                    break;
                case 3:
                    darkTeam.add(new Peasant(getName(), i, 10));
                    break;
            }
        }

        //Реализация сортировки по инициативе:



        allTeam.addAll(holyTeam);
        allTeam.addAll(darkTeam);
        allTeam.sort((o1, o2) -> o2.getInitiative() - o1.getInitiative());

        // allTeam.forEach(n -> System.out.println(n.toString()));
        System.out.println("-".repeat(50));
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;


        while (true) {

            View.view();
            scanner.nextLine();
            int sumHolyHP = 0;
            int sumDarkHP = 0;
            for (BaseChar unit : holyTeam) {
                sumHolyHP += unit.getHealth();
            }
            for (BaseChar unit : darkTeam) {
                sumDarkHP += unit.getHealth();
            }
            if (sumHolyHP == 0) {
                System.out.println(AnsiColors.ANSI_GREEN + "Победила зеленая команда!");
                flag = false;
                break;
            }
            if (sumDarkHP == 0) {
                System.out.println(AnsiColors.ANSI_BLUE + "Победила синяя команда");
                flag = false;
                break;
            }

            for (BaseChar unit : allTeam) {
                if (holyTeam.contains(unit)) unit.step(darkTeam, holyTeam);
                else unit.step(holyTeam, darkTeam);
            }
        }

    }

    private static String getName(){
        return String.valueOf(Names.values()[new Random().nextInt(Names.values().length-1)]);
    }



}