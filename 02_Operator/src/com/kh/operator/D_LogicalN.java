package com.kh.operator;

public class D_LogicalN {
	
	//논리 부정 연산자 : 논리값(true/false)을 반대로 바꿔주는 연산자
	//[표현법]!논리값
	
	public void method1() {
		System.out.println("논리값 true 의 부정 : " + !true); // false
		System.out.println("논리값 false 의 부정 : " + !false); // true
		
		boolean flag = 10 < 3; 
		boolean flag2 = 5 > 3;
		
		System.out.println("!flag : " + !flag); // true
		System.out.println("!flag2 : " + !flag2); // false
	}

}
