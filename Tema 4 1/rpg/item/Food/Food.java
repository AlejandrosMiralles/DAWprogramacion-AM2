package rpg.item.Food;

import rpg.character.Character;

public abstract class Food implements IConsumable {
    int powerFood;

    public void consumedBy(Character character){
        character.heals(powerFood);
    }
}