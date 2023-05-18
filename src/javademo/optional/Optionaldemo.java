package javademo.optional;

import javademo.OOP.Cat;
import java.util.Optional;

public class Optionaldemo {
    public static void main(String[] args) {
        Optional<Cat> myCat = findCatByName("Fred");

        myCat.map(Cat::getAge).orElse(0);
    }

    private static Optional<Cat> findCatByName (String name) {
        Cat cat = new Cat(name, 3);
        cat = null;
        return Optional.ofNullable(cat);
    }
}
