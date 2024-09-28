public class Main {
    public static void main(String[] args) {
        EvilCreature evilCreature = new EvilCreature("Noob", 40,10);
        evilCreature.introduce();

        Weapon sword = new Weapon("Fire Sword", 260);
        Protection armor = new Protection("Dragon armor", 60);

        Superhero hero = new Superhero("Hero", 40, sword, armor);
        hero.introduce();

        hero.fight(evilCreature);

    }
}