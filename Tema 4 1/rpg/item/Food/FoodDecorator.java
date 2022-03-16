package rpg.item.Food;

public abstract class FoodDecorator extends Food {

    Food food;

    FoodDecorator(Food food){ this.food = food;}
}
