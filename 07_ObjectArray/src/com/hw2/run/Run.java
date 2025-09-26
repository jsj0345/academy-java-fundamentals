package com.hw2.run;

import java.util.Scanner;

import com.hw2.model.vo.Student;

public class Run {

	public static void main(String[] args) {
		Student[] students = new Student[10];
		
		int count = 0; // 학생 수를 나타내는 변수 -> 한명 추가시 1씩 증가.
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("학년 입력 : ");
			int grade = sc.nextInt();
			
			System.out.print("반 입력 : ");
			int classroom = sc.nextInt();
			sc.nextLine(); 
			
			System.out.print("이름 입력 : ");
			String name = sc.nextLine();
			
			System.out.print("국어 점수 : " );
			int kor = sc.nextInt();
			
			System.out.print("영어 점수 : ");
			int eng = sc.nextInt();
			
			System.out.print("수학 점수 : ");
			int math = sc.nextInt();
			
			if(count>=10) {
				System.out.println("더 이상 추가 불가"); // 인덱스 넘기면 예외터짐. 
				break;
			}
			
			students[count] = new Student(grade, classroom, name, kor, eng, math);
			
			count = count + 1;
			
			sc.nextLine(); 
			
			System.out.println("계속 추가하시겠습니까?");
			System.out.print("추가하지 않을거면 n을 입력하시오(할거면 아무거나) : ");
			String str = sc.nextLine();
			
			if(str.equals("n")) {
				break; 
			}
		
		}
		
		for(int i = 0; i < count; i++) {
			System.out.println(students[i].information());
			
			double sum = (students[i].getEng() + students[i].getMath() + students[i].getKor()) / 3.0; 
			System.out.println(students[i].getName() +" 학생의 평균은 " + sum);
		}

	}

}
