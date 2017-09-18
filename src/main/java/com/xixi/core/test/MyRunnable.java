package com.xixi.core.test;

public class MyRunnable implements Runnable {
	private int i = 0;

	@Override
	public void run() {
		System.out.println("测试" + i);
	}

	public MyRunnable() {

	}

	public MyRunnable(int i) {
		this.i = i;
	}

	public static void main(String args[]) {
		Thread t1 = new Thread(new MyRunnable(1));
		Thread t2 = new Thread(new MyRunnable(2));
		Thread t3 = new Thread(new MyRunnable(3));
		Thread t4 = new Thread(new MyRunnable(4));
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}
