package Heroes;

public class Sniper extends BaseChar {
    private int bullets = 100;

    public Sniper(String name) {
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
