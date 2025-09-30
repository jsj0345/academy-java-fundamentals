package com.kh.chap01_poly.model.vo;

//부모클래스
public class Phone {
	
	//핸드폰이라면 꼭 있어야하는 기능 정의
	
	//전화 기능 
	public void call() {
		System.out.println("전화 기능");
	}
	
	//문자 기능
	public void sms() {
		System.out.println("문자 기능");
	}
	
	//카메라 기능
	public void camera() {
		System.out.println("카메라 기능");
	}
	
}
