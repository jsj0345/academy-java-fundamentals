package com.kh.chap01.example;

import java.util.Scanner;

public class C_Switch {
	
	/*
	 * [표현법]
	 * switch(대상자) {
	 *  case 값1 : 실행구문; break;
	 *  case 값2 : 실행구문; break;
	 *  
	 *  .....
	 *  
	 *  case 값N : 실행구문; break;
	 *  
	 *  default : 위 값들이 모두 아닐 경우 수행할 구문; (생략가능)
	 *  
	 * }
	 * 
	 * default 구문은 if else 구문에서 else의 역할을 수행한다.
	 * 위에 있는 case 중 일치하는 값이 없다면 default구문이 수행된다. (생략도 가능하다)
	 * 대상자와 일치하는 값의 case로 이동하여 해당 구문을 수행하고
	 * break; 구문을 만나면 switch 영역을 벗어난다.
	 * break; 구문을 넣지 않는다면 영역을 벗어나지 않고 흐름이 유지된다.
	 * 
	 * if 구문과의 차이
	 * -if구문은 조건식에 범위 표현이 가능하지만 switch구문은 범위 표현이 불가능하다.
	 * 대상자로 사용할 값이 존재해야한다. (동등비교 수행)
	 * switch 구문 대상자에는 문자열도 비교가 가능하다. 
	 * */
	
	 public void method1() {
		 //입력받은 값으로 홀수 짝수 판별
		 //ctrl+shift+o -> 자동완성기능 (import 써줌) 
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.print("정수 입력 : ");
		 int num = sc.nextInt();
		 
		 //num을 2로 나눈뒤 나머지가 0인경우 짝수 1인경우 홀수
		 switch(num % 2) { // num % 2 연산 처리 결과가 대상자가되어 동등비교 처리가 된다. 
		   case 0 :
			  System.out.println("짝수입니다.");
			  break;
		   case 1 :
			  System.out.println("홀수입니다.");
		      break;
		 }
		 
		 sc.close(); 
	 }
	 
	 public void method2() {
		 //주민등록번호 입력받고 1,3 남자 2,4 여자 출력하기
		 //switch문으로 이용해보기
		 
		 Scanner sc = new Scanner(System.in);
		 System.out.print("주민번호를 입력하세요: ");
		 String number = sc.nextLine();
		 //char gen = number.charAt(7);
		 
		 
		 switch(number.charAt(7)) {
		   case '1' : 
		   case '3' : 
			   System.out.println("남자입니다.");
			   break; 
		   case '2' :
		   case '4' : 
			   System.out.println("여자입니다.");
		       break;
		       
		   default :
			   System.out.println("성별 알아내기 불가능"); 
			   break; 
		 }
	 }
	 
	 //switch문 대상자에 문자열을 넣어 문자열 비교 처리 해보기
	 public void method3() {
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("과일을 입력해주세요 ");
		 
		 //입력받은 과일 문자열을 넣어놓기
		 String fruit = sc.nextLine();
		 
		 switch(fruit) {
		   case "사과" : 
			   System.out.println("사과는 5000원");
			   break;
		   case "딸기" :
			   System.out.println("딸기는 10000원");
			   break;
		   case "망고" :
			   System.out.println("망고는 20000원");
		       break;
		   
		   default : 
			   System.out.println("안팔아요"); 
		 }
		 
		 sc.close(); 
	 }
	 
	 //문자열 비교 메소드인 equals() 메소드 알아보기
	 public void method4() {
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("과일을 입력해주세요 : ");
		 String fruit = sc.nextLine(); 
		 
		 /*
		 if(fruit == "사과") {
			 System.out.println("사과는 5000원");
		 } else if(fruit == "수박") {
			 System.out.println("수박은 15000원");
		 } else if(fruit == "메론") {
			 System.out.println("메론은 20000원");
		 } else {
			 System.out.println("안팔아요");
		 } // 다른 이유는 sc.nextLine()이 String을 반환함. 여기서 이미 객체를 반환하는거임 new String이라 참조값이 매번 생성됨
		   // String pool은 String a = "abc"; 
		 */ 
		 
		 //위 구문처럼 문자열은 == , != 와 같은 동등비교 연산자로는 비교할 수 없다.
		 //참조 자료형이기 때문에 참조변수에는 문자열이 아닌 주소값이 담겨있어서 주소값 비교가 되는것.
		 //문자열 비교를 하려면 String 클래스에서 제공하는 문자열.equals(비교문자열) 메소드를 사용한다.
		 
		 
		 if(fruit.equals("사과")) {
			 System.out.println("사과는 5000원");
		 } else if(fruit.equals("수박")) {
			 System.out.println("수박은 15000원");
		 } else if(fruit.equals("메론")) {
			 System.out.println("메론은 20000원");
		 } else {
			 System.out.println("안팔아요");
		 } 
		 
		 sc.close(); 
		 
		 /*
		 String a = "abc";
		 String b = "abc";
		 
		 System.out.println(a == b); // true 
		 
		 String pool은 똑같은 문자열을 같은 참조값으로 보관
		 */
		 
		 
	 }
	 
	
}
