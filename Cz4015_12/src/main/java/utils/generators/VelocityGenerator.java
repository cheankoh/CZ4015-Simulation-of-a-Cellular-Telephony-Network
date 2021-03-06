package utils.generators;

import java.util.Random;

public class VelocityGenerator {
    private static final double MEAN = 120.07209801685764;
    private static final double STANDARD_DEVIATION = 9.01860693373;

    private Random rand;

    public VelocityGenerator(){
        rand = new Random();
    }
    public double generateVelocity(){
        //Use inverse transform to make a exponentially distributed number with mean provided
        return rand.nextGaussian() * STANDARD_DEVIATION + MEAN;
    }
}
