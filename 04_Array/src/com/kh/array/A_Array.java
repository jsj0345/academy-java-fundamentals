package com.kh.array;

import java.util.Scanner;

public class A_Array {
	/*
	 * 변수 : 하나의 공간에 하나의 값만 담을 수 있다.
	 * 배열 : 하나의 공간에 여러개의 값을 담을 수 있다. (객체)
	 *       단, 같은 자료형일때
	 *       
	 * 배열은 각 인덱스 자리에 실제 값이 담기는 형태이다.
	 * 참조자료형이기 때문에 heap 영역에 실제 값이 담기는 배열 객체가 생성된다.
	 * 때문에 참조변수를 이용하여 해당 배열의 주소값을 담고 주소값으로 배열에 접근하게 된다.      
	 */
	
	public void method01() {
		//배열만 사용하는 이유
		//변수만 이용한다면 값이 많아지는만큼 많은 변수를 선언해야한다.
		int num1 = 10; // ctrl + alt + 아래방향키 -> 아래로 복사된다.
		int num2 = 20;
		int num3 = 30;
		int num4 = 40;
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		
		//위에있는 변수명이 순차적으로 증가하는 숫자가 있기때문에
		//반복문으로 표현하기
		//변수명은 반복문을 이용하여 숫자처리할 수 없음.
		for(int i = 1; i <=4; i++) {
			System.out.println("num" + i);
		}
	}
	
	//위 상황을 배열을 이용하여 처리해보자.
	public void method02() {
		/*
		 * 배열 선언 및 할당
		 * 선언 방법 두가지
		 * 1) 자료형[] 배열명;
		 * 2) 자료형 배열명[];
		 * 
		 * 보편적으로 1번 형태를 사용한다.
		 */
		
		int[] arr; // 1번 방법
		int arr2[]; // 2번 방법
		
		//배열의 할당 - 크기지정
		//[표현법] new 자료형[크기];
		arr = new int[5]; //5칸짜리 정수(int)형 배열 생성 
		//생성된 배열 arr에 값을 담아보기
		//arr = 10; // 불가. 왜냐하면 참조형에다가 기본형을 넣을라니까. 래퍼 클래스면 가능.. 
		//실제 값을 담으려면 heap 영역에 생성된 배열객체 각 인덱스에 접근해야한다. 
		
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		
		System.out.println(arr); // 여기서는 각 인덱스의 값이 나오는게 아니라 배열도 참조형이므로 "주소값" 이 나옴.
		// 어찌됐든 arr도 객체 이므로 arr.toString() 호출 
		// 그래서 참조값(주소값)이 나옴. 
		// 그리고 arr[0], arr[1] 이런건 참조값을 기반으로 인덱스에 접근을 하는것.
		// 마치 참조값[0] 이런느낌임. 

		System.out.println("arr[0] : " + arr[0]); // 0번 인덱스 데이터
		System.out.println("arr[1] : " + arr[1]); // 1번 인덱스 데이터
		System.out.println("arr[2] : " + arr[2]); // 2번 인덱스 데이터
		System.out.println("arr[3] : " + arr[3]); // 3번 인덱스 데이터
		System.out.println("arr[4] : " + arr[4]); // 4번 인덱스 데이터 
		
		System.out.println("각 인덱스는 숫자로 표현 가능하기 때문에 반복문 사용가능");
		for(int i = 0; i < arr.length; i++) { // 0부터 4까지 증가하는 반복문
			System.out.println(arr[i]); // arr 배열의 i 번째 인덱스 접근시키기
		}
		
		//생성한 배열의 크기를 벗어나는 접근은 오류 발생
		//System.out.println("arr의 5번 인덱스 접근해보기 : " + arr[5]); // 예외 발생. 
	}
	
	public void method03() {
		//반복문을 이용하여 배열 접근해보기
		int[] arr = new int[3]; // 3칸짜리 정수형배열 생성
		//생성한 arr 배열에 각 인덱스에 10이라는 값을 담으려고 한다.
		//반복문을 이용하여 담아보기
		
		System.out.println(arr);
		arr = new int[5]; // 5칸 짜리로 바꿔보기(재할당)  
	    System.out.println(arr);
		
		for(int i = 0; i < arr.length; i++) { //0부터 2까지 증가하는 반복문. 0 1 2
			arr[i] = 10; // arr배열 i번째 인덱스에 10 담아주기 
		}
		
		//잘 담겼는지 출력해보기
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		//배열의 크기를 알아낼 수 있는 방법
		//배열명.length
		System.out.println("배열 arr의 크기 : " + arr.length);
		
	}
	
	public void method04() {
		//6칸짜리 정수(int)배열을 만들고 (선언 및 할당)
		//각 인덱스에는 10부터 10씩 증가하는 값을 담고
		//각 인덱스에 담긴 값을 모두 출력해보기
		//반복문 사용.
		
		int[] arr = new int[6];
		
		
		
		for(int i = 0; i < arr.length; i++) {
			
			if(i==0) {
				arr[i] = 10;
			} else {
				arr[i] = arr[i-1] + 10;
			}
			
			System.out.println(arr[i]);
		}
		
		//배열의 크기가 변경되면 그에 따라 반복횟수도 변경되야하는 상황에서는
		//배열의 크기를 알아오는 배열.length 속성을 이용하여
		//범위를 지정하면 확장성 있는 코드 작성 가능 	
	}
	
	public void method05() {
		//문자 자료형 배열을 3칸까지로 생성하여 각 인덱스에 원하는 값을 넣고
		//반복문을 이용하여 출력해보기
		char[] char_array = new char[3];
		char_array[0] = 'a';
		char_array[1] = 'b';
		char_array[2] = 'c';
		
		for(int i = 0; i < char_array.length; i++) {
			System.out.println(char_array[i]);
		}
		
		//실수형 배열 3칸짜리 생성 후 각 인덱스에 원하는 값을 넣고 반복문 이용하여 출력
		Double[] double_array = new Double[3];
		double_array[0] = 0.5;
		double_array[1] = 1.0;
		double_array[2] = 1.5;
		
		for(int i = 0; i < double_array.length; i++) {
			System.out.println(double_array[i]);
		}
		
		//문자열 자료형 배열 3칸짜리 생성 후 각 인덱스에 원하는 값을 넣고 출력
		String[] string_array = new String[3];
		string_array[0] = "A";
		string_array[1] = "B";
		string_array[2] = "C";
		
		for(int i = 0; i < string_array.length; i++) {
			System.out.println(string_array[i]);
		}
	}
	
	public void method06() {
		//문자열 배열 5칸짜리를 만들고
		//사용자에게 좋아하는 음식 이름을 입력받아
		//각 인덱스에 담아주고 모두 출력해보세요
		//ex) 1번째 좋아하는 음식 이름 : .... n번째 좋아하는 음식이름 :
		//1번째 좋아하는 음식 이름은 OOO입니다...
		//입력과 출력 모두 반복문을 이용하여 처리해보자.
		
		String[] FoodArray = new String[5];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < FoodArray.length; i++) {
			System.out.print((i+1)+"번째 좋아하는 음식 이름 : ");
			String name = sc.next();
			FoodArray[i] = name ; 
			System.out.println((i+1)+"번째 좋아하는 음식 이름은 " + name + "입니다.");
		}
		
	}
	
	public void method07() {
		//사용자에게 배열 크기를 입력받고
		//입력받은 크기만큼의 문자열 배열을 생성하여
		//입력도 반복문 이용하기
		//각 인덱스에 좋아하는 영화제목을 입력받아 대입하기
		//반복문을 이용하여 출력까지 해보자.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("배열 크기를 몇으로 지정하고 싶으세요? : ");
		int size = sc.nextInt();
		String[] movie = new String[size]; 
		sc.nextLine(); // 개행 문자 미리 제거. 
		
		for(int i = 0; i < movie.length; i++) {
			System.out.print("좋아하는 영화 제목 입력 : ");
			String title = sc.nextLine();
			movie[i] = title; 
		}
		
		for(int i = 0; i < movie.length; i++) {
			System.out.println(movie[i]);
		}
		
	}
	
	public void method08() {
		//배열을 생성하여 기본값을 확인해보자.
		int[] arr; // 선언
		
		arr = new int[3]; // 할당
		
		// 각 인덱스에 값을 대입하지 않은 상태로 확인해보기
		System.out.println(arr); // 주소값
		System.out.println(arr[0]); // int 자료형의 기본값. 
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		
		double[] dArr = new double[5];
		//실수 배열 선언 및 할당
		for(int i = 0; i<dArr.length; i++) {
			System.out.println(dArr[i]);
		}
		
		/*
		 * 메모리여역에는 빈 공간이 있을 수 없기 때문에
		 * 생성된 객체에는 각 자료형에 맞는 기본값이 들어가게 된다.
		 * JVM이 기본값으로 해당 영역을 초기화해주기 때문. 
		 */
		
		
	}
	
	

}
