package rpg.character.job;

import rpg.character.stat.*;

public class Mage extends Warrior {
    @Override
    public int modifier(Stat stat) {
        
        if (stat instanceof Strength){
            return 0;
        }
        if (stat instanceof Constitution){
            return 0;
        }
        if (stat instanceof Dexterity){
            return 1;
        }
        if (stat instanceof Intelligence){
            return 4;
        }

        return 0;

    }
}
