package com.benben.threadmethod;

public class Demo7_Priority {
    //线程的优先级
    public static void main(String[] args) {
        Thread t1=new Thread(){
            @Override
            public void run() {
                for(int i=60;i>=0;i--){
                    System.out.println(this.getName()+"...aaaa");
                }
            }
        };

        Thread t2=new Thread(){
            @Override
            public void run() {
                for(int i=60;i>=0;i--){
                    System.out.println(this.getName()+"...bbbb");
                }
            }
        };
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();
    }
}
