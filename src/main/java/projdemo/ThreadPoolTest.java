package projdemo;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.*;

/**
 * @author Administrator
 * @version 1.0
 * @description TODO
 * @date 2023/3/13 16:59
 */

@Slf4j
public class ThreadPoolTest {

    public static void main(String[] args) throws InterruptedException {

        int processor = Runtime.getRuntime().availableProcessors();

        System.out.println("processor = " + processor);//4

        ExecutorService threadPool = Executors.newFixedThreadPool(processor);



        //下面的是源码自动封装好了的newFixedThreadPool。
//        ThreadPoolExecutor executor = new ThreadPoolExecutor(10,200,100,
//                TimeUnit.MINUTES,new LinkedBlockingQueue<Runnable>());
//
//
//        List<Runnable> runnables = executor.shutdownNow();



        List<Runnable> runnables1 = threadPool.shutdownNow();

        //计数器
        CountDownLatch countDownLatch = new CountDownLatch(processor);

//        Runnable task = new Runnable() {
//            @Override
//            public void run() {
//
//                System.out.println("执行任务拉");
//
//            }
//        };


//        threadPool.execute(task);

        

        String [] s = {"song","jun" ,"kang" };

        List<String[]> strings = Collections.singletonList(s);

//        final int[] i = {0};

        try {
            strings.forEach( a ->{

                        threadPool.execute(()->{

                            System.out.println(Arrays.toString(a));

                            //System.out.println(i[0]);//Variable used in lambda expression should be final or effectively final

                            //i[0]++;

                        });

                    }
            );
        } finally {


            countDownLatch.countDown();

            HashMap<Object, Object> objectObjectHashMap = new HashMap<>();


        }

        //阻塞到任务执行完成,当countDownLatch计数器归零，这里的阻塞解除
        //等待,给一个充裕的超时时间,防止无限等待，到达超时时间还没有处理完成则结束任务
        countDownLatch.await(30, TimeUnit.MINUTES);



    }

}
