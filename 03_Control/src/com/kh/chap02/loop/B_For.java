package com.kh.chap02.loop;

import java.util.Scanner;

public class B_For {
	/*
	 * for문
	 * 괄호 안에 반복을 지정하는 부분이 있고
	 * 초기식;조건식;증감문 세가지로 이루어진다.
	 * 초기식,조건식은 각각 ; 로 구분되어진다.
	 * 
	 * [표현법]
	 * for(초기식;조건식;증감문) {
	 *   반복수행할 코드
	 * }
	 * 
	 * -초기식 : 반복문이 수행될때 초기에 한번만 실행되는 구문.
	 *          반복문에서 사용할 변수를 선언 및 초기화 하는 용도로 이용한다.
	 *
	 * -조건식 : 반복문이 실행될 조건을 작성하는 구문
	 *          조건식의 결과가 true라면 반복문을 수행한다.
	 *          만약 조건식의 결과가 false라면 반복문을 벗어난다.
	 *          
	 * -증감문 : 반복문을 제어하는 변수값을 증감시키는 구문
	 *          보통 초기식에서 선언된 변수를 이용하여 증감문을 작성한다.
	 *          주로 증감연산자 사용         
	 *          
	 * */
	
	public void method01() {
		//while문을 for문으로 변경해보기
		//안녕하세요 5번 출력하는 반복문 작성
		int i = 1;
		
		while(i<=5) {
			System.out.println("안녕하세요.");
			i++;
		}
		
		System.out.println("====================");
		
		for(int j = 0; j < 5; j++) {
			System.out.println("안녕하세요.");
		}
		
		//for문에서 초기식에 선언된 변수는 for문 내에서만 사용 가능하다. (지역변수) 
		
	}
	
	public void method02() {
		//for문의 보편적인 사용법
		//반복횟수를 정해서 반복을 수행한다.
		//이때 사용되는 초기식, 조건식, 증감식 모두 반복횟수를 지정하기 위한 역할이 크다.
		//for문의 기본형태
		for(int i = 0; i < 10; i++) { //10번 반복 수행 for문
			System.out.println("i 값 : " + i);
		}
		
		//for문에서도 여러 방법으로 반복 횟수를 지정할 수 있다.
		//ex) 감소구문, 복합대입연산자 등등..
		System.out.println("==================");
		
		//감소하는 예시
		for(int i = 10; i > 0; i--) {
			System.out.println(i);
		}
		
		System.out.println("==================");
		//2씩 증가하는 형식으로 반복 수행 - 5번 반복시키는 반복문
		for(int i = 0; i < 10; i+=2) {
			System.out.println(i);
			
		}
		
		//while의 무한반복 표현
		/*
		while(true) {
			System.out.println("무한 반복");
		}
		*/
		
		//for문의 무한반복 표현
		/*
		for( ; ; ) {
			System.out.println("무한 반복");
		}
		*/ 
	}
	
	public void method03() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열을 입력해주세요 : ");
		String str = sc.nextLine();
		
		//입력받은 문자열의 각 인덱스 위치에 해당하는 문자를 모두 출력해보기
		//안녕하세요
		
		for(int i = 0; i < 5; i++) {
			//반복에 이용되는 i값이 0부터 4까지 순차적으로 증가되기때문에
			//해당 값을 이용하면 증가된 값까지의 인덱스 접근을 할 수 있다. 
			System.out.println(str.charAt(i));
		}
		
		sc.close(); 
	}
	
	public void method04() {
		//위 구문으로 문자를 추출시 범위보다 적으면 오류발생
		//범위보다 많으면 출력되지 않는 문제가 있다.
		//이를 해결하기 위해 동적으로 문자열의 길이를 알아낼 수 있는 메소드를 이용하여야함.
		
		String str = "안녕하세요"; 
		//위와같이 문자열의 길이가 정해져있는 경우 반복횟수도 정해놓으면 문제 없음
		
		//하지만 Scanner를 이용하여 동적으로 받아오는 경우
		//사용자가 입력하기 전까지는 몇글자가 입력될지 알 수 없음.
		//때문에 해당 문자열을 입력 받고 문자열의 길이를 알아내어
		//그 길이만큼 반복을 수행해야 하다. 
		
        Scanner sc = new Scanner(System.in);
		//사용자에게 입력받기 
		System.out.print("문자열을 입력해주세요 : ");
		
		str = sc.nextLine();
				
		for(int i = 0; i < str.length(); i++) {
			//반복에 이용되는 i값이 0부터 4까지 순차적으로 증가되기때문에
			//해당 값을 이용하면 증가된 값까지의 인덱스 접근을 할 수 있다. 
			System.out.println(str.charAt(i));
		}
		
		sc.close(); 
	}
	
	public void method05() {
		//for문을 이용하여
		//1부터 사용자가 입력한 값까지 모두 더한 값을 출력해보시오.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하시오 : ");
		int number = sc.nextInt();
		
		int sum = 0; 
		
		for(int i = 1; i < number + 1; i++) {
			sum+=i; 
		}
		
		System.out.println("1부터 입력한 값까지 모두 더한 결과 : " + sum);
		
		sc.close(); 
	}
	
	public void method06() {
		//for문을 이용하여
		//구구단을 출력해보기 - 사용자가 입력한 수의 단을 출력해보시오.
		//ex) 입력 : 2
		//2 X 1 = 2
		//2 X 2 = 4 .....
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하시오 : ");
		int number = sc.nextInt(); 
		
		for(int i = 1; i < 10; i++) {
			System.out.println(number + " X " + i + " = " + (number * i));
		}
		
		sc.close(); 
	}
	
	//중첩 반복문 배워보기
	//for문을 중첩해서 사용해보자.
	public void method07() {
		//구구단을 2단부터 9단까지 모두 출력해보기
		
		//1부터 9까지 순차적으로 증가하는 반복문 
		for(int i = 1; i<=9; i++) {
			System.out.println(2 + "X" + i + "=" + (2*i));
		}
		
		for(int i = 2; i < 10; i++) {
			for(int j = 1; j < 10; j++) {
				System.out.println(i + "X" + j + "=" + (i*j));
			}
		}
	}
	
	public void method08() {
		//스쿼트 15회씩 5세트를 해보자.
		//각 세트별로 OO세트 시작! 출력하고
		//ex) 스쿼트 1회 ... 스쿼트 15회 와 같이 출력해보기
		//세트가 끝나면 OO세트 끝! 을 출력하기
		
		for(int i = 1; i < 6; i++) {
			
			System.out.println(i + "세트 시작!");
			
			for(int j = 1; j < 16; j++) {
				System.out.println("스쿼트 " + j +"회");
			}
			
			System.out.println(i + "세트 끝!");
		}
	}

}
