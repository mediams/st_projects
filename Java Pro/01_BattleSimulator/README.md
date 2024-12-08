# SuperheroBattle

##

1. Create an abstract class `Character` with the fields `String name`, `int health` (initially set to 100), and a method `introduce()`. All characters in the game should inherit from this class.

2. Create the classes `EvilCreature`, `Superhero`, `Weapon`, and `Protection`.

`EvilCreature` has strength and protection but does not have armor or weapons.

`Superhero` has its own strength, armor, and weapons.

3. In the `main()` method of the `SuperheroBattle` class, create several `Superhero` and `EvilCreature` objects and output their states to the console.

4. Add the following methods to the `Character` class: 
   - `abstract int countForce()`
   - `abstract int countProtection()`
   - `void fight()`

The `fight()` method should be implemented using the abstract methods `countForce()` and `countProtection()`.

In a battle, the character with the higher strength wins.

The losing character loses health in proportion to the difference in strength and inversely proportional to their protection.

`fight() ---> health = health - (force1 - force2) / level`

5. In the `main()` method of the `SuperheroBattle` class, create battles between several characters.