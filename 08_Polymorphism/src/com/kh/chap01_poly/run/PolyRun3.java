package com.kh.chap01_poly.run;

import java.util.Scanner;

import com.kh.person.model.vo.Employee;
import com.kh.person.model.vo.Person;
import com.kh.person.model.vo.Student;

public class PolyRun3 {

	public static void main(String[] args) {
		//Person 객체배열 10크기로 생성 후 
		//사용자에게 1.사원 2.학생 선택받고 
		//해당 타입의 객체에 필요한 데이터를 입력받아 객체 생성하여
		//객체배열 인덱스에 넣고 
		// n 을 입력받으면 그만 입력받고 담겨있는 객체들의 정보 모두 출력하기
		Person[] arr = new Person[10];
		Scanner sc = new Scanner(System.in);
		
		int index = 0;//추가될때마다 증가시킬 숫자
		
		while(true) {//반복 
			System.out.println("1.사원");
			System.out.println("2.학생");
			
			System.out.println("메뉴 입력 : ");
			int menu = sc.nextInt();
			sc.nextLine();
			
			System.out.println("이름 : ");
			String name = sc.nextLine();
			System.out.println("나이 : ");
			int age = sc.nextInt();
			System.out.println("키 : ");
			double height = sc.nextDouble();
			System.out.println("몸무게 : ");
			double weight = sc.nextDouble();
			
			switch(menu) {
				case 1 : 
					System.out.println("급여 : ");
					int salary = sc.nextInt();
					System.out.println("부서 : ");
					sc.nextLine();
					String dept = sc.nextLine();
					
					arr[index++] = new Employee(name,age,height,weight,salary,dept);
				break;
				
				case 2 :
					System.out.println("학년 : ");
					int grade = sc.nextInt();
					System.out.println("전공 : ");
					sc.nextLine();
					String major = sc.nextLine();
					
					arr[index++] = new Student(name,age,height,weight,grade,major);
				break;			
					
				default : System.out.println("번호를 잘못입력하셨습니다."); continue;
			}
			
			if(index!=arr.length) {
				System.out.println("더 추가하시겠습니까?(y/n) : ");		
				
				char answer = sc.next().charAt(0);
				
				if(answer=='n'||answer=='N') {
					break;
				}
			}else {
				System.out.println("더 이상 추가할 수 없습니다. 프로그램을 종료합니다.");
				break;//무한반복 벗어나기
			}
		}
		//객체배열에 담겨있는 각 객체정보 출력하기 
		for(int i=0; i<index; i++) {
			System.out.println(arr[i].information());
		}
		
		sc.close();
		
	}

}
