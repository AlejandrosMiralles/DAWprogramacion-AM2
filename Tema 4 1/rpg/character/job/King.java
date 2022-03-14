package rpg.character.job;

import rpg.character.stat.*;

public class King extends Job {

    @Override
    public int modifier(Stat stat) {
        
        if (stat instanceof Strength){
            return 1;
        }
        if (stat instanceof Constitution){
            return 1;
        }
        if (stat instanceof Dexterity){
            return 1;
        }
        if (stat instanceof Intelligence){
            return 2;
        }

        return 0;

    }
}
