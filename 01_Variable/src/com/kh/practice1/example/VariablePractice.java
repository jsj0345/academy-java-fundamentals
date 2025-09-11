package com.kh.practice1.example;

import java.util.Scanner;

public class VariablePractice {
  
	public void method1() {
		// 입력을 받아야하니 스캐너 준비하기 
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요: ");
		String name = sc.next();
		
		System.out.print("나이를 입력하세요: ");
		int age = sc.nextInt();
		
		System.out.print("성별을 입력하세요(남/여) : ");
		String gender = sc.next();
		
		//인덱스는 배열의 순번을 의미한다. 각 문자의 자리수 (0번부터 시작) 
		char gen = gender.charAt(0); // gender라는 문자열에서 0번째 위치한 문자를 추출한다. 
		
		System.out.print("키를 입력하세요(cm) : ");
		Double height = sc.nextDouble();
		
		System.out.println("키 " + height + "인 " + age + "살 " + gender +"자 " + name +"님 반갑습니다.");
		
		// printf를 활용하면 좀 덜 번거로울때가 있다.
		System.out.printf("키 %.1f인 %d살 %c자 %s님 반갑습니다.",height,age,gen,name);
	}
	
	public void method2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 정수를 입력하세요: ");
		int num1 = sc.nextInt();
		
		System.out.print("두 번째 정수를 입력하세요: ");
		int num2 = sc.nextInt();
		
		System.out.println("더하기 결과 : " + (num1 + num2));
		System.out.println("빼기 결과 : " + (num1 - num2));
		System.out.println("곱하기 결과 : " + (num1 * num2));
		System.out.println("나누기 몫 결과 : " + (num1 / num2)); 
	}
	
	public void method3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("가로 : ");
		Double horizontal = sc.nextDouble();
		
		System.out.print("세로 : ");
		Double vertical = sc.nextDouble();
		
		System.out.println("면적 : " + horizontal * vertical);
		System.out.println("둘레 : " + 2 * (horizontal + vertical)); 
	}
	
	public void method4() {
		Scanner sc = new Scanner(System.in); 
		System.out.print("문자열을 입력하세요 : ");
		String str = sc.nextLine();
		
		System.out.println("첫 번째 문자 : " + str.charAt(0));
		System.out.println("두 번째 문자 : " + str.charAt(1));
		System.out.println("세 번째 문자 : " + str.charAt(2));
		
		
	}
}
