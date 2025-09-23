package mvc2.view;

import java.util.Scanner;

import mvc.model.vo.Bread;
import mvc2.controller.BakeryController;

public class BakeryMenu {
	
	Scanner sc = new Scanner(System.in);
	
	private BakeryController bc = new BakeryController();
	
	public BakeryMenu() {
				
	}
	
	public void mainMenu() {
		
		while(true) {
			System.out.println("======= 메인 메뉴 =======");
			System.out.println("1. 현재 내 정보 보기");
			System.out.println("2. 빵 검색하기");
			System.out.println("3. 빵 구매하기");
			System.out.println("9. 프로그램 종료하기");
			
			System.out.print("메뉴 번호 선택 : ");
			int menu = sc.nextInt(); 
			
			sc.nextLine();
			
			switch (menu) {
			  case 1: {
				  bc.selectMem();
				  break;
			  }
			  
			  case 2: {
				  searchBread();
				  break;
			  }
			  
			  case 3: {
				  buyBread();
				  break;
			  }
			  
			  case 9: {
				  System.out.println("프로그램을 종료합니다.");
				  return; 
			  }
			}
		}
		
	}
	
	public void searchBread() {
		System.out.print("검색할 빵 이름 : ");
		String breadName = sc.nextLine(); 
		Bread b = bc.searchBread(breadName);
		
		if(b != null) {
			String str = b.information();
			System.out.println(str);
		} else {
			System.out.println("검색된 빵이 없습니다.");
		}
		
	}
	
	public void buyBread() {
		
		int result = 0; 
		
		while(true) {
			System.out.println("======= 빵 메뉴 =======");
			System.out.println("1. 소라빵");
			System.out.println("2. 단팥빵");
			System.out.println("3. 샌드위치");
			System.out.println("9. 이전메뉴로");
			System.out.print("구매하고 싶은 빵 번호 : ");
			int breadNumber = sc.nextInt();
			
			switch(breadNumber) {
			  case 1: {
				  result = bc.buyBread(breadNumber);
				  break;
			  }
			  
			  case 2: {
				  result = bc.buyBread(breadNumber);
				  break;
			  }
			  
			  case 3: {
				  result = bc.buyBread(breadNumber);
				  break;
			  }
			  
			  case 9: {
				  return; 
			  }
			  
			  
			}
			
			switch(result) {
			 case 1: {
				 System.out.println("성공적으로 구매되었습니다.");
				 break;
			 }
			 
			 case -1: {
				 System.out.println("하루 섭취량을 넘었습니다. 살쪄욧");
				 break;
			 }
			 
			 case -2: {
				 System.out.println("돈이 모자랍니다..ㅠㅠ");
				 break;
			 }
			 
			 default: {
				 System.out.println("돈도 없고 하루 섭취량도 넘어섰습니다.");
				 break; 
			 }
			}
		}
		
		
	}

}
