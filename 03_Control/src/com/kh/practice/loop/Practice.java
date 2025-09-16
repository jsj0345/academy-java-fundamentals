package com.kh.practice.loop;

import java.util.Scanner;

//1, 3, 5, 6, 11번 문제 (9월 15일) 
public class Practice {
	
	//1번 문제
	public void method01() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1 이상의 숫자를 입력하세요 : ");
		int number = sc.nextInt();
		
		if(number >= 1) {
			for(int i = 1; i < number + 1; i++) {
				System.out.print(i);
				System.out.print(" ");
			}
		} else {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		}
	}
	
	//3번 문제
	public void method03() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1 이상의 숫자를 입력하세요 : ");
		int number = sc.nextInt();
		
		if(number >= 1) {
			for(int i = number; i >= 1; i--) {
				System.out.print(i);
				System.out.print(" ");
			}
		} else {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		}
	}
	
	//5번 문제
	public void method05() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 하나 입력하시오 : ");
		int number = sc.nextInt();
		
		String str = "";
		String plus = " + "; 
		int sum = 0;
		
		for(int i = 1; i < number + 1; i++) {
		  sum += i;
		  
	      if (i == number) {
	    	  str = str + i;
	    	  break; 
	      }
	      
		  str = str + i + plus; 
		   
		  
		  
		}
		
		System.out.println(str + " = " + sum);
	}
	
	//6번 문제
	public void method06() {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 숫자 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 숫자 : ");
		int num2 = sc.nextInt(); 
		
		
		if (num1 > 0 && num2 > 0) {
		  
		  if (num1 <= num2) {
			  for(int i = num1; i < num2 + 1; i++) {
				  System.out.print(i);
				  System.out.print(" ");
			  }  
		  } else {
			  
			  for(int i = num2; i < num1 + 1; i++) {
				  System.out.print(i);
				  System.out.print(" ");
			  } 
			  
		  }
		  
		  
	    } else {
	    	System.out.println("1 이상의 숫자를 입력해주세요.");
	    }
		
	}
	
	public void method11() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("시작 숫자 : ");
		int a = sc.nextInt();
		
		System.out.print("공차 : ");
		int d = sc.nextInt();
		
		String str = "";
		
		for(int i = 0; i < 10; i++) {
			if(i == 0) {
				str = a + str;
			} else {
				str = str + " " + (a+d*(i)); 
			
			}
		}
		
		System.out.println(str);
		
	}
}
