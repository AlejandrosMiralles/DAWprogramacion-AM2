package rpg.character;

import rpg.character.stat.*;

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

    public Character(String name, Job job, Race race, Strength migth, Intelligence clever, Dexterity dexter) {
        this.name = name;
        this.job = job;
        this.race = race;
        this.migth = migth;
        this.clever = clever;
        this.dexter = dexter;
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
        return 2 * (constitir.getValue() + race.modifier(constitir) +
                    job.modifier(constitir));
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
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public boolean isDead() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public void receiversDamage(int amount) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void heals(int amount) {
        // TODO Auto-generated method stub
        
    }
}
