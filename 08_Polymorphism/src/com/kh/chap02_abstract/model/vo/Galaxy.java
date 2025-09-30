package com.kh.chap02_abstract.model.vo;

public class Galaxy extends Phone {
	
	//카메라 기능 재정의하기
	@Override
	public void camera() {
		System.out.println("갤럭시 100배 광학줌");
	}
	

	//갤럭시 고유기능 
	public void samsungPay() {
		System.out.println("삼성 페이");
	}
}
