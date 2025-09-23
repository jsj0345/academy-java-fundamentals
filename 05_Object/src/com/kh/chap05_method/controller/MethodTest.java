package com.kh.chap05_method.controller;

import java.util.Arrays;

import com.kh.chap04_constructor.model.vo.User;

public class MethodTest {
	/*
	 * 메소드 : 입력을 가지고 어떠한 작업을 수행한 다음 결과물을 내어놓는것
	 *         일반 메소드와 메인 메소드로 나뉜다.
	 *         하나의 기능을 정의하는 단위로 사용
	 *         
	 * [표현법]
	 * 접근제한자 예약어 반환형 메소드명(매개변수자료형 매개변수명) {
	 *    수행할 코드
	 *    return 반환값;
	 * }
	 * 
	 * -생략가능한것 : 예약어,매개변수,return문 (void일 경우)
	 * -반환형 ==반환할 값의 자료형
	 * -호출할때 메소드에 전달하는 값들 : 매개변수 자료형과 개수 일치시키기
	 * 
	 * 기능을 한번 정의해놓고 필요할때 호출해서 사용할 수 있다.
	 */
  
	 //1. 매개변수 없고 반환값도 없는 메소드
	 public void method01() {
		 System.out.println("매개변수도 없고 반환값도 없는 메소드입니다.");
		 
		 int sum = 0;
		 for(int i = 1; i < 10; i++) {
			 sum+=i;
		 }
		 
		 if(sum>0) {
			 //return을 만나면 해당 메소드를 호출한 곳으로 돌아간다.
			 //이후 코드는 실행 X. 
			 return; 
		 }
		 
		 System.out.println("결과값 : " + sum);
		 
	 }
	 
	 //매개변수는 없고 반환값은 있는 메소드
	 //getter 메소드 형태 
	 public int method02() {
		 System.out.println("매개변수는 없고 반환값은 있는 메소드입니다.");
		 //1~100사이 랜덤값을 추출하여 반환해보기 
		 //int ranNum = (int) (100 * Math.random()) + 1;
		 //return ranNum;
		 
		 //위 두줄을 한줄로 처리해보기
		 return (int) (100*Math.random()) + 1; 
	 }
	 
	 //매개변수는 있고 반환값은 없는 메소드
	 //setter 메소드 형태
	 public void method03(int num1, int num2) {
		 System.out.println("매개변수는 있고 반환값은 없는 메소드입니다.");
		 int result = num1 * num2;
		 System.out.println("num1 * num2 : " + result);
	 }
	 
	 //매개변수는 있고 반환값도 있는 메소드
	 public int method04(int num1, int num2) {
		 System.out.println("매개변수도 있고 반환값도 있는 메소드입니다.");
		 int result = num1 * num2;
		 
		 return result;
	 }
	 
	 //문자,숫자를 매개변수로 전달받는 메소드를 작성하여
	 //해당 문자를 전달받은 숫자만큼 더하여 문자열로 반환받는 메소드를 작성해보기
	 //해당 문자열을 run에서 출력까지 해보세요.
	 //ex) '밥',5 : "밥밥밥밥밥"
	 public String method05(char c, int n) {
		 String str = "";
		 
		 for(int i = 0; i < n; i++) {
			 str+=c;
		 }
		 
		 return str; 
	 }
	 
	 //클래스 자료형 반환해보기
	 public User method06() {
		 //chap04에서 만든 User 클래스 이용하기
		 User user = new User("user01","pass01");
		 
		 return user; 
	 }
	 
	 //매개변수로 클래스 자료형(참조 자료형 전달받기)
	 public void method07(User user, int[] arr) {
		 
		 //전달받은 참조자료형을 얕은 복사하여 출력해보기
		 User u = user;
		 int[] ar = arr;
		 
		 u.info(); //객체 정보 출력메소드 호출
		 
		 //정수 배열 내부값 출력
		 System.out.println(Arrays.toString(ar));
		 
	 }
	
	 
	 
}
