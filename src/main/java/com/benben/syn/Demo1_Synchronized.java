package com.benben.syn;

public class Demo1_Synchronized {
    /*
    同步代码块
     */
    public static void main(String[] args) {
        final Printer p=new Printer();
        new Thread(){
            @Override
            public void run() {
                int j=0;
                while (j<100){
                    p.print1();
                    j++;
                }
            }
        }.start();
        new Thread(){
            @Override
            public void run() {
                int i=0;
                while (i<100){
                    p.print2();
                    i++;
                }
                }
        }.start();

    }
}
class Printer{
    Demo d=new Demo();
    public void print1(){

        synchronized (d){
            System.out.print("我");
            System.out.print("加");
            System.out.print("油");
            System.out.print("啦");
            System.out.print("是\r\n");
        }

    }
    public void print2(){
       // synchronized (new Demo())  锁对象不能用匿名对象，因为匿名对象不是同意给锁
        synchronized (d){   //同步代码块，锁机制,锁对象可以是任意的，，锁对象不能用匿名对象，因为匿名对象不是同一个对象
            System.out.print("天");
            System.out.print("有");
            System.out.print("地");
            System.out.print("值");

            System.out.print("下\r\n");
        }

    }
}
class Demo{

}
