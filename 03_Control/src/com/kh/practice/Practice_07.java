package com.kh.practice;

import java.util.Scanner;

public class Practice_07 {
	
	public void method1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("키(m)를 입력해 주세요: ");
		double height = sc.nextDouble();
		
		System.out.print("몸무게(kg)를 입력해 주세요: ");
		double weight = sc.nextDouble();
		
		double BMI = weight / (height * height);
		System.out.println("BMI 지수 : " + BMI);
		
		if(BMI < 18.5) {
			System.out.println("저체중");
		} else if(BMI >= 18.5 && BMI < 23) {
			System.out.println("정상체중");
		} else if(BMI >= 23 && BMI < 25) {
			System.out.println("과체중");
		} else if(BMI >= 25 && BMI < 30) {
			System.out.println("비만");
		} else if(BMI >= 30) {
			System.out.println("고도 비만");
		}
	}

}
