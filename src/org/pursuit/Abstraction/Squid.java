package org.pursuit.Abstraction;

import org.pursuit.Abstraction.Cephalopod;

public class Squid extends Cephalopod implements Swimmer{

   private static int tentacleCount;

    public Squid(int tentacleCount) {
        this.tentacleCount = tentacleCount;
    }

    public static int getTentacleCount() {
        return tentacleCount;
    }

    public void printCharacteristics() {
        System.out.println("I am a " + this.getClass().getSimpleName()
                + ". We descended from Cephalopods.");
    }

    @Override
    public void tentaclesCount() {
        System.out.println("Squid Tentacle Count: " + tentacleCount);
    }

    @Override
    public void swim() {
        System.out.println("I am swimming using my siphons and fins!");
    }
}
