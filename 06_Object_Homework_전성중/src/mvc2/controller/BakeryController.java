package mvc2.controller;

import mvc.model.vo.Bread;
import mvc.model.vo.Member;

public class BakeryController {
	
	private Member mem = new Member("홍길동", 10000, 'M');
	private Bread br1 = new Bread("소라빵", 1800, 410);
	private Bread br2 = new Bread("단팥빵", 2000, 500);
	private Bread br3 = new Bread("샌드위치", 4500, 450);
	
	public BakeryController() {
		
	}
	
	
	public Member selectMem() {
		System.out.println(mem.information());
		return mem; 
	}
	
	public Bread searchBread(String search) {
		
		while(true) {
			if(br1.getBreadName().equals(search)) {
				return br1;
			} else if (br2.getBreadName().equals(search)) {
				return br2;
			} else if(br3.getBreadName().equals(search)) {
				return br3;
			} else {
				System.out.println("존재하지 않는 빵입니다.");
				return null; 
			}
		}
		
		
	}
	
	public int buyBread(int num) {
		int result = 0; 
		
		switch(num) {
		  case 1: {
			  if((br1.getPrice() <= mem.getMoney()) && (br1.getCalory() <=mem.getMetabolism())) {
				  System.out.println("구매 가능");
				  result = 1; 
				  mem.setMoney(mem.getMoney() - br1.getPrice());
				  mem.setMetabolism(mem.getMetabolism() - br1.getCalory());  
				  System.out.println(mem.information());
			  } else if ((br1.getPrice() <= mem.getMoney()) && (br1.getCalory() > mem.getMetabolism())) {
				  result = -1; 
				  System.out.println("구매 불가능");
			  } else if((br1.getCalory() <= mem.getMetabolism()) && mem.getMoney() < br1.getPrice()) {
				  result = -2;
				  System.out.println("구매 불가능");
			  } else {
				  result = 0; 
			  }
			  break;
		  }
		  
		  case 2: {
			  if((br2.getPrice() <= mem.getMoney()) && (br2.getCalory() <=mem.getMetabolism())) {
				  System.out.println("구매 가능");
				  result = 1; 
				  mem.setMoney(mem.getMoney() - br2.getPrice());
				  mem.setMetabolism(mem.getMetabolism() - br2.getCalory());
				  System.out.println(mem.information());
			  } else if ((br2.getPrice() <= mem.getMoney()) && (br2.getCalory() > mem.getMetabolism())) {
				  result = -1; 
				  System.out.println("구매 불가능");
			  } else if((br2.getCalory() <= mem.getMetabolism()) && mem.getMoney() < br2.getPrice()) {
				  result = -2;
				  System.out.println("구매 불가능");
			  } else {
				  result = 0; 
			  }
			  break;
		  }
		  
		  case 3: {
			  if((br3.getPrice() <= mem.getMoney()) && (br3.getCalory() <=mem.getMetabolism())) {
				  System.out.println("구매 가능");
				  result = 1; 
				  mem.setMoney(mem.getMoney() - br3.getPrice());
				  mem.setMetabolism(mem.getMetabolism() - br3.getCalory());
				  System.out.println(mem.information());
			  } else if ((br3.getPrice() <= mem.getMoney()) && (br3.getCalory() > mem.getMetabolism())) {
				  result = -1; 
				  System.out.println("구매 불가능");
			  } else if((br3.getCalory() <= mem.getMetabolism()) && mem.getMoney() < br3.getPrice()) {
				  result = -2;
				  System.out.println("구매 불가능");
			  } else {
				  result = 0; 
			  }
			  break;
		  }
		  
		}
		
		return result; 
		
		
	}


}
