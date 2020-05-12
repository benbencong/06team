package com.benben.threadmethod;

public class Demo1_Name {
    //获取名字和设置名字
    public static void main(String[] args) {
        new Thread(){
            @Override
            public void run() {
                this.setName("ben");
                System.out.println(this.getName()+"...aaaa");
            }
        }.start();

        Thread t1=new Thread(){
            @Override
            public void run() {
                //this.setName("ben");
                System.out.println(this.getName()+"...aaaa");
            }
        };
        t1.setName("lll");
        t1.start();
    }
    public void Demo1(){
        //不写默认是Thread-0（第几个线程）
        new Thread(){
            public void run(){
                System.out.println(this.getName()+"aaaa");
            }
        }.start();
        new Thread("benebn"){
            public void run(){
                System.out.println(this.getName()+"bbb");
            }
        }.start();
    }
}
