package com.kh.chap03_field.model.vo;

//클래스(static)변수와 상수 필드(final)
public class FieldTest3 {
	
	//필드
	//[표현법]접근제한자 예약어(생략가능) 자료형 필드명;
	
	public static String sta = "static변수";
	//생성시점 : 프로그램 실행시
	//소멸시점 : 프로그램 종료시
	//해당 객체를 생성하지 않아도 static변수를 사용할 수 있음.
	//static은 공유의 개념으로 사용 
	
	/*
	 * 상수필드
	 * [표현법]
	 * final 자료형 필드명;
	 * 한번 지정된 값을 고정해서 사용하기 위해서 쓰는 형태
	 * 
	 * 값이 한번 할당된 이후 변경되면 안되는 경우 사용한다.
	 * 
	 * 만약 공유의 목적을 갖고 변경되어선 안되는 값이 있다면
	 * 
	 * public static final 상수명 = "값";
	 * 
	 * 위와 같은 형태로 사용하게된다.
	 * 
	 * *이때 final이 붙은 상수들은 상수명을 대문자로 작성하여야한다. 
	 * 
	 * 
	 */
	
	public final String STR = "상수값";
	
	//공유의 목적과 고정된 값이 필요한 경우 두 예약어를 합쳐 사용
	public static final int NUM = 10; 
	
	//메소드에도 static 붙여 사용해보기
	public static void test() {
		System.out.println("static 메소드 호출");
	}

}
