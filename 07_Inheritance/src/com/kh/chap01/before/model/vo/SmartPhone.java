package com.kh.chap01.before.model.vo;

public class SmartPhone {
	private String brand; // - brand : String // 브랜드명
	private String pCode;// - pCode : String // 상품코드
	private String pName;// - pName : String // 상품명
	private int price;// - price : int // 상품가격
	private String mobileAgency;// - mobileAgency : String // 통신사
//	+ SmartPhone() 

	public SmartPhone() {

	}

	public SmartPhone(String brand, String pCode, String pName, int price, String mobileAgency) {
		super();
		this.brand = brand;
		this.pCode = pCode;
		this.pName = pName;
		this.price = price;
		this.mobileAgency = mobileAgency;
	}

	// + setXXX(각 매개변수) : void
//	+ getXXX() : 각 자료형
	public String getBrand() {
		return "["+brand+"]";
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

	public String getMobileAgency() {
		return mobileAgency;
	}

	public void setMobileAgency(String mobileAgency) {
		this.mobileAgency = mobileAgency;
	}

//	+ information() : String
	public String information() {
		return "SmartPhone [brand=" + brand + ", pCode=" + pCode + ", pName=" + pName + ", price=" + price
				+ ", mobileAgency=" + mobileAgency + "]";
	}

}
