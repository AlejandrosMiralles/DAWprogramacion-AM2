package rpg.character.race;

import rpg.character.stat.*;

public class Elf extends Race {

    Elf(){ super();}

    @Override
    public int modifier(Stat stat) {
        
        if (stat instanceof Strength){
            return 0;
        }
        if (stat instanceof Constitution){
            return -1;
        }
        if (stat instanceof Dexterity){
            return 3;
        }
        if (stat instanceof Intelligence){
            return 3;
        }

        return 0;

    }
    
}
