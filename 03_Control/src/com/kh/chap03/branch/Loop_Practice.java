package com.kh.chap03.branch;

import java.util.Scanner;

public class Loop_Practice {
	
	public void method02() {
		Scanner sc = new Scanner(System.in);
		
	
		while (true) {
			System.out.print("1 이상의 숫자를 입력하세요 : ");
			int number = sc.nextInt();
	        if(number>=1) {
	    	   for(int i = 1; i < number + 1; i++) {
	    		System.out.print(i);
	    		System.out.print(" ");
	    	   }
	        } else {
	    	  System.out.println("1 이상의 숫자를 입력해주세요.");
	        }
	        
	        System.out.println();
	    
		}
	}
	
	public void method04() {
		Scanner sc = new Scanner(System.in);
		
			
		while(true) {
			
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
			System.out.println();
			
		}
		
	}
	
	public void method07() {
		
		Scanner sc = new Scanner(System.in);
		
			
		while(true) {	
			
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
		  
		 System.out.println(); 
	   }
			
	}
	
	public void method09() {
		Scanner sc = new Scanner(System.in);
		
		
			System.out.print("숫자 : ");
			int number = sc.nextInt();
			
			
			
			if(number >=1 && number<=9) {
				System.out.println("=====" + " " + number + "단" + " " + "=====");
			 for(int i = 1; i < 10; i++) {
				System.out.println(number + " * " + i + " = " + (number*i));
			  }
			} else {
				System.out.println("9 이하의 숫자를 입력해주세요.");
			}
			
			
		
	}
	
	public void method08() {
        Scanner sc = new Scanner(System.in);
		
		
			System.out.print("숫자 : ");
			int number = sc.nextInt();
			
			
			if(number >= 1 && number <=9) {
			   System.out.println("=====" + " " + number + "단" + " " + "=====");
			   for(int j = number; j < 10; j++) {
			     for(int i = 1; i < 10; i++) {
				   System.out.println(number + " * " + i + " = " + (j*i));
			     }
			   }  
			} else {
				System.out.println("9 이하의 숫자만 입력해주세요.");
			}
	}
		
	
	
	public void method10() {
		
		 Scanner sc = new Scanner(System.in);
			
			while(true) {
				System.out.print("숫자 : ");
				int number = sc.nextInt();
				
				
				if(number >= 1 && number <=9) {
				   System.out.println("=====" + " " + number + "단" + " " + "=====");
				   for(int j = number; j < 10; j++) {
				     for(int i = 1; i < 10; i++) {
					   System.out.println(number + " * " + i + " = " + (j*i));
				     }
				   }  
				} else {
					System.out.println("9 이하의 숫자만 입력해주세요.");
				}
			}
		
	 }
	
	 public void method12() {
		 Scanner sc = new Scanner(System.in);
		 
		 while(true) {
			 System.out.print("연산자(+, -, *, /, %) : ");
			 String operator = sc.next();
			 
			 System.out.print("정수1 : ");
			 int number1 = sc.nextInt();
			 System.out.print("정수2 : ");
			 int number2 = sc.nextInt();
			 
			 
			 switch(operator) {
			   case "+" : System.out.println(number1 + " " + operator + " " + number2 + " " + 
			     " = " + (number1 + number2));
			             break; 
			   
			   case "-" : System.out.println(number1 + " " + operator + " " + number2 + " " + 
					     " = " + (number1 - number2));
			             break; 
			   
			   case "*" : System.out.println(number1 + " " + operator + " " + number2 + " " + 
					     " = " + (number1 * number2));
			              break; 
			   
			   case "/" : 
				   if(number2 == 0) {
					   System.out.println(number2+"으로 나눌 수 없습니다. 다시 입력해주세요.");
					   break; 
				   }
				   
				   System.out.println(number1 + " " + operator + " " + number2 + " " + 
				   " = " + (number1 / number2));
			       break; 
			   
			   case "%" : 
				   
					   System.out.println(number1 + " " + operator + " " + number2 + " " + 
							   " = " + (number1 % number2));
					   break;
			          
			   default : System.out.println("없는 연산자입니다. 다시 입력해주세요.");           
			   
			
			 }
		 }
	 }
	 
	 public void method13() {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("정수 입력 : ");
		 int number = sc.nextInt(); 
		 
		 for(int i = 1; i <=number; i++) {
			 for(int j=1; j<=i; j++) {
				 System.out.print("*");
			 }
			 System.out.println();
		 }
		
	 }
	
	 public void method14() {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("정수 입력 : ");
		 int number = sc.nextInt(); 
		 
		 for(int i = 0; i <=number; i++) {
			 for(int j=1; j<=(number-i); j++) {
				 System.out.print("*");
			 }
			 System.out.println();
		 }
		 
	 }
	
	

}
