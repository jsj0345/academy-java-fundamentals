package com.kh.chap04_constructor.model.vo;

public class User {
	//필드부
	//회원 아이디, 비밀번호, 이름, 나이, 성별
	private String userId;
	private String userPwd;
	private String userName;
	private int age;
	private char gender;
	
	//아무런 생성자 구문이 없는 경우
	//JVM이 기본 생성자 구문을 만들어준다. (생략)
	
	/*
	 * 생성자
	 * -메소드명이 클래스명과 동일하고 반환형이 없는 메소드형태(반환형이 없고 클래스명과 동일한 메소드형태)
	 * 
	 * [표현법]
	 * public 클래스명(매개변수-생략가능) {
	 *   해당 생성자를 통해 수행할 구문
	 * }
	 *   
	 * 생성자를 작성하는 행위
	 * 
	 *   
	 * 생성자의 종류
	 * 1. 기본 생성자
	 * 2. 매개변수 생성자
	 * -필드에 기본값을 초기화 하는 기본 생성자와 별도의 전달값을 받아 초기화 하는 매개변수 생성자로 나뉜다.
	 * 
	 * 생성자 작성시 주의사항
	 * 1. 반드시 생성자명은 클래스명과 동일하게 작성할 것(대소문자 구분)
	 * 2. 반환형이 존재하지 않음.
	 * 3. 생성자는 여러개 생성 가능하지만 매개변수 형태가 중복되면 안된다.(메소드 오버로딩 기법 적용)
	 * 4. 매개변수 생성자를 명시적으로 작성하게 된다면 JVM은 기본 생성자를 만들어 주지 않는다.
	 *   (바로 작성해야함)  
	 */
	
	//각 필드값을 출력할 수 있는 메소드 정의
	public void info() {
		System.out.println(userId + " " + userPwd + " " + userName +
				" " + age + " " + gender);
	}

	//기본 생성자
	public User() {
		//기본생성자 호출 시 출력문 나오도록 처리
		System.out.println("기본 생성자 출력!");
	}
	
	//아이디, 비밀번호, 이름만 받아서 초기화하는 매개변수 3개짜리 생성자를 작성해보시오.
	//작성후 run에서 해당 매개변수 생성자로 객체를 생성한 후, info() 메서드 호출해보기
	//초기화하는 데이터는 자유롭게 작성
	public User(String userId, String userPwd, String userName) {
		this.userId = userId;
		this.userPwd = userPwd;
		this.userName = userName; 
	}
	

	//아이디,비밀번호,나이,성별을 입력받는 매개변수 생성자를 정의해보자
	//이때 아이디,비밀번호 두개만 입력받는 매개변수 생성자를 추가 정의하고
	//해당 생성자를 내부 호출하는 방식으로 매개변수 4개짜리 생성자를 만들어보세요. 
	public User(String userId, String userPwd, int age, char gender) {
		this(userId, userPwd);
		this.age = age;
		this.gender = gender; 
	}
	
	public User(String userId, String userPwd) {
		this.userId= userId;
		this.userPwd = userPwd; 
    }
	
	//전달값이 있는 매개변수 생성자 작성해보기
	public User(String userId, String userPwd, String userName, int age, char gender) {
		//매개 변수로 받아온 데이터를 각 필드에 초기화해주기 
		//User u = new User("","","");
		//내부 생성자 호출 구문은 해당 구문에서 가장 위에 있어야한다.(객체가 생성되고 다른 필드가 초기화되야 하기 때문) 
		this.userId = userId;
		this.userPwd = userPwd;
		this.userName = userName;
		this.age = age;
		this.gender = gender; 
		
	}
	
	
}
