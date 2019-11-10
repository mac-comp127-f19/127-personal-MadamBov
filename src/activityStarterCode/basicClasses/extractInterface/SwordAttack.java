package activityStarterCode.basicClasses.extractInterface;

import java.util.Random;

public class SwordAttack implements Attack{

    @Override
    public String attack(GameCharacter gameCharacter1, GameCharacter gameCharacter2) {
        Random rand=new Random();
        int damage = rand.nextInt(gameCharacter1.getSwordMaxDamage() - gameCharacter1.getSwordMinDamage() + 1) + gameCharacter1.getSwordMinDamage();
        gameCharacter2.takeDamage(damage);
        return gameCharacter1.getName() + " struck " + gameCharacter2.getName() + " with a sword for "
                + damage + " points of damage";
    }
}
