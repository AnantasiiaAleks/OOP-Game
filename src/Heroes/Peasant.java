package Heroes;

public class Peasant extends BaseChar {
    private int energy = 20;

    public Peasant(String name) {
        super(name, 100, 10, 10, 50, true);
    }

    @Override
    public void attack (BaseChar target) {
        int damage = BaseChar.r.nextInt(target.stamina / 5);
        target.getDamage(damage);
    }

    @Override
    public String toString() {
        return "Class " + this.getClass().getSimpleName() +
                " name: " + name + ", health: " + health;
    }

}
