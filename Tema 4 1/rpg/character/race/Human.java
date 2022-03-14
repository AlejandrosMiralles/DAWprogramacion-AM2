package rpg.character.race;

import rpg.character.stat.*;

public class Human extends Race{
    Human(){ super();}

    @Override
    public int modifier(Stat stat) {
        if (stat instanceof Strength){
            return 2;
        }
        if (stat instanceof Constitution){
            return 2;
        }
        if (stat instanceof Dexterity){
            return 1;
        }
        if (stat instanceof Intelligence){
            return 0;
        }

        return 0;
    }
}
