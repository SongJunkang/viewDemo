package juc;

import ch.qos.logback.classic.turbo.TurboFilter;

import java.util.concurrent.*;

/**
 * @author Administrator
 * @version 1.0
 * @description TODO
 * @date 2023/4/10 16:56
 */
public class JUCTest {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        int processor = Runtime.getRuntime().availableProcessors();

//        开辟线程池：

        ExecutorService threadPool = Executors.newFixedThreadPool(processor);

//        Callable<String> MyThread = null;

        FutureTask<String> futureTask = new FutureTask<String >(new MyThread());

        Thread t1 = new Thread(futureTask);

        t1.start();

        System.out.println(futureTask.get());

    }

    static class MyThread implements Callable{

        @Override
        public Object call() throws Exception {

            System.out.println("----- come in call Function");

            return "hello callable;";
        }
    }

}
