package com.benben.threadmethod;

public class Demo5_Join {
    public static void main(String[] args) {
        final Thread t1=new Thread(){
            @Override
            public void run() {
                //this.setName("ben");
                for(int i=0;i<10;i++){
                    System.out.println(this.getName()+"...aaaa");
                }
            }
        };

        Thread t2=new Thread(){
            @Override
            public void run() {
                //this.setName("ben");
                for(int i=0;i<10;i++){
                    if(i==2){
                        try {
                            t1.join();
                            //t1.join(1);    插队指定时间，过了指定时间，交替执行
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println(this.getName()+"...bbbb");
                }
            }
        };
        t1.start();
        t2.start();
        //匿名内部类在使用他所在方法中局部变量时，必须用final修饰
        //t1局部变量


    }
}
