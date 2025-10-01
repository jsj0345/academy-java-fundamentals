package com.kh.chap03_interface.model.vo;

//추상 메소드를 구현하지 않고 다음 상속되는 위치로 넘기기
public abstract class Bird implements Animal {
	
	//ctrl + space를 누르면 자동완성 ㄱㄱ
	
	@Override
	public void run() {
		System.out.println("두발로 빠르게 걷기");
	}
	
	

}
