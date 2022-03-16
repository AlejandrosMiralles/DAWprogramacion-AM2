package rpg.item.Food;

import rpg.character.Character;

public class EnhancedFoodDecorator extends FoodDecorator{
    private float enahnced;

    EnhancedFoodDecorator(Food food ,float enahnced){
        super(food);

        this.enahnced = enahnced;

        super.food.setPowerFood((int) (super.food.getPowerFood() * enahnced));
        
    }

    public float getEnhanced(){ return enahnced;}

    public void consumedBy(Character character){
        super.food.consumedBy(character);
    }
}
