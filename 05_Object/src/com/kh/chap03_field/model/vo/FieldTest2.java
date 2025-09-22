package com.kh.chap03_field.model.vo;

public class FieldTest2 {
	/*
	 * 접근제한자
	 * (+) public : 어디서든 접근가능(같은 패키지,다른패키지 모두)
	 * (#) protected : 같은 패키지내에서만 접근 가능 다른 패키지라면 상속구조에서만
	 * (~) default : 같은 패키지에서만 접근가능 (생략 되어짐)
	 * (-) private : 오직 해당 클래스에서만 접근 가능
	 * 
	 * -위에 작성한 순서에서 아래로 내려갈수록 접근범위가 좁아짐
	 */
	
	public String pub = "public";
	protected String pro = "protected";
	String def = "default";
	private String pri = "private"; 

}
