public class Rogue extends Hero {
    int agility;
    int energy;

    public Rogue(String name, int stamina, String weapon, int agility, int energy) {
        super(name, stamina, weapon);
        this.agility = agility;
        this.energy = energy;
    }
    @Override
    public void attack(Hero target) {
        if (energy > 0) {
            int damage = Hero.r.nextInt(attackPower * agility);
            target.getDamage(damage);
        }
    }
}
