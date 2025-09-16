package com.kh.chap03.branch;

public class B_Continue {
	
	/*
	 * continue : 반복문 안에서 쓰이는 분기문으로
	 * continue를 만나면 그 뒤에 구문을 수행하지 않고
	 * 다시 반복을 수행하게 된다.
	 * 
	 * for문은 다시 반복을 수행하기 위해 증감문으로 이동하고
	 * 
	 * while문은 다시 반복을 수행하기 위해 조건식으로 이동한다. 
	 * 
	 */

	public void method01() {
		//1부터 10까지반복하는 반복문에서
		//특정 값을 건너뛰고 출력하는 방법
		
		for(int i=1; i<=10; i++) {
			//짝수만 출력하고자 할때
			//if(i%2==0) {
				//System.out.println(i);
			//}
			//홀수인 경우를 건너뛰어 짝수만 출력하기
			if(i%2!=0) {
				continue; // 이후 코드는 수행하지 않고 증감으로 이동(다음반복)
			}
			
			System.out.println(i);
		}
	}
	
	public void method02() {
		//구구단을 출력하되 4의 배수단을 빼고 출력해보기
		//2단부터 9단까지
		
		for(int i = 2; i < 10; i++) {
			for(int j=1; j < 10; j++) {
				if(i != 4) {
				   System.out.println(i + " X " + j + "=" +(i*j));
				   continue; 
				}
				
			}
		}
	}
}
