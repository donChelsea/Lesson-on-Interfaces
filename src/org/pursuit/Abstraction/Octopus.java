package org.pursuit.Abstraction;

public class Octopus extends Cephalopod implements Swimmer{

    private static int tentacleCount;

    public Octopus(int tentacleCount) {
        this.tentacleCount = tentacleCount;
    }

    public static int getTentacleCount() {
        return tentacleCount;
    }

    public void printCharacteristics() {
        System.out.println("I am an " + this.getClass().getSimpleName()
                + ". We descended from Cephalopods.");
    }

    @Override
    public void tentaclesCount() {
        System.out.println("Octopus Tentacle Count: " + tentacleCount);
    }

    @Override
    public void swim() {
        System.out.println("I am swimming using only my siphons!");
    }
}
