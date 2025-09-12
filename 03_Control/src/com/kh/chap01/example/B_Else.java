package com.kh.chap01.example;

import java.util.Scanner;

public class B_Else {
	
	/*
	 * if - else 구문
	 * [표현식]
	 * if(조건식) {
	 *   조건식이 true일 경우 수행할 구문
	 * } else {
	 *   조건식이 false일 경우 수행할 구문
	 * }
	 *     
	 * */
	
	public void method1() {
		Scanner sc = new Scanner(System.in); 
		
		//입력받은 수가 양수인지 아닌지 판별
		System.out.println("정수 입력 : ");
		int num = sc.nextInt();
		
		if(num > 0) { //0보다 큰가?
			System.out.println("양수입니다.");
		} else { //그렇지 않다면 
			System.out.println("양수가 아닙니다.");
		}
		
		//입력받은 수가 양수인지 음수인지 0인지까지 모두 판별하기
		if(num > 0) { //양수판별
			System.out.println("양수입니다.");
		} else { //양수가 아닌 경우
			//중첩 if문 이용하기
			if(num == 0) { // num이 0인가? 
				System.out.println("0입니다.");
			} else {
				System.out.println("음수입니다."); 
			}
		}
		
		sc.close(); 
	}
	
	public void method2() {
		//주민번호 입력받아 남자 여자 판별 예시에서
		//1,3은 남자 2,4는 여자 그 외의 수가 입력되면
		//잘못입력하셨습니다.를 출력해보세요.
		//중첩 if문 사용
		
		Scanner sc = new Scanner(System.in);
		System.out.println("주민등록번호를 입력하십시오: ");
		String number = sc.nextLine();
		char gender_number = number.charAt(7);
		
		//if(gender == '1' || gender == '2' || gender == '3' || gender=='4')
		//'1'~'4'문자는 연속적으로 정해져있기 때문에 범위 표현도 가능함. (아스키코드표) 
		if(gender_number == '1' || gender_number == '3') {
			System.out.println("남자입니다.");
		} else {
			if(gender_number == '2' || gender_number == '4') {
				System.out.println("여자입니다.");
			} else {
				System.out.println("잘못 입력하셨습니다.");
			}
		}
		
	}
	
	/*
	 * if - else if 문
	 * [표현법]
	 * if(조건식1) {
	 *   조건식1이 true일때 수행
	 * } else if (조건식2) {
	 *   조건식2가 true일때 수행
	 * } else if (조건식3) {
	 *   조건식3이 true일때 수행
	 * } ... 
	 * 
	 * else { 위 조건들이 모두 만족하지 않을 때 수행 (생략도 가능) 
	 *  
	 * }
	 */
	
	public void method3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 입력 : ");
		int num = sc.nextInt();
		
		if(num > 0) { // 양수인경우 
			System.out.println("양수입니다.");
		} else if (num < 0) { //음수인경우
			System.out.println("음수입니다.");
		} else { // 위 두 조건이 모두 아닌 경우 (0인 경우)
			System.out.println("0 입니다.");
		}
		
		sc.close(); 
	}
	
	public void method4() {
		//사용자에게 나이를 입력받아 어린이 청소년 성인 판별해보기
		//1~13 어린이
		//14~19 청소년
		//20~ 성인
		//if - else if 구문을 이용하여 판별해보자. (중첩가능)
		//잘못입력한 경우 잘못입력하셨습니다.를 출력해보기 
		
		Scanner sc = new Scanner(System.in);
		System.out.print("나이를 입력하시오: ");
		int age = sc.nextInt();
		
		if(age>=1 && age<=13) {
			System.out.println("어린이입니다.");
		} else if(age>=14 && age<=19) {
			System.out.println("청소년입니다.");
		} else if(age >= 20 && age <=120) {
			System.out.println("성인입니다.");
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}
		
		/*
		if(age > 0) {
		  
		   if(age < 14) {
		     System.out.println("어린이");
		   } else if(age < 20) {
		     System.out.println("청소년");
		   } else {
		     System.out.println("잘못 입력하셨습니다.");
		   }
	    } else { // 잘못 입력한 경우 
	      System.out.println("잘못 입력하셨습니다.");
	    }     
		         
		*/
		
		
		sc.close(); 
	}

}
