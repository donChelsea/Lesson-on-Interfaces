package org.pursuit.Exercises;

public class FruitBat implements Flier{

    private static String food;
    private static String sleepStyle;
    private static String home;

    public FruitBat(String food, String sleepStyle, String home) {
        this.food = food;
        this.sleepStyle = sleepStyle;
        this.home = home;
    }

    public static String getFood() {
        return food;
    }

    public static String getSleepStyle() {
        return sleepStyle;
    }

    public static String getHome() {
        return home;
    }

    public void printCharacteristics() {
        System.out.println("I am a " + this.getClass().getSimpleName()
                + ". I like to eat " + food
                + ". I am " + sleepStyle
                + ". I live in a " + home + ".");
    }

    @Override
    public void fly() {
        System.out.println("I am flying using leathery wings!");
    }

}
