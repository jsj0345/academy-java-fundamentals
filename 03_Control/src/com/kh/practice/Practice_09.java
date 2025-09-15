package com.kh.practice;

import java.util.Scanner;

public class Practice_09 {
	
	public void method1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("중간 고사 점수 : ");
	    int mid_score = sc.nextInt();
	    
	    System.out.print("기말 고사 점수 : ");
	    int final_score = sc.nextInt();
	    
	    System.out.print("과제 점수 : ");
	    int homework_score = sc.nextInt(); 
	    
	    System.out.print("출석 회수(0~20 입력) : ");
	    int attendance = sc.nextInt();
	    
	    System.out.println("================= 결과 ==================");
	    
	    double conversion_mid = mid_score * 0.2;
	    double conversion_final = final_score * 0.3;
	    double conversion_homework = homework_score * 0.3;
	    double conversion_attendance = attendance; 
	    
	    System.out.println("중간 고사 점수(20) : " + conversion_mid);
	    System.out.println("기말 고사 점수(30) : " + conversion_final);
	    System.out.println("과제 점수    (30) : " + conversion_homework);
	    System.out.println("출석 점수    (20) : " + conversion_attendance);
	    
	    double sum_score = (conversion_mid + conversion_final + conversion_homework +
	    		conversion_attendance); 
	    
	    System.out.println("총점 : " + sum_score);
	    
	    if(sum_score >= 70 && attendance > (20 * 0.7)) {
	    	System.out.println("PASS");
	    } else if(sum_score < 70 && attendance > (20*0.7)) {
	    	System.out.println("Fail [점수 미달]");
	    } else if(attendance <= (20 * 0.7)) {
	    	System.out.println("Fail [출석 회수 부족 " + "(" + attendance + "/" + "20)]");
	    }
	    
	    
	}

}
