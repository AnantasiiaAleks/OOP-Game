package Heroes;

public class Mage extends BaseChar {
    private int mana = 100;

    public Mage(String name) {
        super(name, 100, 30, 40, 60, true);
    }
    @Override
    public void attack (BaseChar target) {
        int damage = BaseChar.r.nextInt(target.stamina / 40);
        target.getDamage(damage);
    }

    @Override
    public String toString() {
        return "Class " + this.getClass().getSimpleName() +
                " name: " + name + ", health: " + health;
    }
}
