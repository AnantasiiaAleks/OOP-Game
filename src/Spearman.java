public class Spearman extends Hero {
    int trowing;
    int energy;

    public Spearman(String name, int stamina, String weapon, int trowing, int energy) {
        super(name, stamina, weapon);
        this.trowing = trowing;
        this.energy = energy;
    }
    @Override
    public void attack(Hero target) {
        if (energy > 0) {
            int damage = Hero.r.nextInt(attackPower * trowing);
            target.getDamage(damage);
        }
    }
}
