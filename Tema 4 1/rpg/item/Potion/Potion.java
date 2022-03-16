package rpg.item.Potion;

import rpg.character.Character;

public abstract class Potion implements PConsumable {
    private int healingPower;

    public void consumedBy(Character character){
        character.heals(healingPower);
    }

    public int getHealingPower(){ return healingPower;}
    public void setHealingPower(int healingPower){ this.healingPower = healingPower; }
}
