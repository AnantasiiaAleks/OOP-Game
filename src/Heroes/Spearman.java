package Heroes;

public class Spearman extends BaseChar {
    private int energy = 50;

    public Spearman(String name) {
        super(name, 100, 50, 30, 80, true);
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
