package com.kh.chap02.loop;

import java.util.Scanner;

public class C_DoWhile {
	
	/*
	 * do-while문
	 * 별도의 조건검사 없이 무조건 1회는 실행하는 구문
	 * 조건이 참이 아니더라도 한번은 수행된다.
	 * 
	 * [표현법]
	 * 초기식; - 필수는 아니다.
	 * do {
	 *   실행할 코드
	 *   증감식; - 필수는 아니다.
	 * } while(조건식);
	 * 
	 * do{} 영역에 있는 구문이 최초 1회 수행된 이후
	 * while(조건식) 에 있는 조건을 확인한 뒤
	 * true일 경우 do{} 영역을 반복 수행
	 * false일 경우 실행하지 않고 영역을 벗어난다.
	 * 
	 * *while문과의 차이
	 * -while문은 처음 수행할 떄도 조건을 확인하고 true여야 수행하지만
	 * -do while문은 처음 한번은 수행된 이후 조건을 확인한다.
	 * 
	 */
	
	public void method01() {
		
		//조건이 만족하지 않아도 수행되는지 확인해보기
		int num = 1;
		
		do {
			System.out.println("출력 하나요");
			
		} while (num == 0);
		
	}

	public void method02() {
		int i = 1;
		
		do {
			System.out.println("i 값 : " + i);
			i++;
		} while (i < 6); 
	}
	
	public void method03() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("문자열을 입력해주세요.");
		String str = sc.nextLine();
		
		
	    do {
		    System.out.println("입력받은 문자열 : " + str);
		    System.out.println("문자열 입력 : ");
		    str = sc.nextLine();
	    } while(!str.equals("exit"));
	  
	
		
	}
	
	public void method04() {
		Scanner sc = new Scanner(System.in);
		
		//System.out.println("문자열을 입력해주세요.");
		String str = sc.nextLine();
		
		while(!str.equals("exit")) {
			//while문은 do-while문과 다르게 조건을 만족해야만 실행한다.
			System.out.println("현재 문자열 : " + str);
			System.out.println("문자열 입력 : ");
			str = sc.nextLine();
		}
		
		sc.close(); 
	}
	
	public void method05() {
		//무한 반복에서 벗어나려면?
		
		Scanner sc = new Scanner(System.in);
		
		while(true) { // 무한반복
			System.out.println("문자열 입력 : ");
			System.out.println("벗어나려면 exit를 입력하세요.");
			
			String str = sc.nextLine();
			
			//사용자가 입력한 문자열이 exit라면 반복문을 벗어나도록 처리하기 
			if(str.equals("exit")) {
				//반복문을 벗어나는 분기문 break; 
				break; 
			}
			
			System.out.println("입력받은 문자열의 길이 : " + str.length());
			
			//사용자에게 무한반복을 벗어날 수 있는 조건을 알려주고 조건처리하기
			
			
		}
		
		//sc.close(); 
	}
	
	
}
