package rpg.character.race;

import rpg.character.stat.*;

public class Demon extends Race {
    Demon(){
        super();
    }

    @Override
    public int modifier(Stat stat) {
        
        if (stat instanceof Strength){
            return 10;
        }
        if (stat instanceof Constitution){
            return 7;
        }
        if (stat instanceof Dexterity){
            return -2;
        }
        if (stat instanceof Intelligence){
            return -15;
        }

        return 0;

    }
}
