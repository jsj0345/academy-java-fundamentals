package com.kh.practice;

import java.util.Scanner;

public class Practice_06 {
	
	public void method1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("권한을 확인하고자 하는 회원 등급을 입력하세요: ");
		String grade = sc.next(); 
		
		if(grade.equals("관리자")) {
			System.out.println("회원관리, 게시즐 관리, 게시글 작성, 게시글 조회, 댓글 작성");
		} else if(grade.equals("회원")) {
			System.out.println("게시글 작성, 게시글 조회, 댓글 작성");
		} else if(grade.equals("비회원")) {
			System.out.println("게시글 조회");
		} else {
			System.out.println("그런 등급은 존재 하지 않습니다.");
		}
	}

}
