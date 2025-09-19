package com.kh.chap02.encapsulation.model.vo;

//필드부, 생성자부, 메소드부
public class Student {
	
	//필드부(필드,멤버변수,인스턴스변수...)
	//접근제한자 자료형 필드명;
	//캡슐화의 원칙 - 정보 은닉(필드를 외부에서 직접 접근하지 못하도록 private 접근제한 부여하기)
	private String name;
	private int age;
	private char gender;
	
	
	//생성자부 (필드를 초기화해주는 구문)
	//기본 생성자 or 매개변수 생성자
	
	//메소드부
	/*
	 * 각 기능을 구현하는 부분
	 * 
	 * 접근제한자 반환형 메소드명(매개변수) {
	 *   실행 코드;
	 *   return 반환값;
	 * 
	 * }
	 * 
	 * -접근제한자 : 해당 메소드를 호출할 수 있는 범위를 지정
	 * -반환형 : 해당 메소드를 호출했을때 반환되는 값이 있다면 해당 값의 자료형
	 *  - 만약 반환값이 없다면 반환형 위치에는 void를 작성한다(반환값이 없음을 의미)
	 *  
	 * -매개변수 : 해당 메소드를 호출할때 전달되는 값이 있다면 사용하는 지역변수
	 * -만약 전달되는 값이없다면 생략 가능하다.
	 * 
	 * 
	 * 
	 * 
	 */
	
	//간접 접근 메소드 getter / setter 정의하기
	//이름 필드에 대해서 처리
	public String getName() {
		//getter 메소드에서는 해당 필드명과 동일한 지역변수가 없기 때문에 
		//this 생략 가능 
		return name; // name 필드에 담긴 값을 반환하는 구문 
	}
	
	public void setName(String name) {
		//매개 변수로 전달받은 데이터를
		//해당 클래스로 생성된 객체의 필드에 담아주어야 한다.
		//해당 객체의 필드에 접근하는 방법 
		//객체주소값.필드명 
		//변수명이 같은 경우 지역변수가 우선권을 갖게된다. (더 가까이 있어서) 
		//때문에 필드명을 지정하려면 객체주소값을 참조하여 필드에 접근해야한다.
		//이때 사용하는 키워드가 this임. 
		this.name = name; 
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public char getGender() {
		return gender;
	}
	
	public void setGender(char gender) {
		this.gender = gender; 
	}
	
	//공통적으로 필요한 정보 출력 메소드 작성해보기
	//1. 출력구문 사용하기
	public void info() {
		System.out.println(name+"학생의 나이는 " + age +"살이고 " + gender + "학생입니다.");
	}
	
	//2. 문자열 반환하기 
	//김학생학생의 나이는 20살이고 남학생입니다. 와 같은 형식을 만들어 반환후
	//Run에서 출력해보기
	//메소드명은 info2()
	public String info2() {
		String str = name + "학생의 나이는 " + age + "살이고 " + gender +"학생입니다.";
		return str; 
	}
	
	
	
	

}
