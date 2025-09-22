package com.kh.chap03_field.model.vo;

public class Test {

	public static void main(String[] args) {
		// FieldTest2 에서 선언한 필드 접근제한자 확인해보기
		// 같은 패키지 내
		FieldTest2 ft2 = new FieldTest2();
		
		System.out.println(ft2.pub);
		System.out.println(ft2.pro);
		System.out.println(ft2.def);
		//System.out.println(ft2.pri);

	}

}
