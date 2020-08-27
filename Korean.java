package com.zerock.ex02;

public class Korean {

	String nation = "대한민국";
	String name;
	String ssn;
	
	
	// 생성자의 매개변수 이름은, 초기화 대상인 필드의 이름과
	// 동일하게 지어주는 게 관례이다
	public Korean(String name, String ssn) {
	  this.name = name;			//this란, 객체 그 자신
	  this.ssn = ssn;			//생성된 객체의 주소를 갖고있는 특수한 키워드
	} // Constructor
	
	
	public void instanceMethod() {
		System.out.println("2. Korean : " + this);
	} // instanceMethod
	
} // end class