package com.benben.syn;

public class Demo2_Synchronized {

	/**
	 * 同步代码块
	 */
	public static void main(String[] args) {
		final Printer2 p = new Printer2();
		
		new Thread() {
			public void run() {
				while(true) {
					p.print1();
				}
			}
		}.start();
		
		new Thread() {
			public void run() {
				while(true) {
					p.print2();
				}
			}
		}.start();
	}

}

class Printer2 {
	Demo d = new Demo();
	//非静态的同步方法的锁对象是神马?
	//答:非静态的同步方法的锁对象是this
	//静态的同步方法的锁对象是什么?
	//是该类的字节码对象
	public static synchronized void print1() {
		//ͬ同步方法只需要在方法上加synchronized关键字即可
		System.out.print("天");
		System.out.print("有");
		System.out.print("地");
		System.out.print("值");

		System.out.print("下\r\n");
	}
	
	public  static  void print2() {
		//synchronized(new Demo()) {
		// 锁对象不能用匿名对象,因为匿名对象不是同一个对象
		synchronized(Printer2.class) { //静态方法不能用this
			System.out.print("天");
			System.out.print("有");
			System.out.print("地");
			System.out.print("值");

			System.out.print("下\r\n");
		}
	}
}

