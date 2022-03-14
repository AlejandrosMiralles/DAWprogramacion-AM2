package rpg.character.job;

import rpg.character.stat.*;

public class Warrior extends Job {

    @Override
    public int modifier(Stat stat) {
        
        if (stat instanceof Strength){
            return 3;
        }
        if (stat instanceof Constitution){
            return 2;
        }
        if (stat instanceof Dexterity){
            return 0;
        }
        if (stat instanceof Intelligence){
            return 0;
        }

        return 0;

    }
}
