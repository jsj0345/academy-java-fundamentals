package com.kh.practice;

import java.util.Scanner;

public class Practice_08 {
	
	public void method1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("피연산자1 입력: ");
		int number1 = sc.nextInt();
		System.out.print("피연산자2 입력: ");
		int number2 = sc.nextInt();
		
		
		
		System.out.print("연산자를 입력(+,-,*,/,%) : ");
		String operator = sc.next(); 
		
		switch(operator) {
		  case "+": 
		  {
			  System.out.println(number1 + " " + operator + " " + number2 + " = " + (number1 + number2));
			  break;
		  }
		  
		  case "-": 
		  {
			  System.out.println(number1 + " " + operator + " " + number2 + " = " + (number1 - number2));
			  break;
		  }
		  
		  case "*": 
		  {
			  System.out.println(number1 + " " + operator + " " + number2 + " = " + (number1 * number2));
			  break;
		  }
		  
		  case "/" :
		  {
			  System.out.println(number1 + " " + operator + " " + number2 + " = " + (number1 / (double) number2));
		      break;
		  }
		  
		  case "%": {
			  System.out.println(number1 + " " + operator + " " + number2 + " = " + (number1 % number2));
			  break;
		  }
		  
		  default : 
		  {
			  System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");
		  }
			  
		}
		
	}

}
