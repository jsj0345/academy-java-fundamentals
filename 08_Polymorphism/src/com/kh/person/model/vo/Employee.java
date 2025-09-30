package com.kh.person.model.vo;

public class Employee extends Person{
	private int salary;//	- salary : int // 급여
	private String dept;//	- dept : String // 부서
//	+ Employee()
	public Employee() {
		
	}
//	+ Employee(name:String, age:int, height:double, 
//	weight:double, salary:int, dept:String)
	public Employee(String name,int age,double height
					,double weight,int salary,String dept) {
		super(age,height,weight);
		super.name = name;
		this.salary = salary;
		this.dept = dept;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
//	+ information() : String
	public String information() {
		return "Employee ["+super.information()+", salary=" + salary + ", dept=" + dept + "]";
	}
	
	

}
