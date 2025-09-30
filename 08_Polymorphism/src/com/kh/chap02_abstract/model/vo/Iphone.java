package com.kh.chap02_abstract.model.vo;

public class Iphone extends Phone{ 
	
	//카메라 기능을 아이폰만의 카메라 기능으로 재정의하기
	@Override
	public void camera() {
		System.out.println("아이폰 감성샷");
	}
	
	
	
	//아이폰 고유기능
	public void airDrop() {
		System.out.println("에어 드랍");
	}

}
