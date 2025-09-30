package com.kh.hw.person.model.vo;

public class Student extends Person{
	
//	- grade : int // 학년
//	- major : String // 전공
	private int grade;
	private String major;
	
	
//	+ Student()
	public Student() {
		super();
	}
//	+ Student(name:String, age:int, height:double, 
//	weight:double, grade:int, major:String)
	public Student(String name, int age, double height,
			double weight,int grade, String major) {
		super(name,age,height,weight);//부모클래스의 매개변수 생성자 호출
		this.grade = grade;//해당 클래스 필드 초기화
		this.major = major;
	}
//	+ getter/setter()
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
	@Override
	public String toString() {
		return "Student ["+super.toString()+", grade=" + grade + ", major=" + major + "]";
	}
	

}
