package rpg.character.race;

import rpg.character.stat.Stat;

public abstract class Race {
    public abstract int modifier(Stat stat);

    @Override
    public boolean equals(Object object){
        if (getClass().getSimpleName() == object.getClass().getSimpleName()){
            return true;
        }

        return false;
    }

    @Override
    public String toString(){ return "" + getClass().getSimpleName();}

}
