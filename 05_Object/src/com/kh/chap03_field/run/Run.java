package com.kh.chap03_field.run;

import com.kh.chap03_field.model.vo.FieldTest1;
import com.kh.chap03_field.model.vo.FieldTest2;
import com.kh.chap03_field.model.vo.FieldTest3;

public class Run {
	public static void main(String[] args) {
		//객체 생성시 기본생성자 구문으로 global 변수 초기화(기본값)
		FieldTest1 ft = new FieldTest1();
		//test 메소드 호출시 num, local 지역변수 할당
		ft.test(10);
		//메소드 종료시 지역변수 소멸
		
		//global변수는 개체가 소멸될때 같이 소멸된다.
		//객체를 소멸시키는 방법 (더 이상 참조 되지 않도록 만들기)
		ft = null; // ft 참조변수에 null을 대입하여 기존 객체 주소값 덮어쓰기
		//기존에 참조하고 있던 객체를 더 이상 참조하지 않게 된다.
		
		//다른패키지에서 접근제한자 확인해보기
		FieldTest2 ft2 = new FieldTest2();
		
		System.out.println(ft2.pub);
		// protected, default 모두 같은 패키지내에서만 접근 가능
		// protected의 경우 다른 패키지에서 접근하려면 상속구조여야함. 
		//System.out.println(ft2.pro); // 접근 불가 다른 패키지이면서 상속 패키지 x
		//System.out.println(ft2.def); // 접근 불가 같은 패키지 x
		//System.out.println(ft2.pri); // 접근 불가 같은 클래스 x 
		
		//static final 확인
		FieldTest3 ft3 = new FieldTest3();
		System.out.println(ft3.STR);
	    
		//ft3.STR = "변경값"; //상수필드이기 때문에 값 변경 불가능(final)
		//System.out.println(ft3.sta);
		//static 가 붙은 변수는 객체 생성 없이 해당 클래스명과 함께 호출하면 된다.
		System.out.println(FieldTest3.sta); // 클래스명.static변수명 
		
		FieldTest3.sta = "변경";
		System.out.println(FieldTest3.sta);
		
		System.out.println(FieldTest3.NUM);
		
		FieldTest3.test(); // 객체 생성 없이 메서드 호출 가능(static)
		
		
		
		

	}

}
