package multithreading.task1;

public class Main {

    public static void main(String[] args) {
        ThreadGroup mainGroup = new ThreadGroup("mainGroup");
        MyThread myThread = new MyThread();

        Thread t1 = new Thread(mainGroup, myThread,"T1");
        Thread t2 = new Thread(mainGroup, myThread, "T2");
        Thread t3 = new Thread(mainGroup, myThread, "T3");
        Thread t4 = new Thread(mainGroup, myThread, "T4");

        System.out.println("Creating threads...");

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        try {
            Thread.sleep(15000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        mainGroup.interrupt();
    }

}
