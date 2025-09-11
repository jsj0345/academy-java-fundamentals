package com.kh.operator;

public class B_InDecrease {
	/*
	 * 증감 연산자 : 단항 연산자로 한번에 1씩 증가하거나 1씩 감소하는 연산자.
	 * -먼저 증감을 수행할 것인지 나중에 증감을 수행할 것인지 연산자의 위치에 따라 결정된다.
	 * [표현법]
	 * ++ : 피연산자의 값을 1 증가시키는 연산자
	 * -- : 피연산자의 값을 1 감소시키는 연산자
	 * 
	 * 증감 연산자의 위치
	 * 전위 연산 : ++값, --값 (먼저 증감한뒤 다른 연산처리 수행)
	 * 후위 연산 : 값++, 값-- (다른 연산 처리 후 증감 수행) 
	 * 
	 * 
	 * 
	 */
	
	//후위연산
	public void method1() {
		
		int num = 10;
		System.out.println("num : " + num);
		
		num++; // num 값에 +1을 하겠다라는 의미. 
		System.out.println("num++ : " + num);
		
		num--; // num 값에 -1일 하겠다라는 의미.
		System.out.println("num-- : " + num); 
	}	
	
	//후위연산
	public void method2() {
		int a = 10;
		int b = a++; // 후위연산은 다른 연산이 끝나고나서 연산을함. 대입 연산이 있으니 10을 먼저 b에 초기화.
		// 그리고나서 후위연산 실행 a -> 11, b -> 10
		// 편하게 생각하면 그 행이 끝나기 전까지는 값이 올라가지않음. 
		 
		System.out.println("a : " + a); //11
		System.out.println("b : " + b); //10
		
		int c = 20;
		int d = c--; // 후위연산은 다른 연산이 먼저 끝나야 연산을함. 대입 연산부터 해야하므로 d는 20 라인이 넘어가면
		// c는 19 
		
		System.out.println("c : " + c); // 19
		System.out.println("d : " + d); // 20 
	}
	
	//전위연산 
	public void method3() {
		int a = 10;
		int b = ++a; // 대입 연산자 적용하기 전에 먼저 적용 (피 연산자 앞에 증감연산자가 붙는다.) 
		
		System.out.println("a : " + a); //11
		System.out.println("b : " + b); //11
		
		int c = 20;
		int d = --c;
		
		System.out.println("c : " + c);
		System.out.println("d : " + d);
	}
	
	//증감연산자 풀어서 사용해보기
	public void method4() {
		//전위연산
		int a = 10;
		//int b = ++a;
		++a;
		int b = a;
		
		//후위연산
		int c = 20;
		//int d = c++;
		int d = c;
		c++; 
		
	}
	
	public void method5() {
		int a = 10;
		int b = 20;
		
		System.out.println("a++ : " + a++); // 10 (후위 연산은 일단 다른 연산부터 해야하니까 먼저 문자열 합치는것 부터)
		System.out.println("a-- : " + a--); // 11 
		System.out.println("b++ : " + ++b); // 21 (전위 연산은 우선 순위라 먼저 증가) 
		System.out.println("--b : " + --b); // 20
	}
		
}


