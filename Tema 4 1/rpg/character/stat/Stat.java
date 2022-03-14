package rpg.character.stat;

public abstract class Stat {
    private int value;

    Stat(int value){
        this.value = value;
    }

    public int getValue(){ return value;}

    void increase(){ ++value;}
    void decrease(){ --value;}

    @Override
    public String toString(){ return "" + getClass().getSimpleName();}
}
