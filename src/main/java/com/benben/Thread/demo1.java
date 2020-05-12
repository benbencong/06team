package com.benben.Thread;

public class demo1 {
    public static void main(String[] args) {
        MyThread mt=new MyThread();   //4、创建线程类的字类对象
        mt.run();//只是调用run方法，并没有开启线程
        mt.start();//5、开启线程
        for (int i=0;i<100;i++){
            System.out.println("bbb");
        }
    }
}
class Demo{
    @Override
    protected void finalize() {
        System.out.println("垃圾被回收");
    }
}
class MyThread extends Thread{
    /*
    1、继承Thread
    2、重写run方法
    3、将要执行的代码写在run方法中
     */
    public void run(){
        for (int i=0;i<100;i++){
            System.out.println(i);
        }
    }
}
