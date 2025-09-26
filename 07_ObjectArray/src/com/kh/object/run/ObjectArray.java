package com.kh.object.run;

import java.util.Scanner;

import com.kh.object.model.vo.Book;

public class ObjectArray {
	
	public static void main(String[] args) {
		
		//Book 클래스자료형으로 객체 배열 생성해보기
		//[표현법] 클래스명[] 배열명 = new 클래스명[크기];
		//Book 클래스 자료형을 3개 담을 수 있는 배열 선언 및 할당
//		Book[] bArr = new Book[3];
//		System.out.println(bArr);
//		System.out.println(bArr[0]);
//		System.out.println(bArr[1]);
//		System.out.println(bArr[2]);
		
		//객체배열의 각 인덱스 위치에는 선언할때 작성한 클래스 자료형으로 만든 객체가 들어가게 된다.
		//해당 객체를 생성하여 참조변수 대신 객체배열의 인덱스 활용하기
//		bArr[0] = new Book("일번책", "일번출판사", "김일번",15000,0.15);
//		bArr[1] = new Book("이번책", "이번출판사", "김이번",18000,0.33);
//		bArr[2] = new Book("삼번책", "삼번출판사", "김삼번",20000,0.22);
		
		//각 인덱스 다시 출력해보기
//		System.out.println(bArr[0]);
//		System.out.println(bArr[1]);
//		System.out.println(bArr[2]);
//		
//		//각 인덱스에 담긴 객체 정보를 확인할 수 있는 메소드 호출하기
//		System.out.println(bArr[0].information());
//		System.out.println(bArr[1].information());
//		System.out.println(bArr[2].information());
		
		//위에 한 예시를 참고하여
		//사용자에게 책 정보를 입력받아(모든 필드) 반복문을 이용한 객체 생성 구문을 작성하여
		//객체배열에 담고 information 메소드를 이용해 출력해보기
		//객체배열명 : bookArr, 크기 : 3
		//객체 생성용 반복문과 정보 출력용 반복문을 따로 작성해보기
		
		Book[] bookArr = new Book[3];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < bookArr.length; i++) {
			//bookArr[i] = new Book("자바","백엔드","스프링",1000,35.0);
			System.out.println("책 제목 : ");
			String title = sc.nextLine();
			System.out.println("출판사 : ");
			String publisher = sc.nextLine(); 
			System.out.println("저자 : ");
			String author = sc.nextLine();
			System.out.println("가격 : ");
			int price = sc.nextInt();
			System.out.println("할인률 : ");
			double discountRate = sc.nextDouble(); 
			sc.nextLine();
			bookArr[i] = new Book(title, publisher, author, price, discountRate);
			
		}
		
		//정보 출력용 반복문
		for(Book book : bookArr) {
			System.out.println(book.information());
		}
		
		//사용자에게 책 제목을 입력받아 해당 책 제목의 가격을 출력해보세요
		//만약 없는 책을 입력했다면 도서가 없습니다를 출력하기
		//출력형식 : OOO책의 가격은 OOO원입니다.
		
		System.out.println("책 제목을 입력하시오 : ");
		String book_title = sc.nextLine();
		
		int index = -1; 
		
		Book selected = null; // 인덱스 위치에서 나올 수 없는 값을 이용해 초기화.
		
		for(int i = 0; i < bookArr.length; i++) {
			if(bookArr[i].getTitle().equals(book_title)) {
				//찾아내면 해당 인덱스 위치 기록
				//찾아내면 해당 객체주소값 기록
				index = i; // 해당 인덱스 위치 기록
				selected = bookArr[i];
				break; 
			}
		}
		
		//위에서 찾아낸 정보를 이용하여 출력해보기
		if(index!=-1) {
			System.out.println(bookArr[index].getTitle() + " 책의 가격은 " +
		                       bookArr[index].getPrice() + "원 입니다.");
		} else {
			System.out.println("검색된 도서가 없습니다.");
		}
		
	    
		System.out.println("====객체주소값 대입으로 찾은 결과===");
		if(selected != null) {
			System.out.println(selected.getTitle() + " 책의 가격은 " + 
		                       selected.getPrice() + "원 입니다.");
		} else {
			System.out.println("검색된 도서가 없습니다.");
		}
		

	}
	
}
