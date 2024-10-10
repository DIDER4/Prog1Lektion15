package opgave01.character;

import opgave01.models.Spell;

import java.util.ArrayList;

public class Wizard extends Spellcaster {
    public Wizard(String name, int level, ArrayList<Spell> spells) {
        super(name, level, spells);
    }
}
