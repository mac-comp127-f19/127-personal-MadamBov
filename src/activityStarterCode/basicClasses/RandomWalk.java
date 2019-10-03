package activityStarterCode.basicClasses;

import java.util.Random;

/**
 * Represents a random walk along the integer
 * number line starting at some value. At each step it either moves
 * forward or backward by one unit.
 */
public class RandomWalk {
    private Random rng;

    /**
     * Creates a new random walk starting with some initial value.
     * TODO: Adjust this constructor to take an initial value for the walk.
     */
    int currentWalkvalue;
    public RandomWalk(int walkValue) {
        rng = new Random();
        currentWalkvalue=walkValue;
    }

    /**
     * TODO Complete me.
     * @return the current value for the random walk.
     */
    public int getValue() {
        return currentWalkvalue;
    }

    /**
     * Updates the value randomly by adding either +1 or -1.
     * TODO: Complete me.
     * @return Updated value.
     */
    public int advanceValue() {
        Random randBoolean= new Random();
        int newWalkValue=currentWalkvalue;
        if (randBoolean.nextBoolean()){
            newWalkValue++;
        }
        else{newWalkValue--;}
        return newWalkValue;
    }
}

