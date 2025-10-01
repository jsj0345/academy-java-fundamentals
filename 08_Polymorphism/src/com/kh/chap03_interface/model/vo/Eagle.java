package com.kh.chap03_interface.model.vo;

public class Eagle extends Bird implements Ground {

	@Override
	public void speak() {
		System.out.println("삐익~");
	}
	
	@Override
	public void eat() {
		System.out.println("생고기 먹기");
	}
	
	//Ground 인터페이스에 있는 메소드
	@Override
	public void lungBreath() {
		System.out.println("공중에서 숨쉬기");
	}

}
