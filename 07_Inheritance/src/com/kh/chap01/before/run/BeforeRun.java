package com.kh.chap01.before.run;

import com.kh.chap01.before.model.vo.DeskTop;
import com.kh.chap01.before.model.vo.SmartPhone;
import com.kh.chap01.before.model.vo.Tv;

public class BeforeRun {

	public static void main(String[] args) {
		
		DeskTop dt = new DeskTop("삼성","dt-99","좋은 데스크탑",1500000,true);
		Tv tv = new Tv("LG","tv-11","얇은 별걸이 티비",3300000,50);
		SmartPhone sp = new SmartPhone("애플","ap-114","아이폰 99",9999999,"KT");
		
		//각 객체 정보 출력해보기 
		System.out.println(dt.information());
		System.out.println(tv.information());
		System.out.println(sp.information());
		
		//브랜드 정보를 추출할때 [ ] 와 같은 형식을 추가해야한다 
//		System.out.println("["+dt.getBrand()+"]");
//		System.out.println("["+tv.getBrand()+"]");
//		System.out.println("["+sp.getBrand()+"]");
		
		System.out.println(dt.getBrand());
		System.out.println(tv.getBrand());
		System.out.println(sp.getBrand());
		
		/*
		 * 매 클래스마다 중복된 코드들을 기술한다면 
		 * 유지보수 측면에서 좋지 않다.
		 * 상속이라는 개념을 적용시켜 매 클래스마다 중복된 필드,메소드들을
		 * 하나의 클래스(부모클래스)에 정의하고 그 클래스에 있는 
		 * 필드,메소드를 이용하는 방식으로 사용해보자.
		 * 
		 * */
		
		
		
	}

}
