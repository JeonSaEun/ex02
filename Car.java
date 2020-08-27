package com.zerock.ex02;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j;

@NoArgsConstructor
@AllArgsConstructor
//@RequiredArgsConstructor
@Log4j
public class Car {
	//1. 현실객체의 고유 속성
	//2. 현실객체의 변하는 상태 속성
	//3. 부품객체
	String company = "현대자동차";
	
	String model;
	String color;
	
	int maxSpeed = 350;
	
	
//	public Car() {
//		this.company = "현대" + "자동차";
//	} // default constructor
	
	
} // end class
