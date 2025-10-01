package com.kh.practice.chap02_abstractNInterface.run;

import com.kh.practice.chap02_abstractNInterface.controller.PhoneController;

public class Run {

	public static void main(String[] args) {
		
		PhoneController phoneController = new PhoneController();
		String[] information = phoneController.method(); 
		
		for(int i = 0; i < information.length; i++) {
			System.out.println(information[i]);
		}

	}

}
