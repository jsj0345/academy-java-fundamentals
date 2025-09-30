package com.kh.chap01.after.model.vo;

public class Tv extends Product{

	private int inch;// - inch : int // 인치
//	+ Tv() 

	public Tv() {
		
	}
	
	public Tv(String brand,String pCode,String pName,int price,int inch) {
		super.brand = brand;
		super.pCode = pCode;
		super.pName = pName;
		super.price = price;
		this.inch = inch;
	}
	public int getInch() {
		return inch;
	}
	public void setInch(int inch) {
		this.inch = inch;
	}

//	+ information() : String
	public String information() {
		return "Tv "+super.information()+", inch=" + inch + "]";
	}

}
