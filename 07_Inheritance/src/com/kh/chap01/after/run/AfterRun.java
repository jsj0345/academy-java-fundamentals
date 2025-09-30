package com.kh.chap01.after.run;

import com.kh.chap01.after.model.vo.DeskTop;
import com.kh.chap01.after.model.vo.SmartPhone;
import com.kh.chap01.after.model.vo.Tv;

public class AfterRun {

	public static void main(String[] args) {
		
		DeskTop dt = new DeskTop();
		
		dt.setBrand("삼성");
		dt.setpCode("dt-99");
		dt.setpName("좋은 데스크탑");
		dt.setPrice(1500000);
		dt.setAllInOne(false);
		
		//매개변수 생성자를 이용하여 처리하려면? 
		//brand,pcode,pname,price 필드는 desktop 클래스에 없고 
		//부모클래스인 product 클래스에 정의되어있다 
		//따라서 해당 필드값을 대입하려면?(초기화) 부모클래스 객체에 초기화 시켜야한다.
		DeskTop dt2 = new DeskTop("삼성","dt-99","좋은데스크탑",150000,false);
		
		System.out.println(dt2.information());
		
		//SmartPhone 자식클래스에서 Product 부모클래스 상속 후 
		//위 데스크탑과 같이 매개변수 모두 받는 생성자를 작성한다.
		//이때 부모필드 초기화 구문은 부모클래스의 setter 메소드 활용하기 
		//Tv 클래스는 부모클래스 필드 직접접근해서 초기화하여 
		//위 information과 같이 모든 정보가 각 자식 클래스에서 확인할 수 있도록 
		//information 만들어 출력하기 
		SmartPhone sp = new SmartPhone("애플","sp-111","아이폰99",333333,"KT");
		System.out.println(sp.information());
		
		Tv tv = new Tv("LG","tv-1919","얇은 올인원티비",999999,90);
		System.out.println(tv.information());
		
		
		
		
		
	}

}
