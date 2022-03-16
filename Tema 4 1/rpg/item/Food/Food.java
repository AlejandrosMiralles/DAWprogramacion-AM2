package rpg.item.Food;

import rpg.character.Character;

public abstract class Food implements IConsumable {
    private int powerFood;

    public void consumedBy(Character character){
        character.heals(powerFood);
    }

    public int getPowerFood(){ return powerFood;}
    public void setPowerFood(int powerFood){ this.powerFood = powerFood; }
}