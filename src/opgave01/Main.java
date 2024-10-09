package opgave01;

import opgave01.character.Warrior;
import opgave01.weapons.Weapon;

public class Main {
    public static void main(String[] args) {
        Warrior myWarrior = new Warrior();
        Weapon longsword = new Weapon ("LongSword");
        Weapon bow = new Weapon ("Bue");
        myWarrior.addWeapon(longsword);
        myWarrior.addWeapon(bow);
        myWarrior.listWeapons();

    }

}
