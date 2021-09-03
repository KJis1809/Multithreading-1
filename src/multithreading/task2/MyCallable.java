package multithreading.task2;

import java.util.Random;
import java.util.concurrent.Callable;

public class MyCallable implements Callable<Integer> {

    @Override
    public Integer call() {
        Random random = new Random();
        int count = 0;

        try {
            while (count < random.nextInt(10)) {
                System.out.println(Thread.currentThread().getName() + " Hi, everyone!");
                count++;
            }
        } catch (Exception e) {
        }
        return count;
    }

}

