package com.kh.chap01_poly.model.vo;

public class Cat extends Animal {
	
	
	public void cute() {
		System.out.println("귀엽기");
	}
	
	
	//부모클래스에게 상속받은 메소드가 마음에 들지 않을때 
	//재정의 하여 우선권을 가져온다.
	@Override //재정의된 메소드라는 어노테이션(검증)
	public void speak() {
		System.out.println("야옹~");
	}
	
	

}
