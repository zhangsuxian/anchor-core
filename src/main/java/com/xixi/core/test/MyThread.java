package com.xixi.core.test;

public class MyThread extends Thread {
	private int i = 0;

	@Override
	public void run() {
		System.out.println("测试"+i);
	}

	public MyThread() {

	}

	public MyThread(int i) {
		this.i = i;
	}

	public static void main(String args[]) {
		Thread t1 = new MyThread(1);
		Thread t2 = new MyThread(2);
		Thread t3 = new MyThread(3);
		Thread t4 = new MyThread(4);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
//		t1.run();
//		t2.run();
//		t3.run();
//		t4.run();
	}

}
