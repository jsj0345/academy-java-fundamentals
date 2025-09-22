package com.hw2.run;

import com.hw2.model.vo.Book;

//앞서 Book 클래스를 작성한 것을 바탕으로 메서드를 호출해서 정상적으로 나오는지 확인 
public class BookTest {

	public static void main(String[] args) {
		Book book = new Book();
		Book book2 = new Book("자바의 정석",20000,0.2,"윤상섭");
		
		System.out.println(book.information());
		System.out.println(book2.information());
		
		System.out.println("=============================");
		System.out.println("수정된 결과 확인");
		
		book.setTitle("C언어");
		book.setPrice(30000);
		book.setdiscountRate(0.1);
		book.setAuthor("홍길동");
		
		
		System.out.println(book.information());
		
		System.out.println("=============================");
		
		System.out.println("도서명 = " + book.getTitle());
		System.out.println("할인된 가격 = " + (book.getPrice() - (int)(book.getPrice() * book.getdiscountRate())) + "원");
		System.out.println("도서명 = " + book2.getTitle());
		System.out.println("할인된 가격 = " + (book2.getPrice() - (int)(book2.getPrice() * book2.getdiscountRate())) + "원");
		

	}

}
