package com.kh.operator;

public class E_Comparison {
	
	//비교 연산자(관계연산자)
	/*
	 * 두개의 값을 비교하는 이항 연산자
	 * 비교 연산을 한 논리값(true/false)로 나눈다.
	 * 특정 조건을 제시할 수 있는 제어문에서 많이 사용된다.
	 * 
	 * -종류
	 * 1. 크고 작음을 비교
	 * a > b : a가 b보다 큰가?
	 * a < b : a가 b보다 작은가?
	 * a >= b : a가 b보다 크거나 같은가?
	 * a <= b : a가 b보다 작거나 같은가?
	 * 
	 * 2. 일치함을 비교
	 * a == b : a와 b가 일치하나요? (동등비교)
	 * a != b : a와 b가 같지 않은가?
	 */
	
    public void method1() {
      int a = 10;
      int b = 20;
      
      //비교 연산 처리해보기
      //비교연산자는 산술연산자보다 우선순위가 낮기 때문에 우선순위 부여하기
      
      System.out.println("a > b : " + (a > b));
      System.out.println("a < b : " + (a < b));
      System.out.println("a >= b : " + (a >= b));
      System.out.println("a <= b : " + (a <= b));
      
      //동등비교
      boolean result = (a==b); // a와 b가 같은가?
      System.out.println("a==b : " + result);
      
      result = (a!=b); // a와 b가 같지 않은가?
      System.out.println("a!=b : " + result);
      
      //산술연산 + 비교연산 
      //a-b가 0보다 작은가? 
      System.out.println("a-b가 0보다 작습니까? : " + ((a-b) < 0));
      
      //a가 짝수입니까?
      //a를 2로 나누었을때 나머지값이 0인 경우 
      System.out.println("a가 짝수입니까?: " + ((a % 2) == 0));
      
      //b가 홀수입니까?
      //2로 나눈 나머지값이 0이 아닌경우
      b = 13; 
      System.out.println("b가 홀수입니까?: " + ((b % 2) != 0));
      
     
     
    }

}
