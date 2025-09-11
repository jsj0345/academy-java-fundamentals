package com.kh.operator;

public class C_Compound {
	//복합 대입 연산자
	
	public void method1() {
		int num = 10;
		
		System.out.println("현재 num : " + num);
		//복합대입 연산자를 이용하여 현재 값에 +3을 하고자 한다.
		//기존 순수 대입 방식
		num=+3;
		
		System.out.println("num=+ : " + num); // 3
		
		//현재 num +3을 하고 싶다면 num+3을 수행해야한다.
		num = num + 3; 
		System.out.println("num = num + 3 : " + num); // 6
		
		System.out.println(num - 10); // -4
		
		System.out.println("num : " + num); // 6
		
		//num = num + 3; 을 복합 대입 연산자로 표현
		num+=3;
		
		System.out.println("num+=3 : " + num); // 9 
		
		int a = 10;
		//복합대입 연산자를 이용하여 a에 5을 더해놓고자 한다.
		a+=5;
		//a = a + 5;
		System.out.println("a+=5 : " + a); // 15
		
		//복합 대입 연산자를 이용하여 a에 3을 감소 시켜 넣고자 한다.
		a-=3;
		//a = a - 3;
		System.out.println("a-= : " + a); // 12
		
		//복합 대입 연산자를 이용하여 a에 2를 곱하여 넣겠다.
		a*=2;
		//a = a * 2;
		System.out.println("a*= : " + a); // 24
		
		//복합 대입 연산자를 이용하여 a에 3을 나누어 넣겠다.
		a/=3;
		//a = a / 3;
		System.out.println("a/= : " + a); // 8
		
		//복합 대입 연산자를 이용하여 a에 3을 나눈 나머지값을 넣겠다.
		a%=3;
		//a = a % 3;
		System.out.println("a%=3 : " + a); // 2
	}

}
