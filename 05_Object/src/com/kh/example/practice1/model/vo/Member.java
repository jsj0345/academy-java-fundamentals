package com.kh.example.practice1.model.vo;

public class Member {
	private String memberId;
	private String memberPwd;
	private String memberName;
	private int age;
	private char gender;
	private String phone;
	private String email;
	
	public Member() { // 기본 생성자 
		
	}
	
	public void changeName(String name) {
		this.memberName = name; // 멤버변수에 매개변수 초기화 
	}
	
	public void printName() {
		System.out.println("메서드 호출 후 변경한 이름 : " + this.memberName);
	}
	
	

}
