package com.kh.chap03_interface.model.vo;

public class Fish implements Animal, Sea{
	
	@Override
	public void eat() {
		System.out.println("물고기 먹이 먹기");
		
	}
	
	@Override
	public void run() {
		System.out.println("헤엄치기");
		
	}
	
	@Override
	public void speak() {
		System.out.println("뿜뿜");
		
	}
	
	@Override
	public void gill() {
		System.out.println("아가미 호흡");
	}
}
