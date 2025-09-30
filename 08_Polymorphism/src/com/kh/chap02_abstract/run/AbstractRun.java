package com.kh.chap02_abstract.run;

import com.kh.chap02_abstract.model.vo.Galaxy;
import com.kh.chap02_abstract.model.vo.Galaxy2;
import com.kh.chap02_abstract.model.vo.Iphone;
import com.kh.chap02_abstract.model.vo.Phone;
import com.kh.chap02_abstract.model.vo.PhoneCamera;

public class AbstractRun {

	public static void main(String[] args) {
		
		//추상클래스 참조형변수 사용해보기
		//Phone p = new Phone(); //추상클래스는 객체 생성 불가(미완성이기 때문)
		Phone ip = new Iphone();
		Phone gx = new Galaxy();
		
		Iphone ip1 = (Iphone) ip;
		Galaxy gx1 = (Galaxy) gx;
		
		ip.camera();
		gx.camera();
		
		ip1.airDrop();
		gx1.samsungPay();
		
		PhoneCamera pc = new PhoneCamera();
		pc.camera(ip);
		
		//핸드폰 클래스 하나 생성하여 Phone 클래스 상속받고
		//미구현 메소드를 정의하여
		//PhoneCamera 클래스의 camera 메소드 매개변수로 전달하여 출력결과 확인해보기
		
		Galaxy2 g = new Galaxy2();
		pc.camera(g);
		

	}

}
