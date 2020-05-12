package com.benben.threadmethod;

public class Demo2_CurrentThread {
    public static void main(String[] args) {
        new Thread(){
            @Override
            public void run() {
                System.out.println(getName()+"...aaaa");
            }
        }.start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                //Thread.currentThread() 获取当前线程
                System.out.println(Thread.currentThread().getName() + "...bbb");
            }
        }).start();
        Thread.currentThread().setName("主线程");
        System.out.println(Thread.currentThread().getName());
    }
}
