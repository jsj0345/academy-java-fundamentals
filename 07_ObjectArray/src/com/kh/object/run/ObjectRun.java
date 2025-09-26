package com.kh.object.run;

import java.util.Scanner;

import com.kh.object.model.vo.Book;

public class ObjectRun {

	public static void main(String[] args) {
		
		//매개변수 3개짜리 생성자를 정의하고
		//도서명, 출판사, 저자명을 임의로 작성한뒤
		//객체 3개를 생성하여
		//각 객체별로 information() 메소드를 이용해 화면에 출력해보세요.
		
		//Book b = new Book("자바의정석","자바랩","모름");
		//Book b1 = new Book("자바의정석2","자바랩2","모름2");
		//Book b2 = new Book("자바의정석3","자바랩3","모름3"); 
		//System.out.println(b.information());
		//System.out.println(b1.information());
		//System.out.println(b2.information());
		
		//스캐너를 이용하여 입력받기
		//반복문을 이용하여 총 3권의 책 정보들을 입력받아(모든 필드정보)
		//객체 3개를 만들어 information 메소드로 정보를 출력해보기
		//title, publisher, author, price, discountRate
		
		Scanner sc = new Scanner(System.in);
		
		Book[] books = new Book[3];
		
		for(int i = 0; i < books.length; i++) {
			System.out.print("제목 : ");
			String title = sc.nextLine();
			
			System.out.print("출판사 : ");
			String publisher = sc.nextLine();
			
			System.out.print("저자 : ");
			String author = sc.nextLine();
			
			System.out.print("가격 : ");
			int price = sc.nextInt();
			
			System.out.print("할인률 : ");
			double discountRate = sc.nextDouble();
			
			books[i] = new Book(title, publisher, author, price, discountRate); 
			
			sc.nextLine(); 
		}
		
		for(Book book : books) {
			System.out.println(book.information());
		}
		
		
		

	}

}
