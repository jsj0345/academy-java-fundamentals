package com.kh.operator;

import java.util.Scanner; 

public class H_Ex {
	
	// 양수 판별 
	public void method1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : " );
		int num = sc.nextInt();
		
		String determination = num > 0 ? "양수다." : "양수가 아니다."; 	
		
		System.out.println(determination); 
	}
	
	// 양수가 아닌 경우 중에서 0과 음수 판별
	public void method2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : " );
		int num = sc.nextInt();
		
		String determination = num > 0 ? "양수다." : ((num == 0) ? "0이다." : "음수다." );
		
		System.out.println(determination); 
	}
	
	// 홀수, 짝수 판별
	public void method3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : " );
		int num = sc.nextInt();
		
		String determination = num % 2 != 0 ? "홀수다" : "짝수다";
		
		System.out.println(determination); 
		
	}
	
	//사탕 나누기
	public void method4() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("인원 수 : ");
		int people_number = sc.nextInt();
		
		System.out.print("사탕 개수 : ");
		int candy_quantity = sc.nextInt();
		
		// 사탕을 골고루 나눠 갖게 하기
		System.out.println("1인당 사탕 개수 : " + candy_quantity / people_number);
		System.out.println("남는 사탕 개수 : " + candy_quantity % people_number); 
	}
	
	//입력 받은 값들을 변수에 기록, 저장된 변수 값을 화면에 출력
	// 성별이 'M'이면 남학생, 'M'이 아니면 여학생으로 출력 
	public void method5() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름: ");
		String name = sc.next(); 
		
		System.out.print("학년(숫자만) : ");
		int grade = sc.nextInt();
		
		System.out.print("반(숫자만) : " );
		int class_number = sc.nextInt();
		
		System.out.print("번호(숫자만) : ");
		int number = sc.nextInt();
		
		System.out.print("성별(M/F) : ");
		String gender = sc.next();
		char gen = gender.charAt(0);
		
		String student_gen = gen == 'M' ? "남학생" : "여학생";
		
		System.out.print("성적(소수점 아래 둘째자리까지) : " );
		double score = sc.nextDouble();
		
		System.out.println(grade + "학년 " + class_number +"반 "
				+ class_number+"번 " + name + " " + student_gen +"의 성적은 "
				+ score +"이다.");
	}
	
	//어린이, 청소년, 성인 구분 
	public void method6() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이 : ");
		int age = sc.nextInt(); 
		
		String determination = age > 13 ? ( (age<=19) ? "청소년" : "성인") : "어린이"; 
		System.out.println(determination); 
	}
	
	//과목 합계 및 평균, 합격 여부
	public void method7() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		int korean = sc.nextInt();
		
		System.out.print("영어 : ");
		int english = sc.nextInt();
		
		System.out.print("수학 : " );
		int math = sc.nextInt();
		
		System.out.println("합계 : " + (korean + english + math));
		
		System.out.println("평균 : " + (korean + english + math) / 3.0); 
	}
	
	//주민번호로 성별 구분하기
	public void method8() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("주민번호를 입력하세요(- 포함) : ");
		String resident_number = sc.nextLine(); 
		
		String[] BackNumber = resident_number.split("-");
		
		/*
		for(int i = 0 ; i < BackNumber.length; i++) {
			System.out.println(BackNumber[i]);
		}
		*/ 
		
		int i = (int) BackNumber[1].charAt(0);
		
	    String determination = (i % 2 != 0) ? "남자" : "여자";
	    System.out.println(determination); 		
	}
	
	//두개의 정수와 다른 정수
	public void method9() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수1 : ");
		int num1 = sc.nextInt(); 
		
		System.out.print("정수2 : ");
		int num2 = sc.nextInt();
		
		System.out.print("입력: ");
		int num3 = sc.nextInt(); 
		
		boolean bool = (num1 < num2) ? ( (num3<=num1) || (num3 >num2) ) : false;
		
		System.out.println(bool);
	
		
	}
	
	//3개의 수를 키보드로 입력 받아 입력 받은 수가 모두 같은지 보기
	public void method10() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력1: ");
		int num1 = sc.nextInt();
		
		System.out.print("입력2: ");
		int num2 = sc.nextInt(); 
		
		System.out.print("입력3: ");
		int num3 = sc.nextInt();
		
		boolean bool = (num1 == num2) ? (num1 == num3) : false; 
		
		System.out.println(bool);
		
	}
	
	public void method11() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("A사원의 연봉 : ");
		int A_salary = sc.nextInt();
		
		System.out.print("B사원의 연봉 : ");
		int B_salary = sc.nextInt();
		
		System.out.print("C사원의 연봉 : ");
		int C_salary = sc.nextInt(); 
		
		double A_salary_incentive = (double) A_salary + (A_salary * 0.4);
		double B_salary_incentive = (double) B_salary + (B_salary * 0); 
		double C_salary_incentive = (double) C_salary + (double) (C_salary * 0.15);
		
		System.out.println("A사원 연봉/연봉+a : " + A_salary + "/" + A_salary_incentive);
		System.out.println(3000 + (A_salary_incentive >= 3000 ? " 이상" : " 미만"));
		System.out.println("B사원 연봉/연봉+a : " + B_salary + "/" + B_salary_incentive);
		System.out.println(3000 + (B_salary_incentive >= 3000 ? " 이상" : " 미만"));
		System.out.println("C사원 연봉/연봉+a : " + C_salary + "/" + C_salary_incentive);
		System.out.println(3000 + (C_salary_incentive >= 3000 ? " 이상" : " 미만"));
	}

}
