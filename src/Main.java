public class Main {
    public static void main(String[] args) {

        Hero hero1 = new Peasant("Крестьянин", 10, "Вилы", 5, 5);
        Hero hero2 = new Rogue("Разбойник", 15, "Кинжалы", 10, 10);
        Hero hero3 = new Sniper("Дедшот", 10, "Винтовка", 10, 15);
        Hero hero4 = new Mage("Джайна", 10, "Посох", 13, 18);
        Hero hero5 = new Spearman("Копейщик", 10, "Копье", 12, 10);
        Hero hero6 = new Crossbowman("Арбалетчик", 10, "Арбалет", 10, 15);
        Hero hero7 = new Monk("Монах", 10, "Посох", 15, 20, 17);
        System.out.println(hero1 + "\n" + hero2 + "\n" + hero3 + "\n"
        + hero4 + "\n" + hero5 + "\n" + hero6 + "\n" + hero7);
    }
}