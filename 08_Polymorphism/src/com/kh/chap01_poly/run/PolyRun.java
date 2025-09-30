package com.kh.chap01_poly.run;

import com.kh.chap01_poly.model.vo.Galaxy;
import com.kh.chap01_poly.model.vo.Iphone;
import com.kh.chap01_poly.model.vo.Phone;

public class PolyRun {

	public static void main(String[] args) {
		
		//Iphone 객체와 Galaxy 객체를 생성해보기 
		Iphone ip = new Iphone();
		Galaxy gx = new Galaxy();
		
		System.out.println("==========아이폰===========");
		ip.call();
		ip.sms();
		ip.camera();
		ip.siri();
		
		System.out.println("===========갤럭시============");
		gx.call();
		gx.sms();
		gx.camera();
		gx.samsungPay();
		
		/*
		 * 다형성
		 * 상속을 이용한 기술로 부모클래스로부터 상속받은 자식클래스 타입의 객체를
		 * 부모클래스 타입으로(형변환)하여 다루는 기술
		 * 추후 객체 배열에 적용시켜 하나의 부모타입으로 객체배열 생성 후 자식 객체들을 담아 사용가능
		 * = 연산을 기준으로 양쪽 자료형이 같아야하는 규칙이 있기 때문에 자료형을 맞춰야한다.
		 * 이때 부모클래스가 자식클래스로 형변환 하는것을 다운캐스팅
		 * 자식클래스가 부모클래스로 형변환 하는것을 업캐스팅 이라고 한다.
		 * 업캐스팅의 경우 자동 형변환이 되어 생략가능하지만 다운캐스팅은 강제형변환으로 생략불가능
		 * */
		
		//부모클래스 참조변수로 자식객체 다뤄보기 
		//자식이 부모타입으로 형변환(업캐스팅-자동)
		Phone iphone17 = new Iphone();
		Phone galaxy24 = new Galaxy();
		
		iphone17.call();
		iphone17.sms();
		iphone17.camera();
		//iphone17.siri(); //자식클래스에 있는 기능이기 때문에 부모 참조변수로 접근 불가능
		
		galaxy24.call();
		galaxy24.sms();
		galaxy24.camera();
		//galaxy24.samsungPay(); //자식클래스에 있는 기능이기 때문에 부모 참조변수로 접근 불가능
		
		//부모클래스 참조변수로 자식객체의 기능을 접근하기 위해선 다운 캐스팅이 필요하다.
		//부모클래스 -> 자식클래스 형변환(강제)
		System.out.println("=====다운 캐스팅 후 출력=====");
		//형변환연산자보다 . 참조연산자가 우선순위가 높기 때문에 형변환부터 처리 후 메소드 호출 
		((Iphone)iphone17).siri();
		((Galaxy)galaxy24).samsungPay();
		
		//부모클래스 참조변수로 자식객체 참조 
		Phone phone = new Iphone();
		
		//Iphone으로 생성했지만 galaxy의 기능인 samsungPay()호출
		//((Galaxy)phone).samsungPay(); - 오류발생 classcast
		
		/*
		 * 위와 같이 부모클래스로 자식객체를 참조하면 해당 객체가 어떠한 자식 객체를 참조하는지
		 * 판별이 가능해야 해당 자식객체에 정의되어있는 고유 기능을 오류없이 사용 할 수 있다.
		 * 이때 판별할 수 있는 연산자가 instanceof 연산자 이다.
		 * */
		System.out.println("=====instanceof 연산자=====");
		System.out.println("iphone17 참조변수에 담긴 클래스 자료형은 Iphone 인가요 ? ");
		System.out.println(iphone17 instanceof Iphone);
		System.out.println("galaxy24 참조변수에 담긴 클래스 자료형은 Galaxy 인가요 ?");
		System.out.println(galaxy24 instanceof Galaxy);
		
		System.out.println("phone 참조변수에 담긴 클래스 자료형은 Galaxy 인가요? ");
		System.out.println(phone instanceof Galaxy);
		
		
		
		
		
		

	}

}
