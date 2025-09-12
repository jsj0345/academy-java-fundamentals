package com.kh.operator;

import java.util.Scanner;

public class G_Triple {
	
	/*
	 * 삼항 연산자
	 * 피연산자가 3개인 연산자
	 * 조건식 형태로 진행된다.
	 * -조건식이란 결과값에 따라서 연산을 처리하는 방식
	 * 
	 * [표현법]
	 * 조건식 ? 조건식이 true일 경우 실행할 수식 : 조건식이 false인 경우 실행할 수식;
	 * 
	 * - 중첩도 가능하지만 중첩이 많아질수록 가독성이 떨어짐. 
	 * */
	
	public void method1() {
		//사용자가 입력한 값이 양수인지 아닌지 판별하고 결과를 출력해보기
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력: ");
		int num = sc.nextInt();
		
		//num>0 이라는 조건식의 결과값이 true이면 ? 뒤에있는 문자열이 나온다.
		//결과값이 flase 라면 : 뒤에 있는 문자열이 result 변수에 담기게 된다. 
		String result = (num > 0) ? "양수입니다." : "양수가 아니다."; 
		
		System.out.println("입력한 정수는 " + result); 
		
		//스캐너 닫아주기
		sc.close(); 
	}
	
	public void method2() {
		//짝수 홀수 판별
		//사용자에게 입력받은 수가 짝수인지 홀수인지 판별하여
		//짝수라면 짝수입니다. 홀수라면 홀수입니다. 라는 문자열을 출력해보시오.
		//위 작업을 무리없이 수행했다면 0도 판별해보자.(중첩 삼항연산자)
		//ex) 0입니다. 짝수입니다. 홀수입니다. 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하시오: ");
		int num = sc.nextInt();
		
		String determination = ((num % 2)  == 0) ? ((num == 0) ? "0입니다." : "짝수입니다." ) : "홀수입니다.";
		
		System.out.println("입력하신 숫자는 " + determination); 
		
	}
	
	public void method3() {
		//중첩 삼항 연산자를 이용하여 입력받은 수가 양수인지 음수인지 0인지 판별해보기
		//양수입니다. 음수입니다. 0입니다. 를 문자열로 출력해보기
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하시오: ");
		int num = sc.nextInt();
		
		String determination = (num>=0) ? ((num == 0) ? "0입니다." : "양수입니다.") : "음수입니다.";
		
		System.out.println("입력하신 숫자는 " + determination); 
	}
	

}
