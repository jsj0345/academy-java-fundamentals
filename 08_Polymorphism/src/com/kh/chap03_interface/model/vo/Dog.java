package com.kh.chap03_interface.model.vo;

public class Dog implements Animal {
	
	@Override
	public void speak() {
		System.out.println("멍멍!");
	}
	
	@Override
	public void run() {
		System.out.println("네발로 달리기");
	}
	
	@Override
	public void eat() {
		System.out.println("개껌 먹기");
	}

}
