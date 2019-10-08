package com.naver.t1;

public class Thread2 extends Thread{ //thread 클래스 상속

	@Override
	public void run() {
		this.test2();	
	}//run

	public void test2() {

		for(int i=0;i<10;i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("test2:"+i);
		}


	}//test2

}
