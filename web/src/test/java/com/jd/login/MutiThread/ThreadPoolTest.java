package com.jd.login.MutiThread;

import com.alibaba.dubbo.common.json.JSON;
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
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        List<Future<Boolean>> results = new ArrayList<Future<Boolean>>(10);
        try{
            for(int i=0; i<10; i++){
                Future<Boolean> future = executorService.submit(new ActSKUCacheCallable(i, flag));
                if(false == future.get()){
                    //throw new Exception("4324");
                    return;
                }
                // results.add(future);
            }
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

    private class ActSKUCacheCallable implements Callable<Boolean> {
        int i;
        Boolean flag;
        ActSKUCacheCallable(int i, Boolean flag){
            this.i = i;
            this.flag = flag;
        }
        public Boolean call() throws Exception {
            try {
                if(i % 2 != 0){
                    throw new Exception("try");
                }
                System.out.println("正常执行");
            } catch (Exception e) {
                System.out.println("catch");
                //flag = false;
                //throw e;
                return Boolean.FALSE;
            } finally {
                System.out.println("finally 代码块" + flag);
            }

            System.out.println("try代码块外面");
            return Boolean.TRUE;
        }
    }
    BlockingQueue<Activity> queue = new ArrayBlockingQueue<Activity>(1 );
    private static final ExecutorService EXECUTE_EXECUTOR = Executors.newSingleThreadExecutor();

    @Test
    public void testQueue(){
        try{
            for(int i = 0 ; i<7 ; i++){
                int actId = 2951+i;
                Activity message = promotionRepository.selectActivity(actId);
                onMessage(message);
            }
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("fa");
        }

    }

    public void onMessage(Activity message){

        try{
            //LOGGER.info("actCreateMessage: {}", message);
            System.out.println("即将加入队列中的：" + JSON.toJSONString(message));

            queue.put(message);
            System.out.println("队列中的：" + JSON.toJSONString(queue));
            EXECUTE_EXECUTOR.submit(new ActicitySKUCache(queue));
        }catch(Exception e){
            //LOGGER.info("process actCreateMessage has exception, {}", e);
            throw new RuntimeException("process actCreateMessage has exception");
        }
    }

    private class ActicitySKUCache implements Runnable{
        private BlockingQueue<Activity> queue;

        public ActicitySKUCache(BlockingQueue queue){
            this.queue = queue;
        }
        public void run() {
            int  num=0;
            while(!queue.isEmpty()){
                System.out.println("异步队列中：" + JSON.toJSONString(queue));
                Activity message = new Activity();

                try{
                    message = queue.take();

                }catch (Exception e){
                    e.printStackTrace();
                }

                System.out.println("异步队列中要处理的：" + JSON.toJSONString(message));

                //String text = message.getText();
                //LOGGER.info("actCreateMessage, topic:{}, text:{}", message.getTopic(), text);
                //Activity activity = JSONObject.parseObject(text, Activity.class);
                for(int i = 0; i<10000;i++){
                    num++;
                    System.out.println("消息：" + message.getActivityId() + ", 第" + i + "次" + num + "Thread: " + Thread.currentThread().getName());

                }
                queue.remove(message);
                System.out.println("异步队列中处理后的：" + JSON.toJSONString(queue));

            }
        }
    }
}
