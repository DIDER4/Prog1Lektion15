package opgave01.character;

import opgave01.models.Spell;

import java.util.ArrayList;

public class Spellcaster extends Character{
    private ArrayList<Spell> spells = new ArrayList<>();

    public Spellcaster (String name, int level, ArrayList<Spell> spells){
        super(name,level);
        this.spells = spells;
    }
}
