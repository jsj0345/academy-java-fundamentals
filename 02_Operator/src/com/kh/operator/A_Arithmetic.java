package com.kh.operator;

public class A_Arithmetic {
	
	public void method1() {
		//산술 연산자 : 이항 연산자로 연산 방법, 우선순위가 일반 수학 산술과 동일하다.
		//덧셈 : + , 뺄셈 : - , 곱셈 : *
		//나누기 몫 : / , 나누기 나머지 : % (modular 연산)
		
		int num1 = 10;
		int num2 = 3;
		
		//덧셈 연산
		System.out.println("num1 + num2 : " + num1 + num2); // 103
        // 덧셈이므로 앞에 있는 덧셈을 먼저함. 그런데 문자열 덧셈이므로 단순히 붙여짐.
		// 우선순위를 부여해보자.
		System.out.println("num1 + num2 : " + (num1 + num2)); // 13
		
		//뺄셈 연산
		//System.out.println("num1 - num2 : " +num1-num2); // 오류 발생
		//문자열 + 다른 자료형은 문자열이 되기 때문에 숫자 연산 처리를 먼저 하려면
		//우선순위 부여하기
		System.out.println("num1 - num2 : " + (num1 - num2)); // 7
		
		//곱셈 연산 (덧셈 연산보다 우선 순위가 높기 때문에 괄호없이도 곱셈 먼저 처리된 후 문자열 덧셈 처리됨.)
		System.out.println("num1 * num2 : " + num1 * num2); // 30
		//나누기 몫 연산
		System.out.println("num1 / num2 : " + num1 / num2); // 3
		//나머지 연산
		System.out.println("num1 % num2 : " + num1 % num2); // 1
		
		//나누기 주의사항으로 0으로 나눌 수 없음
		//ArithmeticException : / by zero 오류 발생 (콘솔창에 나옴) 
		//System.out.println(10/0);
		//System.out.println(10%0);
		
		
		
		
	}

}
