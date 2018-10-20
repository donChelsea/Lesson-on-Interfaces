package org.pursuit.Exercises;

import org.pursuit.Exercises.Bird;

public class Parrot extends Bird implements Flier{

    private static String food;
    private static int lifespan;
    private static String biome;

    public Parrot(String food, int lifespan, String biome) {
        this.food = food;
        this.lifespan = lifespan;
        this.biome = biome;
    }

    public static String getFood() {
        return food;
    }

    public static int getLifespan() {
        return lifespan;
    }

    public static String getBiome() {
        return biome;
    }

    public void printCharacteristics() {
        System.out.println("I am a " + this.getClass().getSimpleName()
                + ". I like to eat " + food
                + ". I live in the " + biome
                + ". I can live to be about " + lifespan + " years old.");
    }

    @Override
    public void fly() {
        System.out.println("I am flying using colorful feathers!");
    }
}
