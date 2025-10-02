package com.kh.chap02_string;

public class StringPoolTest {
	
	//String 클래스 : 불변 클래스(수정불가)
	//수정을 하는 순간 기존의 값이 담겨진 공간에서 수정되는거이 아니라
	//새로운 객체가 생성된 후 해당 주소값으로 참조되는 형태
	
	//1. 생성자를 통한 문자열 사용
	public void method01() {
		//매개변수 생성자에 문자열 담아서 생성
		String str = new String("안녕하세요");
		String str2 = new String("안녕하세요");
		
		//문자열.toString() : 문자열 자체를 반환해준다.
		System.out.println(str.toString()); // 문자열 클래스의 toString() 
		System.out.println(str2); // 출력문에서 toString() 메소드가 생략되어 있다. 
		
		//문자열.equals(비교문자열) : 문자열과 비교문자열이 같은지 판별한다 true/false
		System.out.println(str.equals(str2));
		
		TestClass tc1 = new TestClass();
		TestClass tc2 = new TestClass();
		TestClass tc3 = tc1;
		
		//클래스 자료형 비교 (Object의 eqauls 메소드 사용) 
		//Object의 equals 메소드는 객체주소값을 비교하여 같은 객체인지 판별 
		System.out.println(tc1.equals(tc2)); // false
		System.out.println(tc1.equals(tc3)); // true 
		
		// str과 str2를 동등비교 연산자 수행했을때 결과는 ?
		System.out.println("str == str2 :");
		System.out.println(str==str2); // false 
		
		String str3 = "안녕하세요";
		String str4 = "안녕하세요";
		
		System.out.println("str3 == str4 : ");
		System.out.println(str3==str4);
		
		//문자열.hashCode() : 문자열을 기반으로한 숫자를 반환(Override)
		//Object.hashCode() : 객체 주소를 기반으로한 숫자를 반환
		System.out.println(str.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str3.hashCode());
		System.out.println(str4.hashCode());
		
		//문자열도 주소값을 기반으로 하는 해쉬코드를 알고자 한다면?
		//System.identityHashCode(Object o): int
		
		System.out.println(System.identityHashCode(str));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str4));
		
		//문자열을 리터럴 값 대입으로 처리하면 StringPool 영역에 할당되고
		//이미 StringPool에 있는 문자열이라면 기존 문자열의 주소값을 참조하게 된다.
		//때문에 같은 문자열을 리터럴 대입 처리 한다면 같은 문자열 주소값을 갖게 되는것.
		//같은 주소값을 가진 문자열을 동등비교 연산자 수행해도 true가 나오지만
		//이는 문자열을 비교한 것이 아니라 주소값을 비교한것이기 때문에
		//문자열 비교에는 equals 메소드를 이용하여 내부 문자열 자체 비교를 수행해야한다. 
		
		//문자열에 수정작업을 수행하고 주소값이 변경되었는지 확인해보기
		String text = "문자열테스트";
		System.out.println(text);
		System.out.println(System.identityHashCode(text));
		
		text += "!!!!";
		System.out.println(text);
		System.out.println(System.identityHashCode(text));
		text="안녕못해요";
		System.out.println(text);
		System.out.println(System.identityHashCode(text));
	}
	
	public void method02() {
		//불변클래스인 String 클래스로 만든 문자열을 반복 수정작업을 통해
		//시간이 얼마나 걸리는지 확인해보기
		String str = "안녕 ";
		
		//시간 측정해보기
		//System.currentTimeMillis(); 
		//1970년 1월 1일부터 현재까지 얼마나 시간이 흘렀는지 0.001초 단위로 알려주는 메소드
		
		long start = System.currentTimeMillis();	
		
		for(int i = 0; i < 200000; i++) {
			str+="안녕";
			//System.out.println(System.identityHashCode(str));
		}
		
		long end = System.currentTimeMillis();
		
		System.out.println("총 걸린 시간 : " + (end-start) / 1000.0 + "초");
	}
	
	//위와같이 불변클래스인 String 클래스로는 문자열 수정작업이 반복적으로 일어난다면
	//효율이 낮아진다. (새 메모리영역을 할당받기 때문)
	//이때 가변클래스인 StringBuffer 또는 StringBuilder 를 사용하면
	//수정 작업처리가 원활하게 이루어진다. (해당 객체에서 수정이 일어난다)
	public void method03() {
		/*
		 * StringBuffer / StringBuilder
		 * 차이 - 멀티 쓰레드 환경에서 StringBuffer는 동기화 처리가 되어있어 안전(Thread Safe)
		 *     - StringBuilder는 동기화 처리가 되어 있지 않아 buffer에 비해 상대적으로 빠르지만
		 *       동시접근시 문제가 생길 수 있다.  
		 * */
		
		//StringBuffer sb = new StringBuffer();
		StringBuilder sb = new StringBuilder(); 
		
		//append 메소드를 이용하여 문자열을 추가
		System.out.println(sb);
		System.out.println(System.identityHashCode(sb));
		sb.append("안녕");
		
		System.out.println(sb);
		System.out.println(System.identityHashCode(sb));
		
		//시작 시간
		long start = System.currentTimeMillis();
		
		for(int i = 0; i < 10000000; i++) {
			sb.append("안녕");
			//주소값은 변하지 않음. 
			//System.out.println(System.identityHashCode(sb));
		}
		
		//종료시간
		long finish = System.currentTimeMillis();
		
		System.out.println("총 걸린 시간 : " + ((finish - start)/1000.0) + "초");
		
	}
	
	

}
