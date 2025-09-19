package com.kh.chap02.run;

import com.kh.chap02.encapsulation.model.vo.Student;

public class Run {

	/*
	 * 캡슐화 과정을 통해서 클래스 형태를 작성해보기.
	 * 캡슐화를 하지 않으면 외부로부터 필드 직접 접근이 가능하기 때문에
	 * 값이 변질되거나 조회를 막을 수 없는 문제가 생긴다
	 * 이를 막기위해 캡슐화 원칙을 지켜야한다.(정보은닉)
	 * 데이터의 접근제한을 원칙으로 하여 접근제한자를 private으로 설정한 후
	 * 해당 필드에 접근 할 수 있는 메소드를 정의하여 간접접근하도록 한다.
	 * 
	 * 이때 간접접근하는 메소드를 setter/getter라 부른다.
	 * setter 메소드 : 필드에 값을 대입해주는 역할을 하는 메소드
	 * getter 메소드 : 필드에 담긴 값을 반환해주는 메소드
	 * -메소드부에 작성하여 기본적으로 모든 일반 필드에 대해 만들어주고
	 *  이름은 낙타봉표기법을 지켜 작성한다.
	 *  
	 *  ex) setName / getName / setAge / getAge ...
	 */
	
	public static void main(String[] args) {
		//접근제한자 private 확인해보기
		Student kim = new Student();
		
		//kim.name = "김이름";
		//System.out.println(kim.name);
		//위와 같이 필드 직접 접근은 캡슐화 원칙을 위반하기 때문에 사용하지 않는다.
		//정의한 getter/setter 메서드를 이용하여 해당 필드를 접근해보자.
		
		kim.setName("김학생");
		kim.setAge(20);
		kim.setGender('남');
		
		System.out.println(kim); // 주소값
		String name = kim.getName(); 
		int age = kim.getAge();
		char gender = kim.getGender(); 
		
		System.out.println(name+" 나이는 " + age+"살이고 " + gender +"학생입니다.");
		
		Student lee = new Student(); 
		
		lee.setName("이학생");
		lee.setAge(21);
		lee.setGender('여');
		
		String name1 = lee.getName();
		int age1 = lee.getAge();
		char gender1 = lee.getGender();
		
		System.out.println(name1+" 나이는"+ age1+"살이고 " +gender1 +"학생입니다.");
		
		Student park = new Student();
		park.setName("박학생");
		park.setAge(25);
		park.setGender('남');
		
		String name2= park.getName();
		int age2= park.getAge(); 
		char gender2= park.getGender();
		
		System.out.println(name2 +" 나이는" + age2+"살이고 " + gender2 +"학생입니다.");
		
	    System.out.println("====info 메소드 이용해보기====");
	    kim.info();
	    lee.info(); 
	    park.info();
	    
	    String str1 = kim.info2();
	    String str2 = lee.info2();
	    String str3 = park.info2();
	    
	    System.out.println(str1);
	    System.out.println(str2);
	    System.out.println(str3);
		
		
		
		
		
		

	}

}
