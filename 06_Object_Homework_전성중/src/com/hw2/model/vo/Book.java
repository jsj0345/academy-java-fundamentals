package com.hw2.model.vo;

//책에 대한 정보를 생성자를 활용하여 멤버 변수에 초기화 
//Getter & Setter 활용

public class Book {
	
	private String title;
	private int price;
	private double discountRate;
	private String author;
	
	public Book() {
		
	}
	
	public Book(String title, int price, double discountRate, 
			String author) {
		this.title = title;
		this.price = price;
		this.discountRate = discountRate;
		this.author = author; 
	}
	
	public String information() {
		return title + "  " + price + "  " + discountRate + "  " + author;
		
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title; 
	}
	
	public int getPrice() {
		return price; 
	}
	
	public void setPrice(int price) {
		this.price = price;
	}	
	
	public double getdiscountRate() {
		return discountRate;
	}
	
	public void setdiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String author) {
		this.author = author; 
	}
	
	

}
