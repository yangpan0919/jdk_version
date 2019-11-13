package jdk8.Demo3;

import java.time.Instant;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Demo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        long start = Instant.now().toEpochMilli();
        int temp = 0;
        for (int i = 0; i < 100000; i++) {
            int finalTemp = temp;
            CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> {
//            int i = 1/0;
                return finalTemp + 100;
            }).thenApplyAsync((x) -> {
//                System.out.println(x);
                int num = x + 100;
                return num;
            });
//future.join();
            Integer integer = future.get();
//            System.out.println(integer);
        }
        long step1 = Instant.now().toEpochMilli();
        temp = 0;
        for (int i = 0; i < 100000; i++) {
            int finalTemp1 = temp + 100;
            Integer integer = finalTemp1 + 100;

//            System.out.println(integer);
        }
        long step2 = Instant.now().toEpochMilli();

        System.out.println(step1 - start);
        System.out.println(step2 - step1);

    }
}
