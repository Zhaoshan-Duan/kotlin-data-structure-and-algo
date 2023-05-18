package javastuff.multithreading;

public class MainThread {
    public static void main(String[] args) {

        for (int i = 0; i < 3; i++) {
            Thread t = new Thread(new MyThread(i));
            t.getState(); // New
            t.start();
            t.getState(); // Runnable
        }

    }

}
