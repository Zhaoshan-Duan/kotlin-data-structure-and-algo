package javademo.multithreading;

public class MainThread {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            MultiThreadThing myThing = new MultiThreadThing(i);
            Thread myThread = new Thread(myThing);
            myThread.start();
            try {
                myThread.join();
            } catch (InterruptedException e) {

            }
        }
    }
}
