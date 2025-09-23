package mvc.model.vo;

public class Member {
	
	private String name;
	private int money;
	private char gender;
	private int metabolism;
	
	public Member() {
		
	}
	
	public Member(String name, int money, char gender) {
		this.name = name;
		this.money = money;
		this.gender = gender;		
		
		if(this.gender == 'F') {
			this.metabolism = 1500;
		} else if(this.gender == 'M') {
			this.metabolism = 1800;
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public int getMetabolism() {
		return metabolism;
	}

	public void setMetabolism(int metabolism) {
		this.metabolism = metabolism;
	}
	
	public String information() {
		String str = "이름 : " + name + ", 돈 : " + money + ", 성별 : " + gender + ", 남은 섭취량 : " + metabolism;
		return str; 
	}

}
