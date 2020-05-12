package com.benben.Thread;

public class demo3 {
    //匿名内部类实现线程的两种方式
    public static void main(String[] args) {
        /*
        1\继承Thread
        2、重写run方法
        3、将要执行的代码写在run方法中
        4、开启线程
         */
        new Thread(){
            public void run(){
                for(int i=0;i<=100;i++){
                    System.out.println("aaa");
                }
            }
        }.start();
          /*
        1、将Runnable的字类对象传递给Thread的构造方法
        2、重写run方法
        3、将要执行的代码写在run方法中
        4、开启线程
         */
        new Thread(new Runnable(){
            @Override
            public void run() {
                for(int i=0;i<=100;i++){
                    System.out.println("bbb");
                }
            }
        }).start();
    }
}
