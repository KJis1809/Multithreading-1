package multithreading.task1;

class MyThread extends Thread {

    @Override
    public void run() {
        try {
            while(!isInterrupted()) {
                Thread.sleep(2000);
                System.out.println(Thread.currentThread().getName() + " Hi, everyone!");
            }
        } catch (InterruptedException e) {
            return;
        } finally {
            System.out.printf("%s завершен\n", Thread.currentThread().getName());
        }
    }
}

