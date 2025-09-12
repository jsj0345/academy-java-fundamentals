package com.kh.operator;

import java.util.Scanner;

public class F_Logical {
	
	/*
	 * 논리 연산자 : 이항연산자, 두개의 논리값을 연산하는 연산자
	 * [표현법] 논리값 논리연산자 논리값; - 결과값도 논리값이 나오게 된다.
	 * 
	 * 종류
	 * 
	 * 1. && (AND) 연산 : 논리값 && 논리값 
	 * - 양쪽 논리값이 모두 true여야 true가 나온다.
	 * 
	 * 2. || (OR) 연산 : 논리값 || 논리값 
	 * - 양쪽 논리값 중 하나라도 true라면 결과값이 true가 나온다.
	 * 
	 * 
	 */
	
	//AND 연산
	public void method1() {
		// 사용자가 입력한 정수값이 양수이며 짝수인지 판별해보기
		Scanner sc = new Scanner(System.in); 
		
		System.out.print("정수 입력 : " );
		int num = sc.nextInt();
		
		//양수인지 판별 : num > 0
		//짝수인지 판별 : num % 2 == 0 
		boolean result = ((num > 0) && (num%2==0));
		
		System.out.println("입력받은 " + num + "은 양수이며 짝수인가요? " + result); 
		
		sc.close(); 
	}
	
	public void method2() {
	    //사용자가 입력한 정수값이 음수이며 홀수인지 판별하기
        //위 구문을 참고하여 작성해보시오.
		
	    Scanner sc = new Scanner(System.in);
	  
	    System.out.print("정수를 입력하시오: ");
	    int num = sc.nextInt();
	    
	    boolean result = (num < 0) && ((num % 2) != 0);
	    
	    System.out.println("입력받은 " + num + "은 음수이며 홀수인가요? " + result);
	    
	    sc.close(); 
	}
	
	public void method3() {
		//입력받은 정수가 1이상 100이하 인지 판별해보기
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하시오: ");
		int num = sc.nextInt();
		
		//1<= num <=100 와 같은 형식이 불가능하다.
		//boolean result = 1<=num<=100;
		//각 연산을 따로 작업한뒤 && 연산으로 묶어주기
		boolean result = ((num>=1) && (num<=100)); 
		
		System.out.println("입력받은 " + num + "값은 1이상 100이하 인가요? " + result); 
		
		sc.close(); 
	}
	
	public void method4() {
		//사용자가 입력한 값이 M 또는 m 인지 확인하기
		//스캐너 생성
		Scanner sc = new Scanner(System.in);
		
		System.out.print("당신의 성별을 입력하세요(M/F) : ");
		
		//사용자에게 문자열 입력받기
		String gender = sc.next();		
		
		//문자열(String)자료형은 참조자료형이기 때문에 == 동등비교 연산자로 판별할 수 없다.
		//equals() 메소드를 이용하여 판별해야한다.(문자열 비교 메소드) 
		System.out.println(" M : " + (gender == "M"));
		System.out.println(" m : " + (gender == "m"));
		
		//입력받은 문자열에서 문자를 추출하여 동등비교를 수행한다. (char는 기본형이므로 비교 가능)
		char gen = gender.charAt(0);
		System.out.println(" M : " + (gen == 'M'));
		System.out.println(" m: " + (gen == 'm')); 
		
		//사용자가 입력한 값이 M 또는 m 인지 판별하기
		boolean result = (gen == 'M') || (gen == 'm');
		
		System.out.println("결과 : " + result); 
	}
	
	public void method5() {
		//사용자에게 나이(정수)와 성별(남/여)를 각각 입력받고
		//입력받은 정보가 남자이며 성인인지 판별 하는 출력문 1개
		//성인 또는 여성인지 판별하는 출력문 1개
		//각각 작성해보자.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이를 입력하시오: ");
		int age = sc.nextInt();
		
		sc.nextLine(); 
		System.out.print("성별을 입력하시오(남/여) : ");
		String gender = sc.next(); 
		char gen = gender.charAt(0); 
		
		boolean result = (age > 19) && (gen == '남');
		
		System.out.println("사용자는 성인이면서 남자인가? : " + result);
		
		boolean result2 = (age > 19) || (gen == '여');
		System.out.println("사용자는 성인 또는 여성인가? : " + result2); 
		
		sc.close(); 
	}

}
