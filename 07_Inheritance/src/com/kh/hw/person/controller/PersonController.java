package com.kh.hw.person.controller;

import com.kh.hw.person.model.vo.Employee;
import com.kh.hw.person.model.vo.Student;

public class PersonController {
	//	- s:Student[] = new Student[3]
	private Student[] s = new Student[3];
	//	- e:Employee[] = new Employee[10]
	private Employee[] e = new Employee[10];
	
	//	+ personCount() : int[]
	public int[] personCount() {
		//각 객체배열에 저장된 객체의 수를 정수배열에 담아 반환하는 메소드
		int[] count = new int[2];
		
		int sCount = 0;
		int eCount = 0;
		
		//반복문을 이용하여 각 객체배열에 객체가 담겨있는 개수를 세어보기 
		for(int i=0; i<s.length; i++) {//학생객체배열 반복문 
			//해당 인덱스위치에 null 인지 아닌지 판별작업 
			if(s[i]!=null) {
				//sCount++;
				sCount = sCount+1;
			}
		}
		//반복문을 이용하여 사원객체배열에 담긴 사원 수 알아오기
		for(int i=0; i<e.length; i++) {//사원객체배열 반복문
			if(e[i]!=null) {//null이 아니면 
				eCount++;//숫자 1증가
			}
		}
		
		//각각 숫자가 객체수만큼 증가된 상태 
		count[0] = sCount;//학생수
		count[1] = eCount;//사원수
		
		return count;//정수배열 반환
	}
	//	+ insertStudent(name:String, age:int, height:double, 
	//	weight:double, grade:int, major:String) : void
	public void insertStudent(String name,int age,double height,double weight,
								int grade,String major) {
		
		//매개변수 생성자를 이용하여 전달받은 데이터로 객체생성 후 객체 배열에 대입하기 
		for(int i=0; i<s.length; i++) {//반복문 이용하여 빈자리 찾기
			if(s[i]==null) { //null이면 (빈자리)
				s[i] = new Student(name,age,height,weight,grade,major);
				break;//넣었으니 반복문 벗어나기
			}
		}
	}
	//	+ printStudent() : Student[]
	public Student[] printStudent() {
		//학생객체배열의 주소값 
		return s;
	}
	//	+ insertEmployee(name:String, age:int, 
	//	height:double, weight:double, salary:int, 
	//	dept:String) : void
	public void insertEmployee(String name,int age,double height,double weight,
								int salary,String dept) {
		
		//매개변수 생성자를 이용하여 전달받은 데이터로 객체생성 후 객체 배열에 대입하기 
		for(int i=0; i<e.length; i++) {//반복문 이용하여 빈자리 찾기
			if(e[i]==null) { //null이면 (빈자리)
				e[i] = new Employee(name,age,height,weight,salary,dept);
				break;//넣었으니 반복문 벗어나기
			}
		}
	}
	
	//	+ printEmployee() : Employee[]
	public Employee[] printEmployee() {
		return e;
	}
	
	

}
