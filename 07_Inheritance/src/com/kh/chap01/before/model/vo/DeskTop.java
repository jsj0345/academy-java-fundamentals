package com.kh.chap01.before.model.vo;

public class DeskTop {
	private String brand;//	- brand : String // 브랜드명
	private String pCode;//	- pCode : String // 상품코드
	private String pName;//	- pName : String // 상품명
	private int price;//	- price : int // 상품가격
	private boolean allInOne;//	- allInOne : boolean // 일체여부

	//	+ Desktop() 
	public DeskTop() {
		
	}
	//	+ setXXX(각 매개변수) : void
	//	+ getXXX() : 각 자료형

	public DeskTop(String brand, String pCode, String pName, int price, boolean allInOne) {
		super();
		this.brand = brand;
		this.pCode = pCode;
		this.pName = pName;
		this.price = price;
		this.allInOne = allInOne;
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

	public boolean isAllInOne() {
		return allInOne;
	}

	public void setAllInOne(boolean allInOne) {
		this.allInOne = allInOne;
	}
	//	+ information() : String

	public String information() {
		return "DeskTop [brand=" + brand + ", pCode=" + pCode + ", pName=" + pName + ", price=" + price + ", allInOne="
				+ allInOne + "]";
	}
	

}
