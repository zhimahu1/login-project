package com.jd.login.MutiThread;

import com.alibaba.fastjson.JSON;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/**
 * Created by huyanxia on 2018/5/13.
 */
public class ThreadPoolTest {
    @Test
    public void testException(){
        try{
            testExecutorServiceException();
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("fa");
        }

    }
    public void testExecutorServiceException() throws Exception{
        Boolean flag = true;
        //线程池，一个线程，线程池内部的任务是异步串行执行
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        //results中存放任务执行的结果
        List<Future<Boolean>> results = new ArrayList<Future<Boolean>>(10);

        try{
            for(int i=0; i<10; i++){
                Future<Boolean> future = executorService.submit(new ActSKUCacheCallable(i, flag));
               /* if(false == future.get()){
                    //throw new Exception("4324");
                    //return;
                }*/
                //收集任务执行的结果，存储在results中
                results.add(future);
            }
            //主线程中执行，所以flag的值不一定是异步任务处理后的结果
            System.out.println("结果:" + flag);
            for(int i=0; i<10; i++){
                boolean flag1 = results.get(i).get();
                System.out.println("执行结果：" + flag1);
            }

        }catch(Exception e){
            //e.printStackTrace();
            throw e;
        }
    }

    private void testCompletionService(){
        ExecutorService executorService = Executors.newFixedThreadPool(20);
        BlockingQueue<Boolean> booleanBlockingQueue = new LinkedBlockingQueue<Boolean>();
        CompletionService completionService = new ExecutorCompletionService(executorService, booleanBlockingQueue);
        boolean flag = true;
        for(int i=0; i<10; i++){
            completionService.submit(new ActSKUCacheCallable(i, flag));
        }
        try{
            Future<Boolean> future = completionService.take();
        }catch(Exception e){
            e.printStackTrace();

        }
    }

    private class ActSKUCacheCallable implements Callable<Boolean> {
        int i;
        Boolean flag;
        ActSKUCacheCallable(int i, Boolean flag){
            this.i = i;
            this.flag = flag;
        }
        public Boolean call() throws Exception {
            try {
                i++;
                //这里抛出异常会通过future.get获得
                throw new Exception("异常");
            } catch (Exception e) {
                System.out.println("catch");
                //flag = false;
                //抛出异常不影响线程池中其他任务的执行
                throw e;
                //return Boolean.FALSE;
            } finally {
                System.out.println("finally 代码块" + flag);
            }

            //System.out.println("try代码块外面");
            //return Boolean.TRUE ;
        }
    }
    private class SumCallable implements Callable<Integer> {
        int i;
        Integer result;
        SumCallable(int i){
            this.i = i;
            this.result = result;
        }
        public Integer call() throws Exception {
            try {
                result += i;
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                System.out.println("finally 代码块" + result);
            }

            System.out.println("try代码块外面");
            return result;
        }
    }
}
