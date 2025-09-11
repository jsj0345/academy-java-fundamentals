package com.kh.practice2.example;

import java.util.Scanner;

public class CastingPractice {

	public void method1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자 : ");
		String a = sc.next();
		char ch = a.charAt(0);
		int ch1 = ch; 
		
		System.out.println("A Unicode : " + (int) ch1);	
		
		sc.close(); 
	}
	
	public void method2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		double korean_score = sc.nextDouble();
		
		System.out.print("영어 : ");
		double english_score = sc.nextDouble();
		
		System.out.print("수학 : ");
		double math_score = sc.nextDouble();
		
		int total_score = (int) (korean_score + english_score + math_score);
		System.out.println("총점 : " + total_score);
		
		System.out.println("평균 : " + (total_score / 3));
		
		sc.close(); 
	}
	
	public void method3() {
		int iNum1 = 10;
		int iNum2 = 4;
		
		float fNum = 3.0f;
		
		double dNum = 2.5;
		
		char ch = 'A';
		
		System.out.println(iNum1 / iNum2); // 2
		System.out.println((int) dNum); // 2
		
		System.out.println((double) iNum2 * dNum); // 10.0 
		System.out.println((double) iNum1); // 10.0 
		
		System.out.println( (double) iNum1 /  iNum2 ); // 2.5
		System.out.println( dNum ); // 2.5 
		
		System.out.println( (int) fNum ); // 3
		System.out.println( iNum1 / (int) fNum ); // 3
		
		System.out.println( (float)iNum1 / fNum ); // 3.333333
		System.out.println( (double) iNum1 /  fNum); // 3.3333333333333335
		
		System.out.println(ch);
		System.out.println((int) ch);
		System.out.println((int) ch + iNum1);
		System.out.println( ((char)((int)ch + iNum1))); 
		
		
		
		
	}
}
