package com.kh.exam.controller;

import java.util.Arrays;
import java.util.Scanner;

public class TestController {
	public void test1() {

		Scanner sc = new Scanner(System.in);

		String[] personArr = new String[5]; 

		for(int i = 0; i < personArr.length; i++) { // 먼저 배열인데 length()를 써서 오류 -> length로 표기

			System.out.print((i+1) + "번째 주민번호 입력 : "); // -> 예상결과는 1번째부터인데 0번째부터나옴

			// i -> i +1 
			
			String personId = sc.nextLine(); // 012345-1234567

			if((personId.length() == 14)) { 

				char gender = personId.charAt(7); // - 이후부터 판별 해야하므로 7번째 (8 -> 7)

				if(gender == '1' || gender == '2' || gender == '3' || gender == '4') { 
					
					// gender는 char형이다. 근데 일반 int로 작성했으니 ' '를 붙여야한다. 

					personArr[i] = personId.substring(0, 8) + "******";
					
					// 예시 결과를 보면 7번째 이후부터 **로 되어 있는데 구문에선 (0,8)로 되어있음 
					
					

				} else {

					System.out.println("잘못된 주민번호 형식입니다. 다시입력하세요.");
					
					i = i - 1; //잘못 입력했으면 다시 그 번째에 맞게끔 해줘야함. 
					
					// 만약 i를 그대로 증가시키면 배열 인덱스에 의도치 않게 초기화를 못함 

				}

			} else {

				System.out.println("잘못된 주민번호 형식입니다. 다시입력하세요.");
				
				i = i - 1; 

			}

		}

		System.out.println("--- 주민번호 정보 등록 완료 ---");

		System.out.println(Arrays.toString(personArr));

	}
}
