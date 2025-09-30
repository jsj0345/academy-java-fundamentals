package com.kh.chap01.after.model.vo;

//DeskTop,Tv,SmartPhone 에서 중복되는 코드를 한곳에 모아 
//작성할 부모클래스 
//공통적으로 필요한 필드 또는 메소드들을 정의하고 자식클래스에서 상속받아 
//사용할 수 있도록 정의하기
public class Product {
	//공통적인 필드 
	
	//protected 접근제한자 : 다른패키지 직접접근의 경우 부모 자식관계(상속)에서 접근 가능하다.
	protected String brand;
	protected String pCode;
	protected String pName;
	protected int price;
	
	//해당 필드에 대한 생성자 및 메소드 정의하기 
	
	//기본 생성자
	public Product() {
		
	}
	//매개변수 생성자
	public Product(String brand, String pCode, String pName, int price) {
		super();
		this.brand = brand;
		this.pCode = pCode;
		this.pName = pName;
		this.price = price;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getpCode() {
		return pCode;
	}
	public void setpCode(String pCode) {
		this.pCode = pCode;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	public String information() {
		return "[brand=" + brand + ", pCode=" + pCode + ", pName=" + pName + ", price=" + price;
	}
	

}
