package org.pursuit;

import org.pursuit.Abstraction.Octopus;
import org.pursuit.Abstraction.Squid;
import org.pursuit.Exercises.FruitBat;
import org.pursuit.Exercises.Parrot;
import org.pursuit.Vehicle_Example.Vehicle;

public class Main {

    public static void main(String[] args) {

        Vehicle accord = new Vehicle("Honda", "Accord");
        accord.drive(20);

        Parrot parrot = new Parrot("fruits", 10, "tropics");
        parrot.printCharacteristics();
        parrot.fly();

        FruitBat fruitbat = new FruitBat("berries", "nocturnal", "cave");
        fruitbat.printCharacteristics();
        fruitbat.fly();

        Octopus octopus = new Octopus(8);
        octopus.tentaclesCount();
        octopus.printCharacteristics();
        octopus.swim();

        Squid squid = new Squid(10);
        squid.tentaclesCount();
        squid.printCharacteristics();
        squid.swim();
    }

}


// methods that give the subclasses ability from the outside
// uses a common denominator to give the same functionality
// when creating, only use the keyword VOID as public would be redundant

//abstract classes cannot be extended and cannot be instantiated.
// only composed of methods without brackets for original code blocks
// main purpose is to define a method signature
// methods are forced to be implemented in the subclass
// meaning you must have it in the class, cannot NOT be used
