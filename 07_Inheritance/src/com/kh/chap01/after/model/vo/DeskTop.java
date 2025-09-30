package com.kh.chap01.after.model.vo;


//상속
//[표현법] 접근제한자 class 클래스명 extends 부모클래스명
public class DeskTop extends Product {
	
	//부모로부터 상속받아 사용할 부분은 작성하지 않는다.
	//단 메소드를 재정의하여 사용하고 싶다면 작성가능(Override)

	private boolean allInOne;//	- allInOne : boolean // 일체여부

	//	+ Desktop() 
	public DeskTop() {
		
	}
	
	//매개변수 생성자
	public DeskTop(String brand,String pCode,String pName
				  ,int price,boolean allInOne) {
//		this.brand = brand;
//		this.pCode = pCode;
//		this.pName = pName;
//		this.price = price;
		//위 필드들은 부모클래스에 있는 필드이기때문에 해당 필드를 초기화 하려면
		//부모 클래스 객체에 초기화를 해야한다. 
		//이때 사용하는 부모클래스 생성자 호출 구문이 
		//super() 이다. 만약 매개변수가 있다면 super(매개변수,...) 와 같이 작성한다.
		//또는 부모클래스의 참조변수 super. 를 이용하여 메소드 혹은 필드에 접근하여 초기화한다.
		super(brand,pCode,pName,price);//부모클래스 매개변수 생성자 호출
		//super.brand = brand;
		this.allInOne = allInOne;
		
	}
	

	public DeskTop(boolean allInOne) {
		super();
		this.allInOne = allInOne;
	}

	public boolean isAllInOne() {
		return allInOne;
	}

	public void setAllInOne(boolean allInOne) {
		this.allInOne = allInOne;
	}
	//	+ information() : String
	public String information() {
		return "DeskTop "+super.information()+", allInOne=" + allInOne + "]";
	}
	

}
