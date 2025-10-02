package com.kh.chap02_string;

import java.util.Arrays;
import java.util.StringTokenizer;

public class StringTokenizerTest {
	
	//문자열을 문자열 배열로 분리시키는방법
	//1. 구분자를 제시하여 해당 문자열을 분리시키는 바법
	//2. 구분자를 제시하여 각각 문자열을 토큰으로 저장시키는 방법
	
	public void method01() {
		String str = "Java,Oracle,Html,Css,JavaScript";
		
		//문자열 메소드 : 문자열.split(구분자) : String[]
		//문자열을 전달한 구분자로 구분하여 배열로 만들어 반환해준다.
		String[] sArr = str.split(",");
		
		for (int i = 0; i < sArr.length; i++) {
			System.out.println(sArr[i]);
		}
		
		System.out.println("=====향상된 for문=====");
		//for(요소를 담을 자료형 변수명 : 반복시킬 배열 또는 컬렉션) { }
		//반복시킬 대상에 담긴 모든 요소를 순차적으로 반복시켜주는 반복문 형태
		for(String s : sArr) {
			System.out.println(s);
		}
		
		int[] arr = {1,2,3,4,5};
		for(int i : arr) {
			System.out.println(i);
		}
		
		double[] dArr = new double[5];
		dArr[0] = 99.5;
		dArr[1] = 123.123;
		dArr[2] = 100;
		
		for(double d : dArr) {
			System.out.println(d);
			d = 5; 
		}
		
		System.out.println(Arrays.toString(dArr));
		
		for(int i = 0; i <dArr.length; i++) {
			dArr[i] = 5;
		}
		
		System.out.println(Arrays.toString(dArr));
	}
	
	public void method02() {
		String str = "아침,점심,저녁,야식,간식";
		
		//각 문자열을 , 기준으로 토큰 처리하기
		//StringTokenizer stk = new StringTokenizer(대상문자열, 구분자);
		StringTokenizer stk = new StringTokenizer(str,",");
		//분리된 토큰 확인해보기
		//System.out.println(stk);
		//.nextToken() : 담겨있는 다음 토큰을 추출하는 메소드
//		System.out.println(stk.nextToken());
//		System.out.println(stk.nextToken());
//		System.out.println(stk.nextToken());
//		System.out.println(stk.nextToken());
//		System.out.println(stk.nextToken());
		
		//더 이상 요소를 찾을 수 없을때 나는 오류
		//System.out.println(stk.nextToken()); // NoSuchElementException
		
		
		//토큰의 개수를 반환하는 메소드
		//.countTokens()
		System.out.println("현재 토큰 수 : " + stk.countTokens());
		System.out.println("토큰 추출 : " + stk.nextToken());
		System.out.println("현재 토큰 수 : " + stk.countTokens());
		//nextToken()을 이용하여 토큰을 추출하면 해당 StringTokenizer에는
		//추출된 토큰이 제외된다 (개수 감소)
		
		String str2 = "햄버거,피자,치킨,국밥,비빔밥";
		
	    //위 문자열을 구분자로 구분하여 StringTokenizer에 담고
		//반복문을 이용하여 모든 토큰을 추출(출력)해보세요
		
		StringTokenizer stk2 = new StringTokenizer(str2, ",");
		
		int k = stk2.countTokens(); 
		
		// i < stkk.countTokens()를 사용하면 nextToken()을 수행할때마다
		// 수가 감소하기 때문에 i값은 증가 countToken()값은 감소한다.
		// 모든 토큰을 추출할 수 없다. (반복횟수부족)
		for(int i = 0; i < k; i++) { // nextToken()을 쓸 때 마다 한개씩 감소 하므로 k를 따로 지정해줘야함. 
			System.out.println(stk2.nextToken());
		}
		
		//토큰이 더 있는지 확인하는 메소드
		//.hasMoreTokens() : 토큰이 있으면 true 없으면 false
		System.out.println(stk2.hasMoreTokens());
		
		String str3 = "해,달,별,구름";
		
		StringTokenizer stk3 = new StringTokenizer(str3, ",");
		
		//토큰 유무 판별 메소드를 이용하여 반복문 처리하기
		
		System.out.println("==========================");
		
		while(stk3.hasMoreTokens()) {
			System.out.println(stk3.nextToken());
		}
		
	}

}
