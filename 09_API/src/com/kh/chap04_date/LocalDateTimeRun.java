package com.kh.chap04_date;

import java.time.LocalDateTime;

public class LocalDateTimeRun {

	public static void main(String[] args) {
		// jdk 8버전부터 추가된 날짜 및 시간 API
		// Date의 단점을 보완 
		
		//현재 날짜와 시간
		LocalDateTime today = LocalDateTime.now();
		
		System.out.println(today);
		
		//특정 날짜와 시간 지정
		LocalDateTime finalDay = LocalDateTime.of(2025,12,31,23,59,59);
		System.out.println(finalDay);
		
		int year = today.getYear();
		int month = today.getMonthValue();
		int day = today.getDayOfMonth(); 
		int hour = today.getHour();
		int min = today.getMinute();
		int sec = today.getSecond();
		
		System.out.println("년 : " + year);
		System.out.println("월 : " + month);
		System.out.println("일 : " + day);
		System.out.println("시 : " + hour);
		System.out.println("분 : " + min);
		System.out.println("초 : " + sec);
		
		//날짜 계산 메소드 
		
		LocalDateTime dayPlus = today.plusDays(5);
		System.out.println(dayPlus);
		
		//시간 더하기 
		LocalDateTime timePlus = today.plusHours(1);
		System.out.println("1시간 후 : " +timePlus);
		
		//월 더하기
		LocalDateTime monthPlus = today.plusMonths(5);
		System.out.println("5달 후 : " + monthPlus);
		
		//날짜 빼기
		LocalDateTime dayMinus = today.minusDays(21);
		System.out.println("21일 전 : " + dayMinus);
		
		//시간 빼기
		LocalDateTime hourMinus = today.minusHours(8);
		System.out.println("8시간 전 : " + hourMinus);
		
		//월 빼기
		LocalDateTime monthMinus = today.minusMonths(1);
		System.out.println("한달 전 : " + monthMinus);
		

	}

}
