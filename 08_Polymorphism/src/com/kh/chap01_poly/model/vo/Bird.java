package com.kh.chap01_poly.model.vo;

public class Bird extends Animal{
	
	
	public void fly() {
		System.out.println("날기");
	}
	
	@Override
	public void speak() {
		System.out.println("짹!짹!");
	}
	
}
