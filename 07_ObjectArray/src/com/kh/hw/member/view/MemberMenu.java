package com.kh.hw.member.view;

import java.util.Scanner;

import com.kh.hw.member.controller.MemberController;
import com.kh.hw.member.model.vo.Member;

public class MemberMenu {
	
	private Scanner sc = new Scanner(System.in);
	
	private MemberController mc = new MemberController();
	
	public MemberMenu() {
		
	}
	
	public void mainMenu() {
	  
	  while(true) {
		  System.out.println("최대 등록 가능한 회원 수는 " + mc.SIZE +"명입니다");
		  
		  int member_size = mc.existMemberNum(); // 현재 회원수 
		  
		  System.out.println("현재 등록된 회원 수는 " + member_size + "명입니다.");
		  
		  if(member_size < 10) {
			  System.out.println("1. 새 회원 등록");
			  System.out.println("2. 회원 검색");
			  System.out.println("3. 회원 정보 수정");
			  System.out.println("4. 회원 삭제");
			  System.out.println("5. 모두 출력");
			  System.out.println("9. 끝내기");
			  
			  System.out.print("메뉴 번호 : ");
			  int menu = sc.nextInt();
			  sc.nextLine(); 
			  
			  switch(menu) {
			   case 1: {
				 System.out.println("새로운 회원을 등록합니다.");
				 insertMember();
				 member_size++;
				 break;
			   }
			   
			   case 2: {
				   
				   if(member_size > 0) {
					   System.out.println("회원을 검색합니다.");
					   searchMember(); 
				   } else {
					   System.out.println("회원이 없어서 등록부터 해야합니다.");
				   }
				   break;
			   }
			   
			   case 3: {
				   
				   if(member_size > 0) {
					   System.out.println("회원 정보를 수정합니다.");
					   updateMember();
				   } else {
					   System.out.println("회원이 없어서 등록부터 해야합니다.");
				   }
				   
				   break;
			   }
			   
			   case 4: {
				   if(member_size > 0) {
					   System.out.println("회원을 삭제 합니다.");
					   deleteMember();
					   member_size--;
				   } else {
					   System.out.println("삭제할 회원이 없습니다.");
				   }
	
				   break;
			   }
			   
			   case 5: {
				   System.out.println("모든 회원 출력");
				   printAll(); 
				   break; 
			   }
			   
			   case 9: {
				   System.out.println("끝내기");
				   return; 
			   }
			   
			   default : {
				   System.out.println("잘못 입력하셨습니다. 다시 입력해주세요");
				   break; 
			   }
			 }
	
		  } else if(member_size == 10) {
			  System.out.println("회원 수가 모두 꽉 찼기 때문에 일부 메뉴만 오픈됩니다.");
			  System.out.println("2. 회원 검색");
			  System.out.println("3. 회원 정보 수정");
			  System.out.println("4. 회원 삭제");
			  System.out.println("5. 모두 출력");
			  System.out.println("9. 끝내기");
			  
			  System.out.print("메뉴 번호 : ");
			  int menu = sc.nextInt(); 
			  sc.nextLine();
			  
			  switch(menu) {
			    case 2: {
			    	System.out.println("회원을 검색합니다.");
			    	searchMember();
			    	break;
			    }
			    
			    case 3: {
			    	System.out.println("회원 정보를 수정합니다.");
			    	updateMember();
			    	break;
			    }
			    
			    case 4: {
			    	System.out.println("회원을 삭제합니다.");
			    	deleteMember();
			    	member_size--; 
			    	break;
			    } 
			    
			    case 5: {
			    	System.out.println("모두 출력.");
			    	printAll();
			    	break;
			    }
			    
			    case 9: {
			    	System.out.println("프로그램 종료");
			    	return; 
			    }
			    
			    default : {
			    	System.out.println("잘못 입력하셨습니다. 다시 입력해주세요");
					break;
			    }
			    
			  }
			  
		  }
		  
		  
	  }
	}  
	
	public void insertMember() {
		System.out.println("회원 등록할 아이디, 이름 , 비밀번호, 이메일, 성별, 나이를 입력해주세요.");
		while(true) {
			System.out.print("아이디를 입력하시오 : ");
			String id = sc.nextLine();
			
			if(mc.checkId(id)) { // 중복검사가 true면
				System.out.println("중복된 아이디입니다. 다시 입력해주세요.");
				continue; 
			}
			
			System.out.print("이름을 입력하시오 : ");
			String name = sc.nextLine();
			
			System.out.print("비밀번호를 입력하시오 : ");
			String password = sc.nextLine();
			
			System.out.print("이메일을 입력하시오 : ");
			String email = sc.nextLine();
			
			System.out.print("성별을 입력하시오 : ");
			char gender = sc.nextLine().charAt(0); 
			
			while(true) { // 성별 잘못 입력하면 무한루프 잘 입력하면 빠져나가기 
				if(gender != 'M' && gender != 'm' && gender !='f' && gender != 'F') {
					System.out.print("성별을 다시 입력하세요 : ");
					gender = sc.nextLine().charAt(0);
					continue;
				}
				break;
			}
			
			System.out.print("나이를 입력하세요 : ");
			int age = sc.nextInt(); 
			
			sc.nextLine();
			mc.insertMember(id, name, password, email, gender, age);
			
			return; 
			
		}
		
		
		
	}
	
	public void searchMember() {
		
		while(true) {
			System.out.println("1. 아이디로 검색하기");
			System.out.println("2. 이름으로 검색하기");
			System.out.println("3. 이메일로 검색하기");
			System.out.println("9. 메인으로 돌아가기");
			
			System.out.print("메뉴 번호 입력 : ");
			int menu = sc.nextInt();
			sc.nextLine(); 
			
			switch(menu) {
			 case 1: {
				 System.out.println("아이디 검색");
				 searchId();
				 break;
			 }
			 
			 case 2: {
				 System.out.println("이름으로 검색");
				 searchName();
				 break;
			 }
			 
			 case 3: {
				 System.out.println("이메일로 검색");
				 searchEmail();
				 break; 
			 }
			 
			 case 9: {
				 System.out.println("메인으로 돌아가기");
				 return; 
			 }
			 
			 default: {
				 System.out.println("잘못 입력하셨습니다.");
				 return; 
			 }
			
			}
		}
		
	}
	
	public void searchId() {
		
		System.out.print("아이디를 입력하시오 : ");
		String search = sc.nextLine();
		
		if(mc.searchId(search).equals("없음")) {
		  System.out.println("검색 결과가 없습니다.");
		} else {
		  System.out.println("찾으신 회원 조회 결과입니다.");
		  System.out.println(mc.searchId(search));
		}
	
	
	}

	public void searchName() { // Member 객체 배열 반환할때 대처 어떻게 해야하나? 
		System.out.print("이름을 입력하시오 : ");
        String search = sc.nextLine();
        Member[] member = mc.searchName(search);
		
        
        	if(member == null) { //mc.searchName(search)equals(null)
      		  System.out.println("검색 결과가 없습니다.");
      		} else {
//      		  System.out.println("찾으신 회원 조회 결과입니다.");
//      		  for(int i = 0; i < member.length; i++) {
//      			  System.out.println(member[i].inform());
//      		  }
      		  for(int i = 0; i < member.length; i++) {
      			  if(member[i].getName().equals(search)) {
      				System.out.println("찾으신 회원 조회 결과입니다.");
        			System.out.println(member[i].inform());
        		  } else if (i==member.length -1) {
        			  System.out.println("검색 결과가 없습니다."); 
        		  }
      		  }	 
      		  
      		}
        	
        	
        
		
		
	}
	
	public void searchEmail() {
		System.out.print("이메일을 입력하시오 : ");
		String email = sc.nextLine();
		Member[] member = mc.searchEmail(email);
		
		if(member == null) { //.equals(null)
			System.out.println("검색 결과가 없습니다.");
		} else {
//			System.out.println("찾으신 회원 조회 결과입니다.");
//			for(int i = 0; i < member.length; i++) {
//				System.out.println(member[i].inform());
//			}
			
			for (int i = 0; i < member.length; i++) {
				if (member[i].getEmail().equals(email)) {
					System.out.println("찾으신 회원 조회 결과입니다.");
					System.out.println(member[i].inform());
				} else if (i==member.length -1) {
      			  System.out.println("검색 결과가 없습니다."); 
      		  }
			}
			
		}
		
		
		
	}
	
	public void updateMember() {
		
		while(true) {
			System.out.println("1. 비밀번호 수정하기");
			System.out.println("2. 이름 수정하기");
			System.out.println("3. 이메일 수정하기");
			System.out.println("9. 메인으로 돌아가기");
			System.out.print("메뉴번호를 입력하시오 : ");
			int menu = sc.nextInt();
			sc.nextLine();
			
			switch(menu) {
			  case 1: {
				  System.out.println("비밀번호 수정");
				  updatePassword();
				  break;
			  }
			  
			  case 2: {
				  System.out.println("이름 수정");
				  updateName();
				  break;
			  }
			  
			  case 3: {
				  System.out.println("이메일 수정");
				  updateEmail();
				  break;
			  }
			  
			  case 9 : {
				  System.out.println("메인으로 돌아갑니다.");
				  return; 
			  }
			  
			  default : {
				  System.out.println("잘못 입력하셨습니다.");
				  return; 
			  }
				  
			}
			
		}
		
	}
	
	public void updatePassword() {
		System.out.print("수정할 회원 id를 입력하시오 : ");
		String id = sc.nextLine();
		
		System.out.print("수정할 비밀번호를 입력하시오 : ");
		String password = sc.nextLine(); 
		
		boolean bool = mc.updatePassword(id, password);
		
		if(bool == true) {
			System.out.println("수정이 성공적으로 되었습니다.");
		} else {
			System.out.println("존재하지 않는 id입니다.");
		}
		
	}
	
	public void updateName() {
		System.out.print("수정할 회원 id를 입력하시오 : ");
		String id = sc.nextLine();
		
		System.out.print("수정할 이름을 입력하시오 : ");
		String name = sc.nextLine();
		
		boolean bool = mc.updateName(id, name);
		
		if(bool) {
			System.out.println("수정이 성공적으로 되었습니다.");
		} else {
			System.out.println("존재하지 않는 id입니다.");
		}
		
	}
	
	public void updateEmail() {
		System.out.print("수정할 회원 id를 입력하시오 : ");
		String id = sc.nextLine();
		
		System.out.print("수정할 이메일을 입력하시오 : ");
		String email = sc.nextLine();
		
		boolean bool = mc.updateEmail(id, email);
		
		if(bool) {
			System.out.println("수정이 성공적으로 되었습니다.");
		} else {
			System.out.println("존재하지 않는 아이이디입니다.");
		}
		
		
	}
	
	public void deleteMember() {
		
		while(true) {
			System.out.println("1. 특정 회원 삭제하기");
			System.out.println("2. 모든 회원 삭제하기");
			System.out.println("9. 메인으로 돌아가기");
			System.out.print("메뉴번호를 입력하시오 : ");
			int menu = sc.nextInt();
			sc.nextLine();
			
			switch(menu) {
			 case 1: {
				 System.out.println("특정회원 삭제");
				 deleteOne();
				 break;
			 }
			 
			 case 2: {
				 System.out.println("모든 회원 삭제");
				 deleteAll();
				 break;
			 }
			 
			 case 9: {
				 System.out.println("메인으로 돌아갑니다.");
				 return; 
			 }
			 
			 default: {
				 System.out.println("잘못 입력하셨습니다.");
				 return; 
			 }
			}
			
			
		}
	
		
	}
	
	public void deleteOne() {
		System.out.print("삭제할 회원 id를 입력하시오 : ");
		String id = sc.nextLine();
		System.out.print("정말 삭제하시겠습니까?");
		char response = sc.nextLine().charAt(0);
		Boolean bool = null;  
		
		if(response == 'Y' || response == 'y') {
			bool = mc.delete(id); 
		} else {
			System.out.println("Y나 y이외로 대답한 경우 메인메뉴로 다시 돌아갑니다.");
			return; 
		}
		
		if(bool) {
			System.out.println("성공적으로 삭제하였습니다.");
			
		} else {
			System.out.println("존재하지 않는 아이디입니다.");
		}
		
	}
	
	public void deleteAll() {
		System.out.print("정말 삭제하시겠습니까? : ");
		char response = sc.nextLine().charAt(0);
		
		if(response == 'Y' || response == 'y') {
		 	mc.delete();
		 	System.out.println("성공적으로 삭제하였습니다.");
		} else {
			System.out.println("Y나 y이외로 대답한 경우 메인메뉴로 다시 돌아갑니다.");
			
		}
		
	}
	
	public void printAll() {
		Member[] member = mc.printAll();
		if(mc.existMemberNum() == 0) {
			System.out.println("저장된 회원이 없습니다.");
		} else {
			for(int i = 0; i < mc.existMemberNum(); i++) {
				System.out.println(member[i].inform());
			}
		}
		
	}
}
