package com.kh.practice.chap02_abstractNInterface.controller;

import com.kh.practice.chap02_abstractNInterface.model.vo.GalaxyNote9;
import com.kh.practice.chap02_abstractNInterface.model.vo.Phone;
import com.kh.practice.chap02_abstractNInterface.model.vo.SmartPhone;
import com.kh.practice.chap02_abstractNInterface.model.vo.V40;

public class PhoneController {
	
	private String[] result = new String[2]; 
	
	public String[] method() {
		Phone[] phone = new Phone[2];
		
		phone[0] = new GalaxyNote9();
		phone[1] = new V40();
		
		// 각 객체의 정보를 문자열 배열에 저장하여 문자열 배열 주소를 반환하는 메소드
		/*
		for(int i = 0; i < result.length; i++) {
			if(phone[i] instanceof GalaxyNote9) {
			   result[i] =((GalaxyNote9)phone[i]).printInformation();
			} else {
			   result[i]=((V40)phone[i]).printInformation();
			}
	      	//result[i] = phone[i].printinformation(); 
		}
		*/
		

		/*
		 * 출력 문자열인 printInformation() 메소드는
		 * GalaxyNote9과 V40의 공통 부모 클래스에서 제공하는 메소드
		 * 때문에 Phone 타입을 SmartPhone으로 다운캐스팅 한다면
		 * 각 클래스에서 재정의 된 printInformation 메소드가 호출한다. 
		 */
		
		for(int i = 0; i<phone.length; i++) {
			result[i] = ((SmartPhone)phone[i]).printInformation(); 
		}
		
		return result; 
	}

}
