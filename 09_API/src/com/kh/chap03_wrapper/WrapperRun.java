package com.kh.chap03_wrapper;

public class WrapperRun {
	
	public static void main(String[] args) {
		/*
		 * Wrapper 클래스
		 * 기본자료형을 참조자료혀으로 포장해주는 클래스
		 * 
		 * 기본자료형     Wrapper클래스
		 * boolean     Boolean
		 * char        Character
		 * byte        Byte
		 * short       Short
		 * int         Integer
		 * long        Long
		 * float       Float
		 * double      Double
		 * 
		 * 
		 * **char, int만 제외하고 모두 첫글자만 대문자로(클래스명명규칙)
		 * */
		
		int num1 = 10;
		int num2 = 20;
		//기본자료형을 참조자료형으로 감싸는 작업을 boxing이라 한다. 
		
		Integer i1 = num1;
		Integer i2 = num2; 
		
		//참조자료형은 참조가 가능하다. (메소드가 있다면 사용 가능)
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		System.out.println("i1 : " + i1);
		System.out.println("i2 : " + i2);
		
		//a.compareTo(b) : a가 b보다 작으면 -1 크면 1 같으면 0 반환
		System.out.println(i1.compareTo(i2)); // -1
		System.out.println(i2.compareTo(i1)); // 1
		
		//클래스 자료형에서 기본자료형으로 변경하는것 - unboxing
		int num3 = i2; // 자동형변환이 되기때문에 명시적으로 선언할 필요 없음.
		
		//Integer는 참조자료형이기 때문에 int 기본자료형에선 허용되지 않던
		// null값이 대입 될 수 있다. 
//		i2 = null; 
//		String str = null; 
		
		//기본자료형 <-> String(문자열)
		String str1 = "999"; // int자료형으로 변환해보기
		String str2 = "85.85"; // double 자료형으로 변환해보기
		
		//문자열 덧셈처리가 이루어진다. 
		System.out.println("변환전 숫자 계산 : " + (str1 + str2));
		
		//문자열에 담긴 숫자를 각 자료형에 맞게 변환시켜보기
		//Wrapper클래스명.parseXXX(문자열) : Wrapper 클래스 자료형
		
		int i3 = Integer.parseInt(str1);
		double d3 = Double.parseDouble(str2);
		
		System.out.println("변환 후 숫자 계산 : " + (i3+d3));
		
		//기본자료형을 문자열로
		String str3 = String.valueOf(i3);
		String str4 = String.valueOf(d3);
		
		//숫자를 문자열로 만들었기때문에 문자열 덧셈 처리
		System.out.println(str3 + str4); //99985.85
		
		
		
	}
	
	
	

}
