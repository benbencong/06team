package com.benben.Thread;

public class demo2 {
    //多线程实现Runnable的原理
    public static void main(String[] args) {
        /*
        //4、创建Runnable的子类对象
        5、将其当作参数传递给Thread的构造函数
        6、开启线程

         */
        MyRunnable mr=new MyRunnable();
        Thread t=new Thread(mr);
        t.start();
        for (int i=0;i<100;i++){
            System.out.println("bbb");
        }

    }
}
class MyRunnable implements Runnable{
    /*
       1、定义一个类实现Runnable
       2、重写run方法
       3、将要执行的代码写在run方法中
        */
    public void run() {
        for(int i=0;i<100;i++){
            System.out.println("nnn");
        }
    }
}