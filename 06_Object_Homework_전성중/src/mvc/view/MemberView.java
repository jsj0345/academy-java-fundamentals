package mvc.view;

import java.util.Scanner;

import mvc.controller.MemberController;
import mvc.model.vo.Member2;

public class MemberView {
  
	private Scanner sc = new Scanner(System.in);
	private MemberController mc = new MemberController();
	
	public MemberView() {
		
	}
	
	public void mainMenu() {
		System.out.print("아이디 입력하시오 : ");
		String id = sc.nextLine();
		System.out.print("비밀번호 입력하시오 : ");
		String pwd = sc.nextLine(); 
		
		int result = mc.login(id, pwd);
		
		while(result == 1) {
			System.out.println("=== 회원 프로그램 ===");
			System.out.println("1. 내 정보 보기");
			System.out.println("2. 내 나이 조회하기");
			System.out.println("3. 키 수정하기");
			System.out.println("9. 프로그램 종료하기");
			
			System.out.print("메뉴 번호 선택 : ");
			int menu = sc.nextInt();
			
			sc.nextLine(); // 개행 문자 있을까봐 추가 
			
			switch(menu) {
			  case 1: {
				 Member2 m = mc.readInfo();
				 System.out.println(m.information());
				 break;
			  } 
			  
			  case 2: {
				  //mc.readAge();
				  System.out.println("나이 : " + mc.readAge());
				  break;
			  }
			  
			  case 3: {
				  System.out.print("수정할 키를 입력하시오 : ");
				  double height = sc.nextDouble();
				  mc.updateHeight(height);
				  System.out.println("키가 수정 됐습니다."); 
				  break; 
			  }
			  
			  case 9: {
				  System.out.println("프로그램을 종료합니다.");
				  return; 
			  }
			}
		}
		
		System.out.println("로그인 실패.");
		System.out.println("프로그램을 종료합니다.");
		return; 
		
	}
	
	public void updateHeight() {
		System.out.print("수정할 키를 입력하시오 : ");
		double height = sc.nextDouble();
		mc.updateHeight(height);
	}
}
