package rpg.character.job;

import rpg.character.stat.*;

public class Unemployed extends Job{

    @Override
    public int modifier(Stat stat) {
        
        if (stat instanceof Strength){
            return 7;
        }
        if (stat instanceof Constitution){
            return 30;
        }
        if (stat instanceof Dexterity){
            return -10;
        }
        if (stat instanceof Intelligence){
            return -27;
        }

        return 0;

    }
}
