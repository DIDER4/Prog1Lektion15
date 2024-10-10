package opgave01;

import opgave01.character.Barbarian;
import opgave01.character.Weapon;
import opgave01.character.Wizard;
import opgave01.models.Spell;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Weapon> FofstelrWeapons = new ArrayList<>();
        Barbarian barbarian = new Barbarian("Fofstelr",1, FofstelrWeapons);
        Weapon longsword = new Weapon ("LongSword");
        Weapon bow = new Weapon ("Bue");
        FofstelrWeapons.add(longsword);
        FofstelrWeapons.add(bow);

        ArrayList<Spell> WizardSpell = new ArrayList<>();
        Wizard wizard = new Wizard("Gandalf", 1, WizardSpell);


    }

}
