package com.kh.practice.token.controller;

import java.util.StringTokenizer;

public class TokenController {
	
	public TokenController() {
		
	}
	
	//공백을 토큰으로 처리한 문자열 반환 
	public String afterToken(String str) {
		StringTokenizer st = new StringTokenizer(str, " ");
		String str2 = "";
		
		int count = st.countTokens();
		
		for(int i = 0; i < count; i++) {
			str2 = str2 + st.nextToken(); 
		}
		
		
		return str2; 
	
	}
	
	//첫 글자만 대문자로 바꾼 문자열 반환
	public String firstCap(String input) {
		return input.substring(0,1).toUpperCase() + input.substring(1);
	}
	
	//문자열 안에 찾을 문자 개수가 몇 개 들어가있는지 반환 
	public int findChar(String input, char one) {
		
		int count = 0;
		
		char[] cArr = input.toCharArray();
		
		for(char c : cArr) {
			if(one == c) {
				count++; 
			}
		}
		
		
		return count; 
	}

}
