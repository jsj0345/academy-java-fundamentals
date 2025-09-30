package com.kh.practice.chap01_poly.controller;

import java.util.Arrays;

import com.kh.chap01_poly.model.vo.AniBook;
import com.kh.chap01_poly.model.vo.Book;
import com.kh.chap01_poly.model.vo.CookBook;
import com.kh.chap01_poly.model.vo.Member;

public class LibraryController {
	
	private Member mem = null;
	
	private Book[] bList = new Book[5]; 
	
	public LibraryController() {
		bList[0] = new CookBook("백종원의 집밥", "백종원", "tvN", true);
		bList[1] = new AniBook("한번 더 해요", "미티", "원모어", 19);
		bList[2] = new AniBook("루피의 원피스", "루피", "japan", 12);
		bList[3] = new CookBook("이혜정의 얼마나 맛있게요", "이혜정", "문학", false);
		bList[4] = new CookBook("최현석 날 따라해봐", "최현석", "소금책", true);
	}
	
		
	
	public void insertMember(Member mem) {
		this.mem = mem; 
	}
	
	public Member myInfo() {
		return mem; 
	}
	
	public Book[] selectAll() {
		return bList;
	}
	
	public Book[] searchBook(String keyword) {
		Book[] books = new Book[5];
		int count = 0;
		
		for(int i = 0; i < bList.length; i++) {
			if(bList[i].getTitle().contains(keyword)) {
				books[count] = bList[i];
				count++; 
			}
		}
		
		return Arrays.copyOf(books, count); 
	}
	
	public int rentBook(int index) {
		int result = 0; 
		
		/*
		for(int i = 0; i < bList.length; i++) {
			System.out.println(bList[i].toString());
		}
		*/
		
		/*
		if(index == 1 || index == 2) {
			AniBook animation = (AniBook) bList[index];
			if(animation.getAccessAge() > mem.getAge()) {
				result = 1; 
				
			}
		} else {
			if(index == 0 || index == 3 || index == 4) {
				CookBook cookBook = (CookBook) bList[index];
				if(cookBook.isCoupon()) {
					result = 2; 
					mem.setCouponCount(mem.getCouponCount()+1);
				}
			}
		}
		*/
		//AniBook인 경우
		if(bList[index] instanceof AniBook) {
			AniBook ani = (AniBook)bList[index]; // Book을 AniBook으로 다운캐스팅
			if(ani.getAccessAge() > mem.getAge()) {
				result = 1; 
			}
		}
		
		//요리책인경우
		if(bList[index] instanceof CookBook) {
			CookBook cook = (CookBook)bList[index];
			
			//isCoupon() 반환값이 논리값이기 때문에 바로 조건에 넣을 수 있음 true/false
			if(cook.isCoupon()) {
				
				mem.setCouponCount(mem.getCouponCount()+1);
				result = 2;
				
			}
		}
		
		return result; 
		
	}	

	public Member getMem() {
		return mem;
	}

	public void setMem(Member mem) {
		this.mem = mem;
	}

	public Book[] getbList() {
		return bList;
	}

	public void setbList(Book[] bList) {
		this.bList = bList;
	}
	
	

}
