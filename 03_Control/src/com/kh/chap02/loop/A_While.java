package com.kh.chap02.loop;

public class A_While {
	
	/*
	 * while문
	 * 괄호 안에 조건이 true일 경우 해당 구문을 반복적으로 실행한다.
	 * 조건식 부분에 true를 작성하면 무한 반복 구문이 된다.
	 * 
	 * [표현법]
	 * 초기식; - 필수는 아니다.
	 * while(조건식) { - 조건식의 결과는 논리값이여야 한다. (true/false)
	 * 
	 *   조건식이 true일 경우 수행할 구문;
	 *   [증감문 또는 분기문]; - 필수는 아니다.
	 * }
	 * 
	 * */
	
	public void method01() {
		//반복문을 이용하여 출력해보자. 
		System.out.println("안녕하세요.");
		System.out.println("안녕하세요."); // ctrl + alt + 아래키 를 누르면 복사 가능. 
		System.out.println("안녕하세요.");
		System.out.println("안녕하세요.");
		System.out.println("안녕하세요.");
		
		//위 작업을 반복문을 이용하여 처리해보자.
		//안녕하세요를 5번 출력하기.
		
		//초기식 작성
		int i = 1; // i라는 변수에 1이라는 정수를 대입한다. (기준)
		
		//while 작성
		while(i<=5) { // while 옆 조건식에는 논리값이 나올 수 있는 조건을 작성한다.
			//i가 5보다 작거나 같은 동안에 반복을 수행.
			System.out.println("i값은 : " + i);
		    i++;
		    //증감식 i값을 1씩 증가시킨다.
		}
		
		//while문을 이용하여 안녕하세요 5번 출력하기
		i = 1; 
		while(i < 6) { 
			System.out.println("안녕하세요.");
			i++; 
		}
	}
	
	public void method02() {
		
		//1씩 감소하는 형태로 증감식을 이용해보기
		//i값이 10에서 시작하여 1이 될때까지 감소하는 형식의 구문 작성해보기
		int i = 10;
		
		while(i>=1) {
			System.out.println("i값 : " + i);
			i--; // 감소시키는 증감문 이용하기
		}
		
		//10에서부터 1까지 순서대로 출력하는 구문을 작성해보기.
		
		int j = 1;
		int num = 10; // 감소시키면서 출력할 변수 
		
		//j는 반복을 위한 기준 및 범위 용도로 사용
		//num은 출력용으로 사용
		while(j < 11) {
			System.out.println(num--);
			j++; 
		}
	}
	
	public void method03() {
		
		//증감연산을 2씩 하여 반복해보기
		int i = 1;
		
		while(i < 11) {
			System.out.println("i 값 : " + i);
			i+=2;
		}
		
		System.out.println();
		
		int j = 1;
		while(j<=5) {
			System.out.println("안녕하세요.");
			j++; 
		}
	}
	
	public void method04() {
		//1~100까지 짝수만 더해서 결과값 출력해보기
		//while문 사용 
		
		int i = 1;
		
		int sum = 0; 
		
		while(i < 101) { // i 값이 100이하일때까지 반복 수행
			
			if(i % 2 == 0) { // 짝수 판별 조건
				//해당 조건에 i 값은 짝수
				//해당 i값을 더해 넣을 변수가 필요하다. 
				sum+=i; // sum = sum + i;
			}
			i++;
		}
		
		//모든 반복을 수행한 후 결과값 출력 
		System.out.println("1~100까지 짝수만 더한 결과 : " + sum);
	}
	
	
}


