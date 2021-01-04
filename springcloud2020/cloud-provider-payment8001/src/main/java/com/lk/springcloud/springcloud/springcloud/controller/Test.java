package com.lk.springcloud.springcloud.springcloud.controller;

import java.util.LinkedList;
import java.util.Queue;

public class Test {
    public static void main(String[] args) throws InterruptedException {
//        person person = new person();
//        int i=0;
//        while (true){
//            person.addInt(i);
//            System.out.println("队列添加数据："+i);
//            i+=10;
//            Thread.sleep(1000);
//        }
        Queue<Integer> queue=new LinkedList<>();
        queue.offer(1);

        System.out.println(queue.toString());
        System.out.println(queue.peek());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.toString());

    }
}
class person{
    private Queue<Integer> queue;
    public person(){
        queue=new LinkedList<>();
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true){
                    if(queue.peek() != null){
                        System.out.println("队列取出数据："+queue.poll());
                    }else {
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }).start();
    }
    public void addInt(Integer i){
        queue.offer(i);
    }
}
