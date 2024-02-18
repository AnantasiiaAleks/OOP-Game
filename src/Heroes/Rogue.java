package Heroes;

public class Rogue extends BaseChar {
    private int energy = 50;

    public Rogue(String name) {
        super(name, 100, 40, 30, 60, true);
    }

    @Override
    public void attack (BaseChar target) {
        int damage = BaseChar.r.nextInt(target.stamina / 20);
        target.getDamage(damage);
    }

    @Override
    public String toString() {
        return "Class " + this.getClass().getSimpleName() +
                " name: " + name + ", health: " + health;
    }
}
