package javastuff.generics;

import javademo.OOP.Animal;

import java.io.Serializable;

public class AnimalPrinter <V, T extends Animal & Serializable> {
    T thingToPrint;
    V anotherThing;

    public AnimalPrinter(T thingToPrint) {
        this.thingToPrint = thingToPrint;
    }

    public void print() {
        thingToPrint.eat();
        System.out.println(thingToPrint);
    }

    private static <T> void shout (T thingtoShout) {
        System.out.println(thingtoShout + "!!!");
    }
}
