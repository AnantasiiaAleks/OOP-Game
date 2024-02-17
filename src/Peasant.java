public class Peasant extends Hero {
    int strength;
    int energy;

    public Peasant(String name, int stamina, String weapon, int strength, int energy) {
        super(name, stamina, weapon);
        this.strength = strength;
        this.energy = energy;
    }

    @Override
    public void attack(Hero target) {
        if (energy > 0) {
            int damage = Hero.r.nextInt(attackPower * strength);
            target.getDamage(damage);
        }
    }
}
