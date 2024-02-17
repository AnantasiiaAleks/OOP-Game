public class Rogue extends Hero {
    private int agility;
    private int energy;

    public Rogue(String name, int stamina, String weapon, int agility, int energy) {
        super(name, stamina, weapon);
        this.agility = agility;
        this.energy = energy;
    }

    @Override
    public String toString() {
        return "classes.Hero " + this.getClass().getSimpleName() +
                " name: " + name + '\'' +
                ", health: " + health;
    }
    @Override
    public void attack(Hero target) {
        if (energy > 0) {
            int damage = Hero.r.nextInt(attackPower * agility);
            target.getDamage(damage);
        }
    }
}
