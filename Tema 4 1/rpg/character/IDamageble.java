package rpg.character;

public interface IDamageble {
    double maxhealth();
    double health();
    boolean isDead();
    void receiversDamage(int amount);
    void heals(int amount);
}
