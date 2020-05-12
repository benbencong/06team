package com.benben.threadmethod;

public class Demo6_Yield {
    public static void main(String[] args) {
        new MyThread().start();
        new MyThread().start();

    }
}

class MyThread extends Thread{
    @Override
    public void run() {
        for(int i=0;i<20;i++){
            if(i%10==0){
                Thread.yield();  //让出cpu
            }
            System.out.println(getName()+"..."+i);
        }
    }
}