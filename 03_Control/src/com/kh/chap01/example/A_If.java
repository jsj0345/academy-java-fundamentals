package com.kh.chap01.example;

import java.util.Scanner;

public class A_If {
	/*
	 * 단독 If문
	 * 
	 * [표현법]
	 * if(조건식) {
	 *   조건식의 결과값이 true 일 경우 실행할 코드 
	 * }
	 * 
	 * 조건식의 결과값이 true일 경우 중괄호 안에 있는 코드를 수행한다.
	 * 조건식의 결과값이 false일 경우 중괄호 안에 있는 코드를 수행하지 않고 건너 뛴다.
	 * 
	 * */
	
	//삼항 연산자를 이용하여 처리했던 양수,음수 판별 구문을 if문으로 처리해보기
	public void method1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		//양수인지 판별
		if (num > 0) { // num이 0보다 큰지 확인
			//위 조건식의 결과값이 true일 경우, 수행되는 영역 
			System.out.println("양수입니다.");
		}
		
		//음수인지 판별
		if(num < 0) { // num이 0보다 작은지 확인 
			//위 조건식의 결과값이 true일 경우, 수행되는 영역
			System.out.println("음수입니다."); 
		}
		
		//0인지 판별
		if(num == 0) { // num이 0과 같은지 확인 
			System.out.println("0 입니다.");
		}
		
		//스캐너 닫기
		sc.close(); 
	}
	
	public void method2() {
		//입력받은 수가 짝수인지 홀수인지 판별하기
		//단일 if문을 이용하여 짝수라면 짝수입니다.
		//홀수라면 홀수입니다. 라는 출력을 해보세요.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요: ");
		int num = sc.nextInt();
		
		if(num % 2 == 0) {
			System.out.println("짝수입니다.");
		}
		
		if(num % 2 != 0) {
			System.out.println("홀수입니다.");
		}
		
		sc.close(); 
	}
	
	public void method3() {
		//주민번호를 입력받아 - 포함
		//남자인지 여자인지 판별하기
		//사용자에게 - 포함 하여 주민번호를 입력받고
		//1,3 이면 남자 , 2,4면 여자를 판별하여
		//남자입니다 또는 여자입니다 를 출력해보기
		//단일 if문을 사용해보기 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("주민번호를 입력하세요(- 포함) : ");
		String resident_number = sc.nextLine();
		
		String[] BackNumber = resident_number.split("-"); // -을 기준으로 문자열 쪼개기 
		
		int i = (int) BackNumber[1].charAt(0); // 쪼갠 문자열의 0번째가 - 다음 숫자다. 
		
		if (i % 2 != 0) {
			System.out.println("남자입니다.");
		}
		
		if (i % 2 == 0) {
			System.out.println("여자입니다.");
		}
		
		sc.close(); 
		
	 }
	
	

}
