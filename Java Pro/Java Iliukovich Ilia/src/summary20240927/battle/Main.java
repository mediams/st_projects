package summary20240927.battle;

public class Main {
    public static void main(String[] args) {
        EvilCreature evilCreature = new EvilCreature("Noob", 30, 12);
        evilCreature.introduce();

        Weapon weapon = new Weapon("Sword", 160);
        Protection protection = new Protection("Defence", 7);

        Superhero superhero = new Superhero("SuperMax", 40, weapon, protection);
        superhero.introduce();

        superhero.fight(evilCreature);
    }
}
