package com.naver.t1;

public class Thread1 extends Thread{ //thread 클래스 상속
	
	@Override
	public void run() {
		this.test1();
	}
	
	public void test1() {
		
		for(int i=0;i<10;i++) {
			try {
				Thread.sleep(1000);
				//1초동안 자고 실행해
				//miliseconds = 1/1000초
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
			
			System.out.println("test1:"+i);
			
		}
		
	}

}
