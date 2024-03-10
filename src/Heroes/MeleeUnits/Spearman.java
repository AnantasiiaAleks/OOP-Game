package Heroes.MeleeUnits;


import Heroes.Melee;

public class Spearman extends Melee {


    public Spearman(String name, int x, int y) {
        super(name, x, y);
    }

    public String getInfo() {
        return "Копейщик";
    }


}
