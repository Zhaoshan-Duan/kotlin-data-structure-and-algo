package javademo.java8.lambda;

public class Lambdas {
    public static void main(String[] args) {
        printThing(() -> System.out.println("Meow!"));
    }

    public static void printThing(Printable thing) {
        thing.print();
    }
}
