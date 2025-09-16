package com.kh.chap03.branch;

import java.util.Scanner;

public class A_Break {
	/*
	 * break;
	 * 
	 * - break; 를 만나게되면 가장 가까운 반복문을 벗어난다.
	 * 해당 break;를 가지고 있는 반복문 하나만 벗어나게 된다.
	 * 
	 * 주의사항
	 * switch 구문에 있는 break;는 switch 구문만 벗어난다.
	 * 
	 * 반복문 안에 switch문이 있고 그 안에 break;가 있는 경우
	 * 해당 break;는 switch문을 벗어나는 용도이기 때문에 반복문을 벗어나지 않는다.
	 * 
	 * 
	 */
	
	public void method01() {
		//매번 랜덤값을 추출하여 해당 값이 홀수일 경우 반복문을 벗어나도록 처리해보기
		
		//무한반복 방법 1) while(true)
		//무한반복 방법 2) for( ; ; )
		//보편적으론 while(true)를 이용한다.
		
		//랜덤값 추출 메서드 : Math.random() : 0.0 ~ 1.0 사이값을 랜덤으로 추출
		// 0.0 이상 1미만 소수점이 추출됨 * 100으로
		//소수점을 뒤로 옮겨서 범위를 0.0이상 100미만으로 변경. 
		//1~100까지로 하기 위해 +1을 처리하여 1부터 100까지 표현가능하도록 설정. 
		//해당 메소드로 1~100까지 얻어내기 : * 100 + 1 처리 후 int 자료형으로 변경하기 
		//System.out.println(Math.random());
		
		//System.out.println((int)(Math.random() * 100) + 1);
		
		while(true) {
			// 1 ~ 100 랜덤값 추출
			int ranNum = (int) (Math.random() * 100) + 1;
			
			System.out.println("랜덤값 : " + ranNum);
		
			//해당 값이 홀수인지 판별하여 반복문 벗어나도록 처리 
			if(ranNum % 2 != 0) {
				break; //반복문 벗어나기 
			}
		}
		
	}
	
	public void method02() {
		//사용자에게 숫자를 입력받아
		//해당 숫자가 음수라면 프로그램을 종료해보기
		//ex) 숫자 : 5 / 숫자 : -5 -> 음수가 입력되어 프로그램을 종료합니다.
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("숫자를 입력하세요 : ");
			int number = sc.nextInt();
			
			if(number < 0) {
				System.out.println("음수가 입력되어 프로그램을 종료합니다.");
				break; 
			}
		}
		
	}
	
	public void method03() {
		//사용자에게 몇번 반복을 수행할것인지와 벗어나고자 하는 수를 입력받고
		//해당 수만큼 반복문을 작성하여 각 i 값을 출력한다.
		//i값이 해당 숫자에 도달했을때 벗어나도록 처리하기
	
		Scanner sc = new Scanner(System.in); 
		
		System.out.print("몇번 반복 수행하고 싶으세요? : ");
	
		int number = sc.nextInt();
		
		for(int i = 1; i < number + 1; i++) {
			System.out.println(i);
			
			if(i == number) {
				break; 
			}
		}
		
	}
	
	public void method04() {
		//무한반복문으로
		//1. 조회 2. 수정 3. 삭제 0.종료
		//메뉴입력:
		//사용자에게 메뉴를 입력받아 해당 메뉴를 출력하시오.
		//이때 사용자가 0번을 입력하면 종료되도록 처리해보기
		//메뉴 조건처리는 switch문을 이용하기
		
		Scanner sc = new Scanner(System.in); 
		
		while(true) {
			//switch문 안에 작성한 break는 해당 switch문을 벗어남.
			//switch문을 감싸는 반복문을 벗어나진 않는다. 
			System.out.println("1.조회 2.수정 3.삭제 0.종료");
			System.out.println("메뉴 입력 : ");
			int number = sc.nextInt();  
			
			switch(number) {
			  case 1:
				System.out.println("1. 조회"); 
				break;
			  case 2:
				System.out.println("2. 수정");
				break;
			  case 3:
				System.out.println("3. 삭제");
				break;
			  case 0:
				  System.out.println("0. 종료");
				  break; 
			}
			
			if(number == 0) {
				System.out.println("프로그램을 종료합니다.");
				break; 
			}
			
		}
		
		sc.close(); 
	}

}
