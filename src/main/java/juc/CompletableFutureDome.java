package juc;

import java.util.concurrent.*;

/**
 * @author Administrator
 * @version 1.0
 * @description TODO
 * @date 2023/4/13 9:41
 */
public class CompletableFutureDome {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService threadPool = Executors.newFixedThreadPool(3);


        CompletableFuture<Integer> completableFuture = null;
        try {
            completableFuture = CompletableFuture.supplyAsync(()->{

                System.out.println(Thread.currentThread().getName()+ "---->come in");

                int result = ThreadLocalRandom.current().nextInt(10);

                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("一秒钟出结果"+result);

                if (result > 2) {

                    int i = 10/0;
                }

                return result;

            },threadPool).whenComplete((v,e) ->{
                if (e ==null){
                    System.out.println("-------计算完成，更新系统updateValue" +v );

                }


            }).exceptionally( e->{

                e.printStackTrace();
                System.out.println("异常情况" +e.getCause() +"\t" +e.getMessage());
                return null;
            });


            System.out.println(Thread.currentThread().getName()+ "线程先忙其它任务");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        System.out.println(completableFuture.get());

    }

    private static void doFuture() throws InterruptedException, ExecutionException {
        CompletableFuture<Integer> completableFuture = CompletableFuture.supplyAsync(()->{

            System.out.println(Thread.currentThread().getName()+ "---->come in");

            int result = ThreadLocalRandom.current().nextInt(10);

            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("一秒钟出结果"+result);

            return result;

        });


        System.out.println(Thread.currentThread().getName()+ "线程先忙其它任务");

        System.out.println(completableFuture.get());
    }
}
