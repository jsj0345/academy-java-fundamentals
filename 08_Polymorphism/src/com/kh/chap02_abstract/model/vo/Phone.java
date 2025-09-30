package com.kh.chap02_abstract.model.vo;
/*
 * 추상클래스
 * [표현법]
 * 접근제한자 abstract class 클래스명() 
 * abstract : 예약어, 추상클래스나 추상 메소드를 선언할 때 사용
 * 
 * 추상 클래스
 * 추상 메소드가 존재하는 클래스는 반드시 추상 클래스를 정의해야한다.
 * 객체 생성이 불가능하지만 부모 클래스로 사용 가능하고 다형성도 적용가능
 * 
 * 추상 클래스 : 일반 필드 + 일반 메소드 + 추상 메소드(생략가능)
 * -단 추상메소드가 없어도 추상클래스로 선언 가능하다.
 * -클래스가 미구현 상태일때 또는 객체를 생성시키고 싶지 않은 상황일때
 * 추상 클래스로 정의할 수 있다. 
 */

public abstract class Phone {
	//핸드폰 기능 3가지
	
	public void call() {
		System.out.println("전화 기능");
	}
	
	public void sms() {
		System.out.println("문자 기능");
	}
	
//	public void camera() {
//		System.out.println("카메라 기능");
//	}
	
	/*
	 * 핸드폰이라면 카메라 기능이 필요하지만 기본 카메라 기능을 사용하지 않고
	 * 자식클래스들에서 재정의하여 사용하게 된다면 부모클래스에서는
	 * 굳이 메소드 구현부를 작성할 필요가 없다. (사용되지 않기 때문에)
	 * 이때 사용할 수 있는 형태가 추상 메소드이다. (public abstract)
	 * 
	 * 추상 메소드
	 * [표현법]
	 * 접근제한자 abstract 반환형 메소드명();
	 * ex) public abstract void method();
	 * abstract라는 예약어와 함께 정의한다.
	 * 
	 * 미완성 메소드가 하나라도 포함되는 클래스라면 반드시 미완성 클래스로
	 * 정의되어야한다.(abstract class)
	 * 해당 클래스에도 abstract를 붙여 정의한다. 
	 */
	
	public abstract void camera(); //미완성메소드(추상메소드)
	
	//public abstract void camera1(); //미완성메소드 (추상메소드)
	

}
