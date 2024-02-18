package Heroes;

public class Monk extends BaseChar {
    private int mana = 80;
    private int runePower = 100;


    public Monk(String name) {
        super(name, 100, 10, 10, 60, true);
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

    public int toHeal(BaseChar target, int runePower) {
            return BaseChar.r.nextInt(runePower);
    }

}
