package com.kh.chap02.run;

import com.kh.chap02.loop.A_While;
import com.kh.chap02.loop.B_For;

public class Run {
	
	//main 입력하고 ctrl + space 누르면 메인 메서드 만들어짐
	public static void main(String[] args) {
		
		A_While a = new A_While(); // ctrl + shift + o를 누르면 import 자동 완성 
		//a.method01(); 
		//a.method03();
		//a.method04();
		
		B_For b = new B_For();
		//b.method01(); 
		//b.method02();
		//b.method03(); 
		//b.method04();
		//b.method05();
		b.method06();
	}

}
