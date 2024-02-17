public class Monk extends Hero {
    private int intellect;
    private int runePower;
    private int mana;

    Monk(String name, int stamina, String weapon, int intellect, int runePower, int mana) {
        super(name, stamina, weapon);
        this.intellect = intellect;
        this.runePower = runePower;
        this.mana = mana;
    }
    @Override
    public String toString() {
        return "classes.Hero " + this.getClass().getSimpleName() +
                " name: " + name + '\'' +
                ", health: " + health;
    }

    public int toHeal(Hero target, int runePower) {
            return Hero.r.nextInt(runePower);
    }

    @Override
    public void attack(Hero target) {
        if (mana > 0) {
            int damage = Hero.r.nextInt(attackPower * intellect);
            target.getDamage(damage);
        }
    }
}
