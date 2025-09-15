package com.kh.practice;

import java.util.Scanner;

public class Practice_05 {
	
	public void method1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("아이디 : ");
		String id = sc.nextLine();
		System.out.print("비밀번호 : ");
		String password = sc.nextLine();
		
		if(id.equals("myId") && password.equals("myPassword12")) {
			System.out.println("로그인 성공");
		} else if(id.equals("myId")) {
			System.out.println("비밀번호가 틀렸습니다.");
		} else if(password.equals("myPassword12")) {
			System.out.println("아이디가 틀렸습니다.");
		} else {
			System.out.println("둘 다 틀렸습니다.");
		}
		
		sc.close(); 
	}

}
