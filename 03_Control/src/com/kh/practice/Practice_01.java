package com.kh.practice;

import java.util.Scanner;

// sysout 작성 후 ctrl+space -> System.out.println 완성 

public class Practice_01 {
	
	public void method1() {
		Scanner sc = new Scanner(System.in);
		while(true) {
			
			
			
			System.out.print("메뉴 번호를 입력하세요 : ");
			
			int number = sc.nextInt();
			
			if(number == 1) {
				System.out.println("입력 메뉴입니다.");
			} else if(number == 2) {
				System.out.println("수정 메뉴입니다.");
			} else if(number == 3) {
				System.out.println("조회 메뉴입니다.");
			} else if(number == 4) {
				System.out.println("삭제 메뉴입니다.");
			} else if(number == 7) {
				System.out.println("종료 메뉴입니다.");
				break; 
			}
			
			
			
	   }
		
	   sc.close(); 
		
	    
	}

}
