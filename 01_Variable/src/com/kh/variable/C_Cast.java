package com.kh.variable;

public class C_Cast {
	/*
	 * 형변환 : 값의 종류 즉 자료형을 바꾸는 개념
	 * 
	 * 컴퓨터에서 값 처리 원칙
	 * 
	 * 1. = (대입연산자) 를 기준으로 양쪽이 같은 자료형이여야한다.
	 * 만약 다른 자료형일 경우 오른쪽 대입할 자료형을 변형시킨다.
	 * 
	 * 2. 같은 자료형끼리만 연산 처리 가능하다.
	 * 다른 자료형을 연산하려고 한다면 둘중 하나는 형변환을 통해 동일한 자료형으로 변환되어야한다.
	 * 
	 * 3. 연산의 결과도 동일한 자료형이여야한다.
	 * 
	 * [표현법] -> (바꿀자료형) 값;
	 * 형변환연산자, cast연산자 라고도 한다.
	 * 
	 * 형변환의 종류
	 * 1. 자동 형변환 : 자동으로 형변환되어 직접 형변환 연산자를 사용할 필요가 없음
	 * 작은 표현 범위의 자료형 -> 큰 표현 범위의 자료형
	 * 
	 * 2. 강제 형변환 : 자동형변환이 진행되지 않는 경우 직접 형변환을 해야한다.
	 *                형변환 연산자를 통해 처리하며
	 *                큰 표현 범위의 자료형 -> 작은 표현 범위의 자료형
	 *                위와 같이 표현범위의 손실이 있기 때문에 주의해야한다.
	 * */
	
	 //자동형변환
	 public void autoCasting() {
		 //1. int(4byte) -> double(8byte)
		 
		 int iNum1 = 20; // iNum1 이라는 변수에 20이라는 정수 대입
		 double dNum1 = iNum1; // dNum1이라는 실수자료형 double에 int자료형 넣기
		 
		 System.out.println("iNum1: " + iNum1);
		 System.out.println("dNum1: " + dNum1);
		 
		 int iNum2 = 12;
		 double dNum2 = 15.9;
		 
		 double result = /*(double)*/iNum2 * dNum2;
		 
		 System.out.println("iNum2 * dNum2 = " + result);
		 
		 //2. int(4byte) -> long(8byte)
		 int iNum3 = 1000;
		 long lNum3 = iNum3; // 자동 형변환 작은 범위인걸 큰 범위에 담는 개념 
		 // 기본적으로 정수는 int 자료형으로 설정되어있기 때문에 int의 범위를 넘는 숫자는 long으로 표기
		 long lNum4 = 2200000000L; // 2200000000 이렇게만 적으면 int가 디폴트라 범위에 벗어나기 때문에 L를 붙여주자.
		 
		 System.out.println("lNum3 : " + lNum3);
		 
		 //3. 특이케이스 1) long(8byte) -> float(4byte)
		 //float는 long보다 byte가 작지만 수의 표현 범위가 더 크기 때문에 자동형변환이 가능하다.
		 
		 long lNum5 = 2200000000L;
		 float fNum5 = /*(float)*/ lNum5;
		 
		 System.out.println("fNum5 : " + fNum5); 
		 
		 //4. 특이케이스 2) char(2byte) <-> int(4byte)
		 //char와 int는 양방향 형변환이 가능하다.
		 //문자표에 정해진 숫자와 문자대로 변환이 되는것. (아스키코드표)
		 char c = 90;
		 int i = 'z';
		 
		 System.out.println("c : " + c);
		 System.out.println("i : " + i); 
		 
	 }
	 
	 //강제 형변환
	 //큰 표현범위 -> 작은 표현범위 (값의 손실이 생길 수 있다.)
	 public void forceCasting() {
		 //강제형변환 또는 명시적 형변환 이라고 한다.
		 //[표현법] (바꿀자료형) 값;
		 
		 //1.float [double -> float]
		 
		 float f1 = 4.5f; // 리터럴을 f 표기로 float로 표기 (기본 실수는 double 표기이기 때문에) 
		 double d1 = 8.8; 
		 
		 float f2 = (float) d1; 
		 
		 //2. double -> int
		 double d2 = 9.9;
		 int i2 = (int) d2; 
		 System.out.println("i2 : " + i2); // 실수를 정수형으로 형변환 했기 때문에 소수점 아래값이 절삭된다. (값의 손실)
		 
		 //3. byte , short 형변환
		 byte b1 = 125; // 값의 표현범위가 허용되기 때문에 자동형변환
		 byte b2 = (byte) 128; // 값의 표현범위를 넘기 때문에 강제 형변환 필요 
		 
		 short s1 = 5000;
		 short s2 = (short) 50000; 
		 
		 //데이터 오버플로우 발생
		 System.out.println("b2 : " + b2); // -128 ~ 127까지 표현 가능한데 128은 127을 넘음 반시계 방향으로 감
		 System.out.println("s2 : " + s2);
	 }
	 
	

}
