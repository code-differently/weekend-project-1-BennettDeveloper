package org.codedifferently;

import java.util.Random;

public class MathCalc {

    public int generateRandomID(int lowerBound, int upperBound) {
        Random random = new Random();
        return random.nextInt((upperBound - lowerBound) + 1) + lowerBound;
    }
}
