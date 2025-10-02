package com.kh.chap01_math.run;

public class MathRun {
	
	public static void main(String[] args) {
		//Math클래스 (수학관련)
		//Math 클래스에서 사용할 수 있는 기능들을 알아보기
		/*
		 * Math클래스의 특징
		 * -모든 필드와 메소드가 다 static으로 되어있다.
		 * -때문에 외부에서 객체를 생성할 필요가 없어 생성자가 private
		 * -java.lang 이라는 패키지 안에 존재
		    - 싱글톤 패턴
		    프로그램 실행과 동시에 메모리 영역에 올려놓고 재사용하는 개념
		    객체 하나만으로 어디서든 가져다 쓸 수 있다.
		 * */
		
		//Math 클래스의 필드
		//PI (원주율) - Math클래스 내에 상수필드로 정의
		System.out.println("원주율 : " + Math.PI);
		
		//메소드
		//메소드명(매개변수타입) : 반환형
		//1. 올림 : Math.ceil(double a) : double
		double num1 = 1.234;
		System.out.println(Math.ceil(num1)); // 2.0
		
		//2. 반올림 : Math.round(double a) : long
		System.out.println(Math.round(num1)); // 1
		
		//3. 버림 : Math.floor(double a) : double
		System.out.println(Math.floor(num1)); // 1.0 
		
		//4. 절대값 : Math.abs(double,float,int,long a) : 반환형은 매개변수 타입과 일치
		double d1 = -15.9;
		float f1 = -299.39f;
		int i1 = -99;
		long l1 = -12355256552L;
		
		System.out.println(Math.abs(d1));
		System.out.println(Math.abs(f1));
		System.out.println(Math.abs(i1));
		System.out.println(Math.abs(l1));
		
		//5. 최소값 -> Math.min(double a, double b) : double (float,int,long 가능)
		System.out.println(Math.min(0.5, 11.5));
		System.out.println(Math.min(9.9f, 11.5));
		System.out.println(Math.min(10, 11));
		System.out.println(Math.min(12149124414L, 21841244595L));
		
		//6. 최대값 -> Math.max(double a, double b) : double (float,int,long 가능)
		System.out.println(Math.max(0.5, 11));
		System.out.println(Math.max(50.5f, 2155));
		System.out.println(Math.max(219512525, 4128124812L));
		System.out.println(Math.max(123, 456.78));
		
		//7. 제곱근(루트) -> Math.sqrt(double a) : double
		System.out.println(Math.sqrt(16));
		
		//8. 제곱 -> Math.pow(double a, double b) : double
		System.out.println(Math.pow(2, 4));
	}

}
