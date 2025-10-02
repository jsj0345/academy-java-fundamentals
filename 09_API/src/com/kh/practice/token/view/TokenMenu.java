package com.kh.practice.token.view;

import java.util.Scanner;
import java.util.StringTokenizer;

import com.kh.practice.token.controller.TokenController;

public class TokenMenu {
	
	private Scanner sc = new Scanner(System.in);
	private TokenController tc = new TokenController();
	
	//메인 메뉴 출력
	public void mainMenu() {
		while(true) {
			System.out.println("1. 지정 문자열");
			System.out.println("2. 입력 문자열");
			System.out.println("9. 프로그램 끝내기");
			System.out.print("메뉴를 입력하세요 : ");
			
			int menu = sc.nextInt();
			sc.nextLine();
			
			switch(menu) {
				case 1: {
					tokenMenu();
					break;
				}
				
				case 2: {
					inputMenu();
					break; 
				}
				
				case 9: {
					System.out.println("프로그램을 종료합니다.");
					return; 
				}
				
				default: {
					System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
					break; 
				}
			}
		}
	}
	
	//토큰 처리 전, 토큰 처리 후 출력
	public void tokenMenu() {
		String str ="J a v a P r o g r a m ";
		
		System.out.println("토큰 처리 전 글자 : " + str);
		
		System.out.println("토큰 처리 전 개수 : " + str.length());
		
		String str2 = tc.afterToken(str);
		
		System.out.println("토큰 처리 후 글자 : " + str2);
		
		//StringTokenizer st1 = new StringTokenizer(str2, "");
		System.out.println("토큰 처리 후 개수 : " + str2.length());
		System.out.println("모두 대문자로 변환 : " + str2.toUpperCase());
		
	}
	
	// 첫 글자 대문자와 찾을 문자 몇 개 있는지 출력
	public void inputMenu() {
		System.out.print("문자열을 입력하세요 : ");
		String str = sc.nextLine(); 
		String str1 = tc.firstCap(str);
		System.out.println("첫 글자를 대문자로 바꾼 것 출력 : " + str1);
		
		System.out.print("찾을 문자를 하나 입력하세요 : ");
		char one = sc.nextLine().charAt(0); 
		System.out.println("찾을 문자의 개수는 : " + tc.findChar(str, one));
	}

}
