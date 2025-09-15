package com.kh.practice;

import java.util.Scanner;

public class Practice_03 {
	
	public void method1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어점수: ");
		int score1 = sc.nextInt();
		
		System.out.print("수학점수: ");
		int score2 = sc.nextInt();
		
		System.out.print("영어점수: ");
		int score3 = sc.nextInt();
		
		int sum = score1 + score2 + score3;
		System.out.println("합계 : " + sum);
		
		double average = (score1 + score2 + score3) / 3.0; 
		
		if((score1 >= 40 && score2>=40 && score3>=40) && (average >= 60)) {
			System.out.println("평균 : " + average);
			System.out.println("축하합니다. 합격입니다!");
		} else {
			System.out.println("불합격입니다.");
		}
		sc.close(); 
	}

}
