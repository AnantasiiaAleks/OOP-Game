public class Peasant extends Hero {
    private int strength;
    private int energy;

    Peasant(String name, int stamina, String weapon, int strength, int energy) {
        super(name, stamina, weapon);
        this.strength = strength;
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
            int damage = Hero.r.nextInt(attackPower * strength);
            target.getDamage(damage);
        }
    }
}
