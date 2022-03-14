package rpg.character.job;

import rpg.character.stat.*;


public abstract class Job {
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
