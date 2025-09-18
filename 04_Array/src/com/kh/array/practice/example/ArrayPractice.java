package com.kh.array.practice.example;

import java.util.Scanner;

public class ArrayPractice {

	public void practice1() {
		int[] arr = new int[10];

		String str = "";

		for (int i = 0; i < arr.length; i++) {
			// arr[i] = i + 1;
			// str = str + (i+1) + " ";
			arr[i] = i + 1;
			str = str + arr[i] + " ";
		}

		System.out.println(str);

	}

	public void practice2() {
		int[] arr = new int[10];

		String str = "";

		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
			str = arr[i] + " " + str;
		}
		System.out.println(str);
	}

	public void practice3() {
		Scanner sc = new Scanner(System.in);

		System.out.print("양의 정수 : ");
		int number = sc.nextInt();

		int[] intArr = new int[number];
		String str = "";

		for (int i = 0; i < intArr.length; i++) {
			intArr[i] = i + 1;
			str = str + intArr[i] + " ";
		}

		System.out.println(str);
	}

	public void practice4() {
		String[] fruits = { "사과", "귤", "포도", "복숭아", "참외" };

		for (int i = 0; i < fruits.length; i++) {
			if (fruits[i].equals("귤")) {
				System.out.println(fruits[i]);
				break;
			}
		}

	}

	public void practice5() {
		Scanner sc = new Scanner(System.in);

		System.out.print("문자열 : ");
		String str = sc.nextLine();

		char[] charArr = new char[str.length()];

		for (int i = 0; i < charArr.length; i++) {
			charArr[i] = str.charAt(i);
		}

		System.out.print("문자 : ");
		String message = sc.nextLine();
		char c = message.charAt(0);

		int count = 0;

		for (int i = 0; i < charArr.length; i++) {
			if (charArr[i] == c) {
				count++;
			}
		}

		System.out.println(c + " 개수 : " + count);

		System.out.println(c);
	}

	public void practice6() {
		Scanner sc = new Scanner(System.in);

		String[] days = { "월요일", "화요일", "수요일", "목요일", "금요일", "토요일", "일요일" };

		while (true) {
			System.out.print("0 ~ 6 사이 숫자 입력 : ");
			int number = sc.nextInt();

			if (number >= 0 && number <= 6) {
				System.out.println(days[number]);
			} else {
				System.out.println("잘못 입력하셨습니다.");
			}
		}
	}

	public void practice7() {
		Scanner sc = new Scanner(System.in);

		System.out.print("정수 : ");
		int number = sc.nextInt();

		int[] intArr = new int[number];
		String str = "";
		int sum = 0;

		for (int i = 0; i < intArr.length; i++) {
			System.out.print("배열 " + i + "번째 인덱스에 넣을 값 : ");
			int insert_number = sc.nextInt();
			intArr[i] = insert_number;
			str = str + intArr[i] + " ";
			sum += intArr[i];
		}

		System.out.println(str);
		System.out.println("총 합 : " + sum);

	}

	public void practice8() {
		Scanner sc = new Scanner(System.in);
		String str = "";

		while (true) {

			System.out.print("정수 : ");
			int number = sc.nextInt();

			if (number < 0) {
				continue;
			}

			int[] intArr = new int[number];

			if ((number % 2 != 0) && (number >= 3)) {

				for (int i = 0; i < intArr.length; i++) {
					if (i <= (intArr.length / 2)) {
						intArr[i] = i + 1;
						str = str + intArr[i] + ", ";
					} else {
						intArr[i] = intArr[i - 1] - 1;

						if (i == intArr.length - 1) {
							str = str + intArr[i];
							break;
						}
						str = str + intArr[i] + ", ";
					}

				}

			} else {
				System.out.println("다시 입력하세요.");
				continue;
			}

			System.out.println(str);
			break;

		}

	}

	public void practice9() {
		Scanner sc = new Scanner(System.in);

		String[] chicken_menu = { "양념", "후라이드", "간장", "마늘" };

		int k = 0;

		// ctrl + shift + f -> 선택한 영역 자동 들여쓰기

		while (k < chicken_menu.length) {
			System.out.print("치킨 이름을 입력하시오 : ");
			String chicken = sc.nextLine();

			for (int i = 0; i < chicken_menu.length; i++) {
				if (chicken_menu[i].equals(chicken)) {
					System.out.println(chicken + "치킨 배달 가능");
					break;
				} else if (i == chicken_menu.length - 1) {
					System.out.println(chicken + "치킨은 없는 메뉴입니다.");
				}

			}

			k++;
		}
	}

	public void practice10() {
		int[] intArr = new int[10];
		String str = "";

		for (int i = 0; i < intArr.length; i++) {
			int random_number = (int) (Math.random() * 10) + 1;
			intArr[i] = random_number;
			str = str + intArr[i] + " ";
		}

		System.out.println(str);
	}
	
	public void practice11() { // 주민번호 뒷자리 성별구분 숫자자리부터 *로 출력해보자
		Scanner sc = new Scanner(System.in);
		System.out.print("주민등록포함(-포함) : ");
		String number = sc.nextLine(); 
		
		int k = 0; 
		
		
		char[] char_Array = new char[number.length()];
		
		for(int i = 0; i < number.length(); i++) {
			char_Array[i] = number.charAt(i);
		}
	
		for(int i = 0; i < char_Array.length; i++) {
			if(char_Array[i] == '-') {
				k = i;
			} 
			
			if(i>=k+2 && k != 0) { // 여기서 k != 0이라는 조건을 안걸어두면 인덱스 2번부터 *로 고치기 때문에 에러 발생 위험. 
				char_Array[i] = '*';
			}
		
		}
		
		System.out.println(char_Array);
	}
	
	
	
	

}
