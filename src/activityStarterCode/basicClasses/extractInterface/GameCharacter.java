package activityStarterCode.basicClasses.extractInterface;

import java.util.Random;

public class GameCharacter {
    private static final Random rand = new Random();

    private final String name;
    private int hitPoints, mana;
    private final int swordMinDamage, swordMaxDamage;
    private final int fireballDamage;
    private final int fireballManaRequired;

    public GameCharacter(String name, int hitPoints, int mana, int swordMinDamage, int swordMaxDamage, int fireballDamage, int fireballManaRequired) {
        if ((swordMinDamage != 0 || swordMaxDamage != 0) && (fireballDamage != 0 || fireballManaRequired != 0)) {
            throw new IllegalArgumentException("Character cannot have both sword and fireball damage");
        }
        this.name = name;
        this.hitPoints = hitPoints;
        this.mana = mana;
        this.swordMinDamage = swordMinDamage;
        this.swordMaxDamage = swordMaxDamage;
        this.fireballDamage = fireballDamage;
        this.fireballManaRequired = fireballManaRequired;
    }
    public String attack(GameCharacter g1,GameCharacter g2){
    return attack(this,g2);
    }

    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getMana() {
        return mana;
    }

    public void takeDamage(int damage) {
        hitPoints = Math.max(0, hitPoints - damage);
    }

    public boolean useMana(int amount) {
        if (mana >= amount) {
            mana -= amount;
            return true;
        } else {
            return false;
        }
    }
    public int getSwordMaxDamage(){
        return this.swordMaxDamage;
    }
    public int getSwordMinDamage(){
        return this.swordMinDamage;
    }
    public int getFireballDamage(){
        return this.fireballDamage;
    }
    public int getFireballManaRequired(){
        return this.fireballManaRequired;
    }
}
