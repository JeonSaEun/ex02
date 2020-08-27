package com.zerock.ex02;

public class Calculator {
	
	// 메소드
	void powerOn() {
		System.out.println("전원을 켭니다.");
		
	} // powerOn
	
	int plus(int x, int y) {
		int result = x + y;
		
		return result;
	} // plus
	
	double divide(int x, int y) {
		double result = (double)x / (double)y;
//		double result = x / y;
		
		return result;
	} // divide
	
	void powerOff() {
		System.out.println("전원을 끕니다.");
		
	} // powerOff

} // end class