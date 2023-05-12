package juc;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadLocalRandom;

/**
 * @author Administrator
 * @version 1.0
 * @description TODO
 * @date 2023/4/13 12:45
 */
public class CompletableFutureDome2 {
    /**
    * @description TODO
    * @param
    * @return
    * @author
    * @date
    */

    public static void main(String[] args) {

        ExecutorService threadPool = Executors.newFixedThreadPool(3);


//        CompletableFuture<Void> co = CompletableFuture.supplyAsync(() -> {
//
//
//            System.out.println(Thread.currentThread().getName() + "---->come in");
//
//            int result = ThreadLocalRandom.current().nextInt(10);
//
//            return result;
//        }, threadPool).thenRunAsync(() -> {
//            System.out.println("处理完成");
//        });


        CompletableFuture<Integer> completableFuture1 = CompletableFuture.supplyAsync(() -> {


            System.out.println(Thread.currentThread().getName() + "---->come in");

            int result = ThreadLocalRandom.current().nextInt(10);



            return result;
        });

        CompletableFuture<Integer> integerCompletableFuture = completableFuture1.thenCombine(completableFuture1, (x, y) -> {

            System.out.println("两个结果集合并");
            return x + y;
        });

        System.out.println(integerCompletableFuture.join());

    }




}
