package org.pursuit.Abstraction;

public class Chair extends Furniture{

    @Override
    public void textileType() {

    }

    @Override
    public void textileType2() {
        super.textileType2(); // can run the code from the parent class
        // or run it's own code that will override what is already in the parent
    }
}
