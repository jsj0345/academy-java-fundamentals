package com.kh.variable;

import java.util.Scanner;

public class B_Scanner {
	// 사용자에게 키보드로 입력 받을 수 있는 도구인 Scanner를 사용해보자.
	
	// 입력 테스트
	public void inputTest() {
		/*
		 * Scanner를 사용하기 위해 import 후
		 * 객체를 만들어 사용한다.
		 * [표현법]
		 * Scanner sc = new Scanner(System.in);
		 * 클래스명 별칭 = new 클래스명(연결통로 - 스트림);
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		
		//사용자에게 이름,나이,키,주소를 입력 받아서 변수에 담아보기
		//사용자에게 문자열을 입력 받을 수 있는 메소드 2개
		//1-1) sc.next(); - 띄어쓰기 불가능(띄어쓰기 전까지 입력받아짐)
		//1-2) sc.nextLine(); - 띄어쓰기 가능(한줄 입력받기)
		//2. 사용자에게 정수를 입력 받을 수 있는 메소드(숫자)
		//sc.nextInt();
		//3. 사용자에게 실수를 입력 받을 수 있는 메소드 (소수점)
		//sc.nextDouble();
		
		
		 
		
		// 사용자에게 이름 입력받기
		System.out.print("이름을 입력하시오: ");
		String name = sc.next();
		System.out.println("이름은 " + name);
		
		//나이 - 정수
		// 키 - 실수
		//주소 - 공백포함
		//나이는 OO 살 입니다.
		//키는 OO.Ocm 입니다.
		//사는 곳은 OOOOO OOOO OO 입니다.
		//를 출력해보세요. (변수명 자유)
		
		System.out.print("나이를 입력하시오: " ); 
		int age = sc.nextInt();
		System.out.println("나이는 " + age + " 살 입니다.");
		
		System.out.print("키를 입력하시오: ");
		double height = sc.nextDouble();
		System.out.println("키는 " + height + "cm 입니다.");
		
		System.out.print("주소를 입력하시오: ");
		//nextLine()은 개행문자를 입력받기 때문에 만약 위에서
		//nextLine()이 아닌 다른 입력 메소드를 사용한 경우
	    //개행문자가 입력버퍼(임시저장공간)에 남아있어 해당 개행문자를 입력받고 끝나버림.
		//해결방법 - 입력받기 전에 nextLine()을 한번 더 써서 개행문자 제거하기 (입력 받고나서 개행 문자를 없앰) 
		// 근데 입력을 개행문자로 받아버리니까 nextLine()을 한번 더 호출해서 개행 문자를 미리 없애줌.(읽고 없애니까) 
		sc.nextLine(); // nextLine()은 개행(enter)를 입력으로 받음. 
		// 위에서 enter를 눌러서 오 이미 입력했네 하고 넘김. 그리고나서 enter없앰.  
		String address = sc.nextLine(); // nextLine()은 한줄 표현 가능. 
		System.out.print("사는 곳은 " + address + " 입니다."); 
		
		//스캐너를 다 사용했다면 연결통로 닫아주기(자원 낭비 방지)
		sc.close(); // 자원 반납. 
	
	}
	
	//스캐너 연습
	public void inputTest2() {
		
		//위에서 작업했던 스캐너는 다른 메소드에 존재하기 때문에
		//메소드가 달라졌다면 새롭게 생성하여 사용해야한다.(지역변수)
		Scanner sc = new Scanner(System.in);
		
	    //sc.next(); // 이거는 개행 문자를 냅둠. 
		//sc.nextLine(); // 얘는 개행 문자를 읽고 없앰. (위에서 enter를 쳤으니 개행 문자를 입력으로 받으니 읽고 바로 없앰.)
		// 즉, 사용자가 입력도 하기 전에 읽었으니 없애는거임 	
		//sc.nextLine(); 
		
		// ctrl + /를 쓰면 원하는 범위 만큼 주석 처리 가능함. 
		//nextLine() 이 아닌 다른 입력 메소드아래에 nextLine()이 오는 경우에
		//개행문자가 남아있으니 해당 개행문자를 제거하는 용도의 nextLine()을 한번 작성해주면 된다. 
		
		System.out.print("숫자 입력 : ");
		int num = sc.nextInt();
		
		//여기 sc.nextLine(); 추가 
		sc.nextLine(); 
		System.out.print("문자열 입력 : ");
		String str = sc.nextLine();
		
		System.out.print("실수 입력 : ");
		double dNum = sc.nextDouble();
		
		System.out.print("정수 입력 : ");
		int num2 = sc.nextInt();
		
		System.out.print("next로 문자열 입력 : ");
		String str2 = sc.next();
		
		// 여기 sc.nextLine(); 추가
		sc.nextLine(); 
		System.out.print("문자열 또 입력 : ");
		String str3 = sc.nextLine(); 
	
		sc.close(); 
	}
	
	/*
	 * ex01 이름을 가진 메소드를 작성하여
	 * 해당 메소드에서 오늘 먹은 점심 메뉴의 가격을 먼저 입력받고
	 * 다음 메뉴의 이름을 입력받아 변수에 담아준 뒤
	 * 오늘 먹은 점심 메뉴는 OOO이고 가격은 OOO원 입니다. 라는 출력문을 작성해보자.
	 * 원래 가지고 있던 돈이 2만원 이였을 경우 남은 돈은 얼마인지
	 * 남은돈은 OOO원 입니다. 라는 출력문도 작성해보자. 
	 */
	
	public void ex01() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("오늘 먹은 점심 메뉴의 가격: ");
		int price = sc.nextInt();
		
		System.out.print("점심 메뉴의 이름은: ");
		String menu = sc.next();
		
		System.out.println("오늘 먹은 점심 메뉴는 " + menu + "이고 가격은 " + price + "원 입니다.");
		
		int restMoney = 20000 - price;
		
		System.out.println("남은돈은 " + restMoney + "원 입니다."); 
		
		sc.close(); 
	}

}
