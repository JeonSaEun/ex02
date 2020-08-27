package com.zerock.ex02;

import lombok.extern.log4j.Log4j;

@Log4j
public class CarExample {

	public static void main(String[] args) {
	
		Car car1 = new Car();			// OK
		
		Car car2 = new Car(
				"현대자동차",
				"model",
				null,
				0);
		
		Car car3 = new Car(
				"현대자동차",
				"model",
				"BLACK",
				0);
		
		Car car4 = new Car(
				"현대자동차",
				"model",
				"BLACK",
				350);
		
	} // main
	
} // end class
