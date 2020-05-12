package com.benben.threadmethod;

public class Demo3_Sleep {
    //休眠线程
    public static void main(String[] args) throws InterruptedException {
        new Thread(){
            @Override
            public void run() {
                for(int i=0;i<=100;i++){
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(getName()+"。。。bbb");
                }
            }
        }.start();


        new Thread(){
            @Override
            public void run() {
                for(int i=0;i<=100;i++){
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(getName()+"...aaaa");
                }

            }
        }.start();

    }
    public void demo1() throws InterruptedException {
        for(int i=20;i>=0;i--){
            Thread.sleep(1000);
            System.out.println("倒计时"+i+"秒");
        }
    }
}
