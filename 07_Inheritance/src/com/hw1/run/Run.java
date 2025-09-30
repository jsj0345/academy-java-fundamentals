package com.hw1.run;

import java.util.Scanner;

import com.hw1.model.vo.Employee;
import com.hw1.model.vo.Student;

public class Run {

	public static void main(String[] args) {
		// 3명의 학생 정보를 기록할 수 있게 객체 배열 할당 (Student[])
		// 위의 사용데이터 참고하여 3명의 학생 정보 초기화
		// 위의 학생 정보 모두 출력 
		// 최대 10명의 사원 정보를 기록할 수 있게 배열을 할당 (Employee[])
		// 사원들의 정보를 키보드로 계속 입력 받고 --> while(true) 무한 반복문을 통해
		// 입력받은 정보들을 가지고 매개변수 생성자를 이용하여 객체배열에 객체 생성
		// 한 명씩 추가 될 때마다 카운트함
		// 계속 추가할 것인지 물어보고, 대소문자 상관없이 ‘y’이면 계속 객체 추가
		// ‘n’일 경우 더 이상 그만 입력 받도록..
		// 배열에 담긴 사원들의 정보를 모두 출력
		Student[] sArr = new Student[3];
//		홍길동 20 178.2 70.0 1 정보시스템공학과
//		김말똥 21 187.3 80.0 2 경영학과
//		강개순 23 167.0 45.0 4 정보통신공학과
		sArr[0] = new Student("홍길동",20,178.2,70.0,1,"정보시스템공학과");
		sArr[1] = new Student("김말똥",21,187.3,80.0,2,"경영학과");
		sArr[2] = new Student("강개순",23,167.0,45.0,4,"정보통신공학과");
		
		for(int i=0; i<sArr.length; i++) {
			System.out.println(sArr[i].information());
		}
		
		System.out.println("========================================");
		Employee[] eArr = new Employee[10];
		Scanner sc = new Scanner(System.in);
		int count = 0;
		
		while(true) {
			System.out.println("사원을 추가하시겠습니까? (y/n) : ");
			//문자열.toLowerCase() : 해당 문자열을 모두 소문자로 변환 
			//문자열.toUpperCase() : 해당 문자열을 모두 대문자로 변환
			String answer = sc.nextLine().toLowerCase();
			
//			박보검 28 180.3 72.0 100000000 영업부
//			강동원 40 182.0 76.0 200000000 기획부
			//입력받은게 y 면서 count(등록인원수)가 배열크기보다 작을때
			if(answer.equals("y")&&count<eArr.length) {
				System.out.println("이름 : ");
				String name = sc.nextLine();
				System.out.println("나이 : ");
				int age = sc.nextInt();
				System.out.println("키 : ");
				double height = sc.nextDouble();
				System.out.println("몸무게 : ");
				double weight = sc.nextDouble();
				System.out.println("급여 : ");
				int salary = sc.nextInt();
				System.out.println("부서 : ");
				sc.nextLine();//개행문자 제거
				String dept = sc.nextLine();
				
				eArr[count++] = new Employee(name,age,height,weight,salary,dept);
				//count = count+1; 카운트 증가 작업을 위와같이 증감연산 후위연산으로 처리하기
			}else {
				break; //무한반복 벗어나기
			}
		}
		
		//입력받은 데이터들 출력하기 
//		for(int i=0; i<eArr.length; i++) {
//			if(eArr[i] != null) {//null이 아닌경우에만 
//				System.out.println(eArr[i].information()); //출력
//			}
//			System.out.println(i+"번째");
//		}
		
		//입력 받은 인원만큼만 반복시키기
		for(int i=0; i<count; i++) {
			System.out.println(eArr[i].information());
		}
		
		sc.close();

	}

}
