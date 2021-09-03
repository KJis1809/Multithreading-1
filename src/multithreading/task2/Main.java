package multithreading.task2;

import java.util.concurrent.*;

public class Main {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        final ExecutorService pool = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
        Callable<Integer> myCallable = new MyCallable();

        final Future<Integer> task1 = pool.submit(myCallable);
        final Future<Integer> task2 = pool.submit(myCallable);

        int resultOfTask1 = task1.get();
        System.out.println("Task1 messages count: " + resultOfTask1);

        int resultOfTask2 = task2.get();
        System.out.println("Task2 messages count: " + resultOfTask2);

        int resultOfAllTasks = resultOfTask1 + resultOfTask2;
        System.out.println("Total messages: " + resultOfAllTasks);

        pool.shutdown();
    }

}
