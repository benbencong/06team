package com.benben.threadmethod;

public class Demo4_Daemon {
    public static void main(String[] args) {
        Thread t1=new Thread(){
            @Override
            public void run() {
                //this.setName("ben");
                for(int i=2;i>=0;i--){
                    System.out.println(this.getName()+"...aaaa");
                }
            }
        };

        Thread t2=new Thread(){
            @Override
            public void run() {
                //this.setName("ben");
                for(int i=60;i>=0;i--){
                    System.out.println(this.getName()+"...bbbb");
                }
            }
        };
        //设置守护线程
        t2.setDaemon(true);
        t1.start();
        t2.start();
    }
}
