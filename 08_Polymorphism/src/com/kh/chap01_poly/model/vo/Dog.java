package com.kh.chap01_poly.model.vo;

public class Dog extends Animal{
	
	
	public void play() {
		System.out.println("놀기");
	}
	
	@Override
	public void speak() {
		System.out.println("왈왈!");
	}

}
