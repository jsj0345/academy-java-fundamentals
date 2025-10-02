package com.kh.chap04_date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarRun {

	public static void main(String[] args) {
		//캘린더를 이용하여 날짜 확인해보기
		//Calendar c = new Calendar(); 추상 클래스이기 때문에 객체 생성불가
		Calendar c = Calendar.getInstance(); // 객체 생성 메소드를 이용하여 처리
		
		//값 세팅
		//월은 세팅시 0~11까지 입력디기 때문에 -1 처리해서 등록해야한다.
		//c.set(2025,10,02,16,18,00);
		
		System.out.println(c.toString());
		//각 정보들 추출해보기
		int year = c.get(Calendar.YEAR);
		System.out.println("년도 : " + year);
		
		// 값이 0~11로 들어가기 때문에 뽑아줄때 +1 처리 
		int month = c.get(Calendar.MONTH) + 1;
		System.out.println("월 : " + month);
		
		int date = c.get(Calendar.DATE);
		System.out.println("일 : " + date);
		
		int hour = c.get(Calendar.HOUR);
		System.out.println("12시간 기준 시 : " + hour);
		
		int hour2 = c.get(Calendar.HOUR_OF_DAY);
		System.out.println("24시간 기준 시 : " + hour2);
		
		int min = c.get(Calendar.MINUTE);
		System.out.println("분 : " + min);
		
		int sec = c.get(Calendar.SECOND);
		System.out.println("초 : " + sec);
		
		int week = c.get(Calendar.DAY_OF_WEEK);
		System.out.println("요일 : " + week); // 일~토 1~7
     	
		Date today = c.getTime();
		String result = new SimpleDateFormat("yyyy-MM-dd a HH:mm:ss").format(today); 
		
		System.out.println("Date 형식으로 변환");
		System.out.println(today);
		System.out.println(result);
	}

}
