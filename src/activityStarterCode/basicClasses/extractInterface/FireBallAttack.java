package activityStarterCode.basicClasses.extractInterface;

public class FireBallAttack implements Attack {
    @Override
    public String attack(GameCharacter gameCharacter1, GameCharacter gameCharacter2) {
        if (gameCharacter1.useMana(gameCharacter1.getFireballManaRequired())) {
            gameCharacter1.takeDamage(gameCharacter1.getFireballDamage());
            return gameCharacter1.getName() + " hit " + gameCharacter2.getName() + " with a fireball for "
                    + gameCharacter1.getFireballDamage() + " points of damage";
        } else {
            return gameCharacter1.getName() + " did not have enough mana for a fireball attack";
        }
    }
}
