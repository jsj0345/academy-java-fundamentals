package com.kh.example.practice1.run;

import com.kh.example.practice1.model.vo.Member;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member member = new Member(); // 객체 생성 및 참조값 초기화 
		member.changeName("클래스와 객체"); // 참조값을 가지고 메서드에 접근
		member.printName(); // 위에서 같은 참조값으로 메서드에 접근 했고 동일한 참조값에 있는 멤버변수 나오게하기
	}

}
