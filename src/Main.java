import Heroes.*;

public class Main {
    public static void main(String[] args) {
        Peasant peasant = new Peasant("Крестьянин");
        Spearman spearman = new Spearman("Копейщик");
        BaseChar rogue = new Rogue("Разбойник");
        BaseChar crossbowman = new Crossbowman("Арбалетчик");
        BaseChar sniper = new Sniper("Снайпер");
        BaseChar mage = new Mage("Маг");
        BaseChar monk = new Monk("Монах");

        System.out.println(peasant.toString());
        System.out.println(spearman.toString());
        System.out.println(rogue.toString());
        System.out.println(crossbowman.toString());
        System.out.println(sniper.toString());
        System.out.println(mage.toString());
        System.out.println(monk.toString());
    }

}