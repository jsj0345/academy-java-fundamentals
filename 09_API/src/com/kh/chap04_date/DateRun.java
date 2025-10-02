package com.kh.chap04_date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateRun {

	public static void main(String[] args) {
		/*
		 * Date 클래스
		 * 날짜와 시간에 대한 정보를 담을 수 있는 클래스
		 * java.util 패키지에 존재한다.
		 * 자바 초창기에 개발된 클래스이기 때문에 완성도가 낮아서
		 * 버전업 되며 deprecated(지원하지않음) 기능들이 있다.
		 * 
		 * 기본 생성자를 이용하여 생성하면 현재 시간정보를 확인 할 수 있다. 
		 */
		Date today = new Date();
		
		System.out.println(today);
		
		//기본 날짜 형식이 영문표현식이기 때문에
		//원하는 형식으로 변경해줄 수 있는 클래스
		//SimpleDateFormat을 이용한다.
		/*
		 * 표현 방식
		 * yyyy : 년
		 * MM : 월
		 * dd : 일
		 * HH : 24시 기준 시간
		 * hh : 12시 기준 시간
		 * mm : 분
		 * ss : 초
		 * a : 오전/오후
		 */
		
		//생성자에 형식문자열을 넣어서 생성하기
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a h:mm");
		
		//.format(Date 객체) : 지정한 형식에 맞춰 Date 객체 날짜를 문자열로 반환하는 메소드
		String todayStr = sdf.format(today); 
		
		//System.out.println(todayStr);
		
		//원하는 날짜를 지정하여 객체 생성 후 출력까지 해보기
		Date date = new Date(2025,12,25);
		//System.out.println(sdf.format(date));
		
		date = new Date(2025-1900,12-1,25);
		//System.out.println(sdf.format(date));

		//매개변수 생성자로 수료일인 2026.02.26 17:50에 대한 데이터를 넣고
		//우리의 수료일은 2026년 02월 26일 오후 5시 50분 입니다를 출력해보자.
		
		date = new Date(2026-1900, 2-1, 26, 17,50);
		SimpleDateFormat sdf2 = new SimpleDateFormat("우리의 수료일은 yyyy년 MM월 dd일 a h시 mm분 입니다.");
		System.out.println();
		System.out.println(sdf2.format(date));
		
		

	}

}
