package com.kh.practice;

import java.util.Scanner;

public class Practice_04 {
	
	public void method1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1~12 사이의 정수 입력: ");
		int number = sc.nextInt();
		
		switch(number) {
		  
		  case 3:
		  case 4:
		  case 5:
		  {
			  System.out.println(number+" 월은 봄입니다.");
			  break;
		  }
		  case 6:
		  case 7:
		  case 8:
		  {
			 System.out.println(number+ " 월은 여름입니다.");
			 break;
		  }
		  case 9:
		  case 10:
		  case 11:
		  {
			  System.out.println(number + " 월은 가을입니다.");
			  break;
		  }
		  
		  case 12:
		  case 1:
		  case 2:
		  {
			  System.out.println(number + " 월은 겨울입니다.");
			  break; 
		  }
		  
		  default: {
			  System.out.println(number + " 월은 잘못 입력된 달입니다.");
		  }
			  
		  
		}
		
	}

}
