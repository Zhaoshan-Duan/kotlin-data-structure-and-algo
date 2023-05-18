package javastuff.multithreading;

public class MyThread implements Runnable {
    private int threadNumber;

    public MyThread() {};
    public MyThread(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    @Override
    public void run() {
        for(int i = 1; i <= 5; i++) {
            System.out.println(i + "from Thread-" + threadNumber);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

//        for (int i = 1; i <= 5; i++) {
//            System.out.println(i + " from thread " + threadNumber);
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
    }
}
