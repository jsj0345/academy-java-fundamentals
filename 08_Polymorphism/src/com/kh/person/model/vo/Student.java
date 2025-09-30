package com.kh.person.model.vo;


//자식클래스 (부모클래스인 Person을 상속받고자 한다)
public class Student extends Person{//extends 부모클래스명
	private int grade;//	- grade : int // 학년
	private String major;//	- major : String // 전공
//	+ Student()
	public Student() {
		
	}
//	+ Student(name:String, age:int, height:double, 
//	weight:double, grade:int, major:String)
	public Student(String name,int age,double height,double weight
				  ,int grade,String major) {
//		name 값은 부모 필드 값에 직접 접근해서 초기화
//		age, height, weight는 부모 생성자를 통해 초기화
		super(age,height,weight); //내부 생성자 호출구문은 가장 먼저 작성되어야한다.
		super.name = name;
		//자식 클래스에 있는 필드 따로 초기화 
		this.grade = grade;
		this.major = major;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
//	+ information() : String
	public String information() {
		return "Student ["+super.information()+", grade=" + grade + ", major=" + major + "]";
	}
	
	
}
