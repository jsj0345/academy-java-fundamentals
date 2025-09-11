package com.kh.variable;

public class A_Variable {

	//변수의 필요성
	//시급과 근무시간을 곱하여 급여를 계산하는 메소드(기능)을 작성해보자.
	public void calPay() {
		System.out.println("---변수 사용 전---");
		
		System.out.println("시급 : 9500원");
		System.out.println("근무 시간 : 6시간");
		System.out.println("근무 일 수 : 8일");
		
		//급여 : 시간 X 근무 시간 X 근무 일 수
		//OOO님의 급여는 OOO원 입니다. 를 출력해보자.
		System.out.println("김알바님의 급여는 456000원 입니다.");
		//위 계산 작업을 출력문에 추가하여 계산 시키기
		//곱셈 연산자 : * 
		System.out.println(9500 * 6 * 8);
		
		//출력문 여러개 써서 만들어보기
		System.out.print("김알바님의 급여는 ");
		System.out.print(9500*6*8);
		System.out.println("원 입니다.");
		
		//문자열과 다른 자료형을 더해보기.
		System.out.println("김알바님의 급여는 9500*6*8원 입니다.");
		
		//문자열+연산처리
		System.out.println("김알바님의 급여는 " + 9500*6*8 + "원 입니다.");
		
		//아르바이트를 하다가 500원을 주웠다. 몰래 주머니에 넣었습니다.
		//내가 총 갖게되는 급여는?
		System.out.println("김알바님의 급여는 " + 9500*6*8 + 500 + "원 입니다.");
		// 이렇게되면 곱셈을 먼저하고 앞에 덧셈이 있기 때문에 문자열로 합쳐짐 그래서 결국 500도 합쳐짐
		// 문자열+다른 자료형은 문자열이 되기 때문에 숫자 연산처리가 필요한 경우엔
		// ()를 이용하여 우선순위를 높여줘야한다.
		System.out.println("김알바님의 급여는 " + (9500*6*8+500)+"원 입니다."); 
		
		
	}
	
	// 위 작업을 변수로 처리하여 사용해보기
	public void calpay2() {
		System.out.println("---변수 처리 후---");
		//시급,근무시간,근무일수 모두 각각 변수에 담아서 사용하기
		
		//정수형 자료형중 기본형인 int 자료형 사용하기 (4byte) 
		int pay = 9500; // 시급
		int time = 6; // 근무 시간 
		int day = 8; // 근무 일 수
		
		//변수를 이용하여 출력해보기
		System.out.println("시급 : "+ pay +"원");
		System.out.println("근무 시간 : " + time + "시간");
		System.out.println("근무 일 수 : " + day + "일");
		
		//OOO님의 급여는 OOO원 입니다.
		//System.out.println("김알바님의 급여는 " + (9500*6*8) + "원 입니다.");
		System.out.println("김알바님의 급여는 " + pay*time*day + "원 입니다.");
		System.out.println("박알바님의 급여는 " + pay*time*day + "원 입니다.");
		System.out.println("최알바님의 급여는 " + pay*time*day + "원 입니다.");
		
		/*
		 * 변수를 사용하는 목적
		 * 1. 변수는 우선적으로값에 의미를 부여하기 때문에 가독성이 증가한다.
		 * 2. 한번 값을 기록 후 필요시에 불러 사용이 가능하다. (재사용성 증가)
		 * 3. 가독성 + 재사용성 : 유지보수 용이
		 */
	}
	
	//변수의 선언
	public void declareVariable() {
		/*
		 * 변수의 선언
		 * -값을 기록하기 위한 변수를 메모리 공간에 확보하겠다.
		 * [표현법] 자료형 변수명;
		 * 자료형 : 변수의 크기 또는 종류를 나타내는 부분
		 * 변수명 : 변수의 이름을 지정하는 부분
		 * 
		 * 변수를 선언할때 주의 사항
		 * 1. 변수명은 항상 소문자로 시작하고 단어와 단어 구분은 대소문자로 구분한다. (낙타봉표기법)
		 * 2. 같은 영역 (), { } 안에서는 변수명이 중복될 수 없다.
		 * 3. 해당 영역에 선언된 변수는 해당 영역에서만 사용 가능하다. (지역변수 개념)
		 * 
		 */
		
		//1. 논리형 자료형 (논리값 : true/false) - 1byte
		boolean flag;
		boolean flag2;
		
		flag = true; // 참
		flag2 = false; // 거짓
		
		System.out.println("flag에 담긴 값 : " + flag);
		System.out.println("flag2에 담긴 값 : " + flag2);
		
		flag = (10 < 3); // 10이 3보다 작은가? 
		//판별 용도로 많이 사용 				
		
		System.out.println("flag에 담긴 값 : " + flag);
		
		
		//2. 숫자형 자료형
		//2-1 정수형 자료형 : 사이즈에 따라서 저장할 수 있는 수의 표현범위가 다르다.
		byte bNum; // 1바이트
		short sNum; // 2바이트
		int iNum; // 4바이트
		long lNum; // 8바이트
		
		bNum = 1;
	    sNum = 2;
	    iNum = 4;
	    lNum = 8L; // int 자료형 표현 범위를 벗어나는 (long 범위) 경우 L을 붙여 표현
	    
	    System.out.println("bNum : " + bNum);
	    System.out.println("sNum : " + sNum);
	    System.out.println("iNum : " + iNum); // int가 정수중에서 기본형
	    System.out.println("lNum : " + lNum);
	    
	    //2-2 실수형 : 사이즈에 따라서 저장할 수 있는 소수점 표현이 다르다.
	    float fNum; // 4byte
	    double dNum; // 8byte
	    
	    fNum = 0.9f; //실수에 f를 붙여서 float 라는 것을 선언해야한다. (리터럴값에)
	    dNum = 1.1d; // double이 실수중 기본형     
	    
	    System.out.println("fNum : " + fNum);
	    System.out.println("dNum : " + dNum); 
	    
	    //3. 문자 자료형
	    char c; // 2byte
	    
	    c = 'a'; // 문자형에는 한글자 표현만 가능하다. ' ' 에 작성하여야 한다. 
	    System.out.println("c : " + c); 
	    
	    // c = 'abc'; - 한글자만 가능
	    // c = "c"; - 한글자여도 "" 표기는 문자열 표기다. (주의)
	    c = 65;
	    System.out.println("c : " + c);
	    
	    //4. 문자열 - 참조 자료형
	    String str;
	    str = "abc";
	    
	    System.out.println("str : " + str); 
	    
	    str = "a"; //한글자여도 "" 표기시 문자열이다. 
	    System.out.println("str : " + str);
	    
	    str = ""; //빈문자열 표기도 가능
	    System.out.println("str : " + str);
	    
	    // 출력 메소드 3종류 확인해보기 (print, println, printf)
	    // 1. System.out.print(); - 줄바꿈 없이 출력해주는 메소드
	    // 2. System.out.println(); - 줄바꿈하여 출력해주는 메소드
	    
	    // 줄바꿈 없이 형식에 맞춰 출력해주는 메소드 
	    // 3. System.out.printf("출력하고자 하는 형식", 형식에 들어갈 데이터들); 
	    // %d : 정수 , %s : 문자열 , %c : 문자, %f : 실수
	    
	    //printf를 이용하여 출력해보기
	    System.out.printf("정수 : %d, 문자 : %c, 문자열 : %s, 논리값 : %b, 실수 : %.1f",
	    		iNum, c, str, flag, dNum);
	    
	    //printf는 줄바꿈 해주지 않음
	    System.out.println(); // 줄바꿈 역할로 사용
	    System.out.println("정수 : " + iNum + ", 문자 : " + c + ", 문자열: " + str +
	    		", 논리값 : " + flag + ", 실수 : " + dNum); 
	   	
	}
	
	//상수 : 변수에 값을 초기화 한 뒤 변경할 수 없는 값. 
	public void constant() {
		//[표현법] final 자료형 상수명;
		// 상수 명명규칙 - 변수와는 다르게 모두 대문자로 작성한다. 
		
		//변수를 사용했을때
		int age = 20; // 변수 선언과 동시에 초기화
		
		System.out.println("나이는 : " + age);
		
		age = 21;
		
		System.out.println("나이는 : " + age); 
		
		//상수 이용
		final int AGE = 20; 
		
		System.out.println("상수 지정 나이 : " + AGE);
		
		//상수에 다시 대입해보기
		
		// AGE = 21; 상수를 초기화 한 뒤 덮어쓰기는 불가능하다. (고정값)
		
		//자바에서 제공하는 Math 클래스에 있는 상수 살펴보기
		System.out.println("Math.PI : " + Math.PI);
		
		
	}
	
	
}
