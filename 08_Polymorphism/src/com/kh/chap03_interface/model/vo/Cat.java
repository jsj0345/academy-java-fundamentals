package com.kh.chap03_interface.model.vo;

//파일을 만들 때, add를 통해서 인터페이스 구현 메소드 자동 추가 기능 써보기. 
public class Cat implements Animal {

	@Override
	public void speak() {
		System.out.println("야옹~");
	}

	@Override
	public void run() {
		System.out.println("캣휠 달리기");
	}

	@Override
	public void eat() {
		System.out.println("쥬르 먹기");
	}

}
