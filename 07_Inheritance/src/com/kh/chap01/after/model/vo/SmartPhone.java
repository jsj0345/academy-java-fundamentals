package com.kh.chap01.after.model.vo;

public class SmartPhone extends Product{
	
	private String mobileAgency;// - mobileAgency : String // 통신사
//	+ SmartPhone() 
	public SmartPhone() {

	}

	public SmartPhone(String brand, String pCode,String pName,
					  int price,String mobileAgency) {
		super.setBrand(brand);
		super.setpCode(pCode);
		super.setpName(pName);
		super.setPrice(price);
		this.mobileAgency = mobileAgency;
	}

	public String getMobileAgency() {
		return mobileAgency;
	}

	public void setMobileAgency(String mobileAgency) {
		this.mobileAgency = mobileAgency;
	}

	public String information() {
		return "SmartPhone "+super.information()+", mobileAgency=" + mobileAgency + "]";
	}
}
