public class Sniper extends Hero {
    private int marksmanship;
    private int bullets;

    public Sniper(String name, int stamina, String weapon, int marksmanship, int bullets) {
        super(name, stamina, weapon);
        this.marksmanship = marksmanship;
        this.bullets = bullets;
    }

    @Override
    public String toString() {
        return "classes.Hero " + this.getClass().getSimpleName() +
                " name: " + name + '\'' +
                ", health: " + health;
    }
    @Override
    public void attack(Hero target) {
        if (bullets > 0) {
            int damage = Hero.r.nextInt(attackPower * marksmanship);
            target.getDamage(damage);
        }
    }
}
