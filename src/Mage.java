public class Mage extends Hero {
    int intellect;
    int mana;

    public Mage(String name, int stamina, String weapon, int intellect, int mana) {
        super(name, stamina, weapon);
        this.intellect = intellect;
        this.mana = mana;
    }
    @Override
    public void attack(Hero target) {
        if (mana > 0) {
            int damage = Hero.r.nextInt(attackPower * intellect);
            target.getDamage(damage);
        }
    }
}
