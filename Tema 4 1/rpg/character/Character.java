package rpg.character;

import rpg.character.stat.*;
import rpg.item.Food.IConsumable;
import rpg.character.job.*;
import rpg.character.race.*;

public class Character implements IDamageble {
    private String name;
    private Job job;
    private Race race;

    private Strength migth;
    private Intelligence clever;
    private Constitution constitir;
    private Dexterity dexter;

    private double health;

    public Character(final String name, final Job job, final Race race, final Strength migth, final Intelligence clever, final Dexterity dexter) {
        this.name = name;
        this.job = job;
        this.race = race;
        this.migth = migth;
        this.clever = clever;
        this.dexter = dexter;

        health = 2 * (constitir.getValue() + race.modifier(constitir) +
        job.modifier(constitir));
    }

    public String getName() { return name;}

    public Job getJob() { return job;}

    public Race getRace() { return race; }

    public double power() {
        return 2 * (migth.getValue() +
                     race.modifier(migth) + job.modifier(migth)) ;
    }

    public double magic() {
        return 2 * (clever.getValue() + race.modifier(clever) +
                    job.modifier(clever));
    }

    public double velocity() {
        return 2 * (dexter.getValue()+ race.modifier(dexter) +
                    job.modifier(dexter));
    }

    public double health(){
        return health;
    }
    
    @Override
    public String toString(){
        String name, job, race, stats;
        name = "Hello, my name is " + this.name;
        job = this.toString();
        race = this.race.toString();
        stats = "My are stats are: Strength: "+ migth.getValue() +
                 " Dexterity: " + dexter +
                 " Constitution: " + constitir.getValue() +
                 " Intelligence: "+ clever.getValue() +
                 " Velocity: " + velocity() +
                 " Power: " + power() +
                 " Magic: " + magic() +
                 " Health: "+ health();
        return name + job + race + stats;
    }

    @Override
    public double maxhealth() {
        return  2 * (constitir.getValue() + race.modifier(constitir) +
        job.modifier(constitir));
    }

    @Override
    public boolean isDead() {
        if (health <= 0){
            return true;
        }

        return false;
    }

    @Override
    public void receiversDamage(final int amount) {
        health-= amount;

        if (isDead()){ health = 0;}

        System.out.print(name+" received "+amount+" damage.");
        System.out.println("\tHealth: "+health+"/"+maxhealth());
    }

    @Override
    public void heals(final int amount) {
        health+= amount;

        if (health> maxhealth()){ health = maxhealth();}

        System.out.print(name+" healed "+amount+" life.");
        System.out.println("\tHealth: "+health+"/"+maxhealth());
    }

    public void consume(IConsumable consumable){
        consumable.consumedBy(this);

        System.out.println(name + " consumed: "+ consumable.getClass().getSimpleName());
    }
}
