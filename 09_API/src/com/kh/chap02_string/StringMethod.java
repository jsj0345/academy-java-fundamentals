package com.kh.chap02_string;

public class StringMethod {
	
	//String 클래스에서 제공하는 메소드 알아보기
	
	public void method01() {
		String str = "hello world";
		
		//1.문자열.charAt(int index) : char
		//문자열의 index번째 위치한 문자 를 추출해주는 메소드
		char ch = str.charAt(0);
		System.out.println("0번 인덱스 문자 : " + ch);
		
		//2. 문자열.concat(String str) : String
		//문자열 대상에 매개변수 str을 더해서 반환해준다.
		String str2 = "반가워";
		String str3 = "요";
		
		String result = str2.concat(str3);
		System.out.println(result);
		
		//3. 문자열.length() : int
		//문자열의 길이를 반환해주는 메소드
		System.out.println(result.length());
		
		//4-1. 문자열.subString(int beginIndex) : String
		//문자열에서 beginIndex부터 끝까지 잘라내어 반환하는 메소드
		System.out.println(str);
		System.out.println(str.substring(5));
		
		//4-2. 문자열.substring(int beginIndex, int endIndex) : String
		//문자열에서 beginIndex부터 endIndex-1까지 잘라내어 반환해주는 메소드
		System.out.println(str);
		System.out.println(str.substring(6,8));
		
		//5-1. 문자열.replace(char oldChar, char newChar) : String
		//변경하고자 하는 문자를 새로운 문자로 치환하여 문자열을 반환하는 메소드
		String str5 = "안녕하십니다";
		String result2 = str5.replace('다', '까'); 
		System.out.println(result2);
		
		//5-2. 문자열.replace()
		result2 = str5.replace("하십니다", "못하시겠는데요");
		System.out.println(result2);

		//문자열에 공백 제거용도로 사용
		String spaceStr = "오늘은 수요일 내일은 목요일 그다음 연휴 야호";
		
		String result3 = spaceStr.replace(" ",""); 
		System.out.println(result3);
		
		//6.문자열.trim() : string
		//문자열 앞뒤 공백을 제거해주는 메소드
		String spaceStr2 = "                         문자열                      입  니  다";
		spaceStr2 = spaceStr2.trim();
		System.out.println(spaceStr2);
		System.out.println(spaceStr2.replace(" ",""));
		
		//7.문자열.toUpperCase() : String
		//문자열을 모두 대문자로 변환하여 반환하는 메소드
		String str7 = "hello WORLD";
		System.out.println(str);
		System.out.println(str7.toUpperCase());
		
		//8.문자열.toLowerCase() : String
		//문자열을 모두 소문자로 변환하여 반환하는 메소드
		String str8 = "Hello WORLD";
		System.out.println(str8);
		System.out.println(str8.toLowerCase());
		
		//9.String.valueOf(char[] cArr) : String (매개변수 다른 자료형도 가능) 
		//문자 배열을 문자열로 만들어주는 메소드(또는 매개변수 자료형 데이터를 문자열로)
		char[] cArr = {'h','e','l','l','o'};
		String str9 = String.valueOf(cArr);
		System.out.println(str9);
		
		//10. 문자열.toCharArray() : char[]
		//문자열을 char[] 형태로 만들어주는 메소드
		char[] cArr2 = {'w','o','r','l','d'};
		String str10 = String.valueOf(cArr2);
		char[] cArr3 = str10.toCharArray();
		
		for(int i = 0; i < cArr3.length; i++) {
			System.out.print(cArr3[i] + " ");
		}
		
		System.out.println();
		
		//11. 문자열.indexOf(int ch) : int
		//문자열에서 해당 문자의 위치 인덱스를 반환하는 메소드
		String str11 = "Hello World";
		System.out.println("W의 위치는 : " + str11.indexOf('W'));
		System.out.println("H의 위치는 : " + str11.indexOf('H'));
		
		//12. 문자열.lastIndexOf(int ch) : int
		//문자열에서 해당 문자의 위치를 뒤에서부터 찾아내어 인덱스 위치를 반환하는 메소드
		System.out.println("앞에서부터 찾은 o의 위치 : " + str11.indexOf('o'));
		System.out.println("뒤에서부터 찾은 o의 위치 : " + str11.lastIndexOf('o'));
		
		//subString과 indexof 또는 lastIndexof를 이용하여
		//파일명에서 확장자만 추출해보기
		String fileName = "Hello...World.java";
		String fileName2 = "안녕..하..십..니까?.txt";
		
		System.out.println(".의 위치 : " + fileName.lastIndexOf('.'));
		System.out.println(".의 위치 : " + fileName2.lastIndexOf('.'));

		System.out.println("확장자만 추출해보기1 : " + fileName.substring(13));
		System.out.println("확장자만 추출해보기2 : " + fileName2.substring(13));
		
	}

}
