package rpg.item.Food;

import rpg.character.Character;

public class PoisounousFood extends FoodDecorator{

    PoisounousFood(Food food){
        super(food);
        
    }

    @Override
    public void consumedBy(Character character) {
        character.receiversDamage(super.food.getPowerFood());
    }
}
