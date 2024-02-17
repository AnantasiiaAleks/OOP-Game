public class Crossbowman extends Hero {
    int marksmanship;
    int arrows;

    public Crossbowman(String name, int stamina, String weapon, int marksmanship, int arrows) {
        super(name, stamina, weapon);
        this.marksmanship = marksmanship;
        this.arrows = arrows;
    }
    @Override
    public void attack(Hero target) {
        if (arrows > 0) {
            int damage = Hero.r.nextInt(attackPower * marksmanship);
            target.getDamage(damage);
        }
    }
}
