package com.hw1.model.vo;

//부모클래스 
public class Person {
	protected String name;//	# name : String
	private int age;//	- age : int 
	private double height;//	- height : double
	private double weight;//	- weight : double
//	+ Person()
	public Person() {
		
	}
//	+ Person(age:int, height:double, weight:double)
	public Person(int age,double height,double weight) {
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}

	//	+ information() : String
	public String information() {
		return "name=" + name + ", age=" + age + ", height=" + height + ", weight=" + weight;
	}
	
}
