package com.kh.variable.run;

//불러오고자 하는 클래스의 패키지 풀 경로 + 클래스명 
import com.kh.variable.*; 

public class Run {
    // 메인 메소드 작성 
	public static void main(String[] args) {
		//calpay() 메소드 호출하여 결과 확인해보기 
		//A_Variable 클래스를 메모리 영역에 올려주기(객체 생성)
		//클래스명 별칭 = new 클래스명(); 
		//A_Variable a = new A_Variable(); // Heap영역에 객체 생성 (참조값 저장)
		//위에서 선언한 별칭으로 메소드 호출하기 
		//a.calPay();	// 참조값으로 메소드 접근 
		//a.calpay2();
		//a.declareVariable();
		//a.constant(); 
		
		//B_Scanner b = new B_Scanner(); 
		//b.inputTest();
		//b.inputTest2(); 
		//b.ex01(); 
		C_Cast c = new C_Cast();
		//c.autoCasting();
		c.forceCasting();
		
	}
}
