package opgave01.character;

import java.util.ArrayList;

public class Warrior extends Character {
    private ArrayList<Weapon> weapons = new ArrayList<>();

    public Warrior (String name, int level, ArrayList<Weapon> weapons){
        super(name,level);
        this.weapons = weapons;
    }
}
