package Heroes.MeleeUnits;


import Heroes.Melee;

public class Rogue extends Melee {


    public Rogue(String name, int x, int y) {
        super(name, x, y);
    }


    public String getInfo() {
        return "Разбойник";
    }


}
