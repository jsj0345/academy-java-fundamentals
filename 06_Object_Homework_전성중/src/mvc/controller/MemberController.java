package mvc.controller;

import mvc.model.vo.Member2;

public class MemberController {
	
	private Member2 mem = new Member2("admin", "1234", "홍길동", "901022-1562334", 163.0); 
	
	public MemberController() {
		
	}
	
	public int login(String id, String pwd) {
		if(mem.getMemberId().equals(id) && mem.getMemberPwd().equals(pwd)) {
			return 1;
		} else {
			return 0; 
		}
		
	}
	
	public Member2 readInfo() {
		return mem; 
	}
	
	public int readAge() { // 여기 구현
		String str = mem.getCitizenNo().substring(0, 2); // 앞 2자리 추출
		String afterNumber = mem.getCitizenNo().substring(7,8); // 뒤 1자리 추출
		int this_year = 2025; // 이번년도
		
		switch(afterNumber) {
		  case "1":
		  case "2": {
			  str = "19" + str;
			  break;
		  }
		  case "3":
		  case "4": {
			  str = "20" + str;
			  break; 
		  }
		  			  
		}
		
		int birth_year = Integer.parseInt(str); // 출생년도 
		
		int age = this_year - birth_year + 1;
		
		return age; 
	}
	
	public void updateHeight(double height) {
		mem.setHeight(height);
	}

}
