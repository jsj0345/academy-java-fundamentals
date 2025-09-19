package com.kh.chap01.run;

import com.kh.chap01.abstraction.model.vo.Student;

public class Run {
	
	public static void main(String[] args) {
		/*
		 * 1. 객체 지향 언어 : "객체"를 지향하는 언어로 객체 중심으로 돌아간다. 
		 * 
		 * 2. 객체 : 사전적 의미로는 현실세계에 독립적으로 존재하는(목적이 있고 의미가 있는) 모든 것들 
		 * 
		 * 3. 객체지향 프로그래밍 : 현실세게에서 독립적인 존재들(객체)간의 상호작용을 프로그래밍
		 * 코드로 구현하는 과정
		 * 
		 * 4. 구현하고자 하는 프로그램 상의 객체를 만들기 위해 - 클래스라는 틀을 정의해야한다.
		 * - 클래스란? 각 객체들의 속성(정보,행위)들을 정의한 자료형
		 * - 클래스는 추상화 + 캡슐화를 통해 만들게 된다.
		 * 
		 *  5. 추상화 과정
		 *  1) 구현하고자 하는 프로그램에서 필요한 객체들을 생각
		 *  2) 해당 객체들이 가지고 있는 공통적인 속성, 기능들을 추출
		 *  3) 추출한 속성들 중 구현할 프로그램에서 필요한 속성들만 남기고 나머지는 제거
		 *  4) 최종적으로 남은 속성들을 어떠한 자료형으로 사용할 것인지 지정하기.
		 * */
		
		//이름, 나이, 성별
		//변수로 작성해보기
		String name = "김학생";
		int age = 20;
		char gender = '남'; 
		
		//학생 추가
		String name2 = "이학생";
		int age2 = 21;
		char gender2 = '여';
		
		// 학생 추가
		String name3 = "박학생";
		int age3 = 25;
		char gender3 = '남';
		
		//위 작업을 배열로 만들어서 처리한다면 
		String[] allName = new String[3];
		allName[0] = name;
		allName[1] = name2;
		allName[2] = name3;
		
		int[] allAge = new int[3];
		allAge[0] = age;
		allAge[1] = age2;
		allAge[2] = age3;
		
		char[] allGender = new char[3];
		allGender[0] = gender;
		allGender[1] = gender2;
		allGender[2] = gender3;
		
		//출력 반복문
		for(int i = 0; i < 3; i++) {
			System.out.println(allName[i]);
			System.out.println(allAge[i]);
			System.out.println(allGender[i]);
		}
		
		//정의한 Student 객체를 이용하여
		//객체를 생성하고 각 학생 정보를 하나의 객체에 한명씩 넣어보기
		Student kim = new Student(); // student 객체 생성 및 Student 객체에 접근하기 위한 참조값을 변수에 담음.
		kim.name = "김학생"; // Student kim = x001; 이라 하면 x001.name 참조값으로 이름 멤버 변수에 접근
		kim.age = 20; // 참조값으로 나이 멤버 변수에 접근
		kim.gender = '남'; // 참조값으로 성별 멤버 변수에 접근 
		
		System.out.println("kim 객체에 담긴 값 : ");
		System.out.println(kim.name);
		System.out.println(kim.age);
		System.out.println(kim.gender);
		
		Student lee = new Student(); 
		lee.name = "이학생";
		lee.age = 21;
		lee.gender = '여';
		
		System.out.println("lee 객체에 담긴 값 : ");
		System.out.println(lee.name);
		System.out.println(lee.age);
		System.out.println(lee.gender);
		
		Student park = new Student();
		park.name = "박학생";
		park.age = 25; 
		park.gender = '남';
		
		System.out.println("park 객체에 담긴 값 : ");
		System.out.println(park.name);
		System.out.println(park.age);
		System.out.println(park.gender);
		
		//위와 같이 해당 필드(변수)에 직접 접근하는 방식은
		//보안상 문제가 있을 수 있기 때문에
		//캡슐화 원칙(정보은닉)을 지켜 접근제한을 사용하게 된다. 
	}

}
