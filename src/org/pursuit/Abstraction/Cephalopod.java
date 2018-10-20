package org.pursuit.Abstraction;

public abstract class Cephalopod {

    public void ancestor() {
        System.out.println("I am a " + this.getClass().getSimpleName()
                + ". Cephalopods descended from Mollusks.");
    }

    public abstract void tentaclesCount();
}
