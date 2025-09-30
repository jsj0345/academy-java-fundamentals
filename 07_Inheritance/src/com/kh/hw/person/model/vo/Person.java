package com.kh.hw.person.model.vo;

public class Person {
	
	private String name;// - name : String
	private int age;// - age : int
	private double height;// - height : double
	private double weight;// - weight : double
//	+ Person()

	public Person() {

	}

//	+ Person(name:String, age:int, height:double, weight:double)
	public Person(String name, int age, double height, double weight) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}

//	+ getter/setter()
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

//	+ toString() : String
	@Override
	public String toString() {
		return "name=" + name + ", age=" + age + ", height=" + height + ", weight=" + weight;
	}



}
