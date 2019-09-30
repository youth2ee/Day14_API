package com.naver.t1;

public class ThreadMain {

	public static void main(String[] args) {
		
		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();
		
		t1.start(); //os에게 실행시켜달라고 부탁한다.
		t2.start();
		
		//어떤것을 먼저하는지와 순서는 '운영체제 마음'	
		

	}

}
