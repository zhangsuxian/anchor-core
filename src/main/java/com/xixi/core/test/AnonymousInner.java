package com.xixi.core.test;

public class AnonymousInner {
	public static void main(String args[]) {
		new Thread(new Runnable() {
			public void run() {
				System.out.println(1);
			}
		}).start();
	}
}
