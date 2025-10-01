package com.kh.practice.chap02_abstractNInterface.model.vo;

public class GalaxyNote9 extends SmartPhone implements NotePen {
	
	public GalaxyNote9() {
		super.setMaker("삼성");
		//super("삼성")
	}
	
	@Override
	public String makeCall() {
		return "번호를 누르고 통화버튼을 누름";
	}
	
	@Override
	public String takeCall() {
		return "전화받기 버튼을 누름";
	}
	
	@Override
	public String picture() {
	    return "1300만 듀얼카메라";
	}
	
	@Override
	public String charge() {
		return "고속충전, 고속 무선 충전";
	}
	
	@Override
	public String touch() {
		return "정전식, 와콤펜 지원";
	}
	
	@Override
	public boolean bluetoothPen() {
		return true; 
	}
	
	@Override
	public String printInformation() {// "갤럭시 노트9은 " + super.getMaker() +"에서 만들어졌고 제원은 다음과 같다." 
       String str = "갤럭시 노트9은 " + super.getMaker() +"에서 만들어졌고 제원은 다음과 같다.\n";
       str = str + makeCall() + "\n";
       str = str + takeCall() + "\n";
       str = str + picture() + "\n";
       str = str + charge() + "\n";
       str = str + touch() + "\n"; 
       str = str + "블루투스 펜 탑재 여부 : " + bluetoothPen() + "\n";
       
       return str; 
     	
	}
	
	

}
