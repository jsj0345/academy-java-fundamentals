package com.kh.chap01_poly.run;


import com.kh.practice.chap01_poly.view.LibraryMenu;

public class Run {

	public static void main(String[] args) {
		LibraryMenu lm = new LibraryMenu();
		lm.mainMenu();
		
		String str = "안녕하세요 반갑습니다.";
		String keyword = "반갑";
		
		//문자열.contains("비교문자열") : true/false
		//문자열에서 비교문자열이 포함되었으면 true 아니면 false를 반환하는 메소드
		System.out.println(str.contains(keyword)); // true
		System.out.println(keyword.contains(str)); // false 
		

	}

}
