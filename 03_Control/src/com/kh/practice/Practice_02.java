package com.kh.practice;

import java.util.Scanner;

public class Practice_02 {
	
	public void method1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 한 개 입력하세요: ");
		int number = sc.nextInt();
		
		if (number > 0) {
			
			if (number % 2 ==0) {
				System.out.println("짝수다.");
			} else {
				System.out.println("홀수다.");
			}
			
		} else {
			System.out.println("양수만 입력해주세요.");
		}
		
		sc.close(); 
	}

}
