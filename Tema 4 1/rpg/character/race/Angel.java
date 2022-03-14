package rpg.character.race;

import rpg.character.stat.*;

public class Angel extends Race{
    Angel(){ super();}

    @Override
    public int modifier(Stat stat) {
        
        if (stat instanceof Strength){
            return 0;
        }
        if (stat instanceof Constitution){
            return -10;
        }
        if (stat instanceof Dexterity){
            return 3;
        }
        if (stat instanceof Intelligence){
            return 7;
        }

        return 0;

    }
}
