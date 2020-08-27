package com.zerock.ex02;

public class Car1Example {

	// 객체 생성시 생성자 내부에서 예외가 발생하면
	// NEW 연산자의 역할인 객체생성은 무력화된다
	public static void main(String[] args) {
		Car1 myCar = null;
		
		try {
			
			myCar = new Car1("검정", 3000);
			
		} catch (Exception e) {
			
			System.err.println("- myCar: " + myCar);
			
		} // try-catch
		
			
		//Car1 myCar = new Car1();	(x)
	} // main
	
} // end class
