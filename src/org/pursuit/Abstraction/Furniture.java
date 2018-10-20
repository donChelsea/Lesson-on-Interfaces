package org.pursuit.Abstraction;

    public abstract class Furniture {
        private static final int LEG_COUNT = 4;

        public static int getLegCount() {
            return LEG_COUNT;
        }

        public abstract void textileType();

        public void textileType2() {
            System.out.println("print something");
        }
        // child class can see this and will run it when called

    }

