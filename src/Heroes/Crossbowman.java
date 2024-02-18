package Heroes;

public class Crossbowman extends BaseChar {
    private int arrows = 100;

    public Crossbowman(String name) {
        super(name, 100, 30, 40, 60, true);
    }

    @Override
    public void attack (BaseChar target) {
        int damage = BaseChar.r.nextInt(target.stamina / 30);
        target.getDamage(damage);
    }

    @Override
    public String toString() {
        return "Class " + this.getClass().getSimpleName() +
                " name: " + name + ", health: " + health;
    }
}
