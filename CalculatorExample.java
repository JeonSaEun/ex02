package com.zerock.ex02;

public class CalculatorExample {

	public static void main(String[] args) {
		// 1. 전자계산기 객체 생성
		Calculator myCalc = new Calculator();
		
		// 2. 전자계산기의 전원을 켬
		myCalc.powerOn();
		
		// 3. 전자계산기의 덧셈기능 수행
		int result1 = myCalc.plus(5, 6);
		
		System.out.println("result1: " + result1);
		
		// 4. 전자계산기의 나눗셈 기능 수행
		byte x = 10;
		byte y = 4;
		double result2 = myCalc.divide(x, y);
		
		System.out.println("result2: " + result2);
		
		// 5. 전자계산기의 전원을 끔
		myCalc.powerOff();
		
	} // main
	
} // end class
