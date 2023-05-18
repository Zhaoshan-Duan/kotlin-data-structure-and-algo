package javastuff.generics;

public class GenericsDemo {
    public static void main(String[] args) {
        IntegerPrinter printer = new IntegerPrinter(23);

        printer.print();

        GenericPrinter<Integer> integerPrinter = new GenericPrinter<>(23);
        GenericPrinter<Double> doublePrinter = new GenericPrinter<>(23.3333);
        GenericPrinter<String> StringPrinter = new GenericPrinter<>("Hello");


//        AnimalPrinter<Cat> printer1 = new AnimalPrinter<Cat>(new Cat());

    }
}
