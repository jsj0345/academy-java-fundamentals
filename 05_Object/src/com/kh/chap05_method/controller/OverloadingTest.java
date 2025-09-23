package com.kh.chap05_method.controller;

public class OverloadingTest {
	/*
	 * 메소드 오버로딩
	 * -한 클래스 안에 같은 메소드명으로 여러 메소드를 정의할 수 있는 방법
	 * -매개변수의 자료형 개수 순서가 다르게 적용되어야한다.
	 * 이때 매개변수명, 접근제한자, 반환형은 메소드 오버로딩에 영향을 주지 않는다.
	 * */
	
	//오버로딩을 확인하기 위해 메소드명은 test로 통일하여 확인하기
	
	public void test() {
		//메소드 오버로딩이 적용된 사례
		System.out.println("문자열");
		System.out.println(10);
		System.out.println(10.1);
		
	}
	
	public void test(int a) {
		System.out.println("int 매개변수 하나");
	}
	
    public void test(String s) {
    	System.out.println("String 매개변수 하나");
    }
    
    public void test(int a, String b) {
    	System.out.println("int 하나 String 하나");
    }
    
    public void test(String a, int b) {
    	System.out.println("String 하나 int 하나");
    }
    
//	// 위 메소드와 자료형과 개수 순서가 동일하다 (변수명은 영향을 주지 않음)
//	public void test(String str, int num) {
//
//	}
//
//	// 접근제한자도 영향을 주지 않는다.
//	protected void test(String a, int b) {
//
//	}
//
//	// 반환형도 영향을 주지 않음
//	public String test(String a, int b) {
//		return "문자열";
//	}
    
    //메소드 오버로딩이 적용되는 조건은 매개변수의 타입(자료형)이 다르거나
    //매개변수의 개수가 다르거나 매개변수 타입의 순서가 다르게 작성되어야한다.
    //매개변수명,접근제한자,반환형은 영향을 주지 않는다. 
    
    
	
	

}
