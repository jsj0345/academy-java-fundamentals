package mvc.model.vo;

public class Bread {
	
	private String breadName;
	private int price;
	private int calory;
	
	public Bread() {
		
	}
	
	public Bread(String breadName, int price, int calory) {
		this.breadName = breadName;
		this.price = price;
		this.calory = calory; 
	}

	public String getBreadName() {
		return breadName;
	}

	public void setBreadName(String breadName) {
		this.breadName = breadName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getCalory() {
		return calory;
	}

	public void setCalory(int calory) {
		this.calory = calory;
	}
	
	public String information() {
		String str = "빵 이름: " + breadName + ", 빵 가격 : " + price + ", 칼로리 : " + calory;
		return str; 
		
	}
	
	

}
