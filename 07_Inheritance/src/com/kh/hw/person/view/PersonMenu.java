package com.kh.hw.person.view;

import java.util.Scanner;

import com.kh.hw.person.controller.PersonController;
import com.kh.hw.person.model.vo.Employee;
import com.kh.hw.person.model.vo.Student;

public class PersonMenu {
//	- sc:Scanner = new Scanner(System.in)
//	- pc:PersonController = new PersonController()
	private Scanner sc = new Scanner(System.in);
	private PersonController pc = new PersonController();
		
//	+ mainMenu() : void
	public void mainMenu() {
//		학생은 최대 3명까지 저장할 수 있습니다.
//		현재 저장된 학생은 M명입니다.
//		사원은 최대 10명까지 저장할 수 있습니다.
//		현재 저장된 사원은 N명입니다.
		// M과 N에 들어가는 숫자는 PersonController(pc)클래스에 있는
		// personCount()메소드의 반환 값을 이용하여 출력
//		1. 학생 메뉴 ➔ studentMenu()
//		2. 사원 메뉴 ➔ employeeMenu()
//		9. 끝내기 ➔ “종료합니다.” 출력 후 종료
//		메뉴 번호 :
		// 잘못 입력했을 경우 “잘못 입력하셨습니다. 다시 입력해주세요.” 출력 후 반복
		while(true) {
			int[] count = pc.personCount();
			System.out.println("학생은 최대 3명까지 저장할 수 있습니다.");
			System.out.println("현재 저장된 학생은 "+count[0]+" 명입니다.");
			System.out.println("사원은 최대 10명까지 저장할 수 있습니다.");
			System.out.println("현재 저장된 학생은 "+count[1]+" 명입니다.");
			
			System.out.println("1.학생 메뉴");
			System.out.println("2.사원 메뉴");
			System.out.println("9.끝내기");
			System.out.println("메뉴 번호 : ");
			int menu = sc.nextInt();
			sc.nextLine();
			
			switch(menu) {
				case 1 : studentMenu(); break;
				case 2 : employeeMenu(); break;
				case 9 : System.out.println("종료합니다."); return;
				default : System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		
		}
		
	}
//	+ studentMenu() : void
	public void studentMenu() {
//		1. 학생 추가 ➔ insertStudent()
//		2. 학생 보기 ➔ printStudent()
//		9. 메인으로 ➔ “메인으로 돌아갑니다.” 출력 후 메인으로
		// 만일 학생 객체 배열에 담긴 데이터의 수가 3개 일 때
		// “학생을 담을 수 있는 공간이 꽉 찼기 때문에 학생 추가 메뉴는 더 이상
		// 활성화 되지 않습니다.”를 출력 후 메뉴 번호를 담음
		// 실제로 1번을 누르면 “잘못 입력하셨습니다. 다시 입력해주세요.”를 출력
		// 학생 객체 배열에 담긴 데이터의 수가 3개가 아닐 때는
		// 위에 출력한 메뉴 모두 받을 수 있게 함
//		메뉴 번호 :
		// 잘못 입력했을 경우, “잘못 입력하셨습니다. 다시 입력해주세요.” 출력 후 반복
		
		while(true) {
			
			//학생 수 추출
			int sCount = pc.personCount()[0]; 
			
			System.out.println("1.학생 추가");
			System.out.println("2.학생 보기");
			System.out.println("9.메인으로");
	
			if(sCount == 3) {
				System.out.println("학생을 담을 수 있는 공간이 꽉 찼기 때문에 학생 추가 메뉴는 더 이상 활성화 되지 않습니다.");
			}

			System.out.println("메뉴번호 : ");
			int menu = sc.nextInt();
			sc.nextLine();
			
			//학생 꽉찼을때 비활성화 문구 출력 
			
			switch(menu) {
				case 1 : //학생수 3명으로 가득찼는데 1번 메뉴를 선택한 경우 조건처리 
					if(sCount!=3) {
						insertStudent(); 
					}else {
						System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
					}
				break;
				case 2 : printStudent(); break;	
				case 9 : System.out.println("메인으로 돌아갑니다."); return;
				default : System.out.println("잘못 입력하셨습니다.다시 입력해주세요."); 
			}
		}
	}
//	+ employeeMenu() : void
	public void employeeMenu() {
		
		while(true) {
			
			//사원 수 추출
			int eCount = pc.personCount()[1]; 
			
			System.out.println("1.사원 추가");
			System.out.println("2.사원 보기");
			System.out.println("9.메인으로");
	
			if(eCount == 10) {
				System.out.println("사원을 담을 수 있는 공간이 꽉 찼기 때문에 사원 추가 메뉴는 더 이상 활성화 되지 않습니다.");
			}

			System.out.println("메뉴번호 : ");
			int menu = sc.nextInt();
			sc.nextLine();
			
			//사원 꽉찼을때 비활성화 문구 출력 
			switch(menu) {
				case 1 : //사원수 10명으로 가득찼는데 1번 메뉴를 선택한 경우 조건처리 
					if(eCount!=10) {
						insertEmployee(); 
					}else {
						System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
					}
				break;
				case 2 : printEmployee(); break;	
				case 9 : System.out.println("메인으로 돌아갑니다."); return;
				default : System.out.println("잘못 입력하셨습니다.다시 입력해주세요."); 
			}
		}
		
		
	}
//	+ insertStudent() : void
	public void insertStudent() {
//		학생 이름 :
//		학생 나이 :
//		학생 키 :
//		학생 몸무게 : 
//		학생 학년 : 
//		학생 전공 :
		while(true) {
			System.out.println("학생 이름 : ");
			String name = sc.nextLine();
			System.out.println("학생 나이 : ");
			int age = sc.nextInt();
			System.out.println("학생 키 : ");
			double height= sc.nextDouble();
			System.out.println("학생 몸무게 : ");
			double weight = sc.nextDouble();
			System.out.println("학생 학년 : ");
			int grade = sc.nextInt();
			sc.nextLine();
			System.out.println("학생 전공 : ");
			String major = sc.nextLine();
			
			//학생추가
			pc.insertStudent(name,age,height,weight,grade,major);
			
			//위에서 학생이 추가된 이후 학생수 조회해오기 
			int sCount = pc.personCount()[0];//담겨있는 학생 수
			
			if(sCount != 3) {
				System.out.println("그만 하시려면 N(또는 n),이어하시려면 아무 키나 누르세요 : ");
				String answer = sc.nextLine().toUpperCase();
				
				if(answer.equals("N")) {//n입력받으면
					return;
				}
				
			}else {//3명으로 가득찬 경우 
				System.out.println("학생을 담을 수 있는 공간이 꽉 찼기 때문에 학생 추가를 종료하고 학생 메뉴로 돌아갑니다.");
				return;
			}
		}
	}
//	+ printStudent() : void
	public void printStudent() {
		// pc의 printStudent() 메소드의 반환 값을 이용하여 학생 객체 배열에 저장된
		// 모든 데이터 출력
		Student[] s = pc.printStudent();
		
		for(int i=0; i<s.length; i++) {
			if(s[i]!=null) {//null이 아닌경우만 
				System.out.println(s[i]);
			}else {
				break;//순차적으로 추가되었다는 가정 
			}
		}
		
	}
//	+ insertEmployee() : void
	public void insertEmployee() {
//		사원 이름 :
//		사원 나이 :
//		사원 키 :
//		사원 몸무게 : 
//		사원 급여 : 
//		사원 부서 :
		while(true) {
			System.out.println("사원 이름 : ");
			String name = sc.nextLine();
			System.out.println("사원 나이 : ");
			int age = sc.nextInt();
			System.out.println("사원 키 : ");
			double height= sc.nextDouble();
			System.out.println("사원 몸무게 : ");
			double weight = sc.nextDouble();
			System.out.println("사원 급여 : ");
			int salary = sc.nextInt();
			sc.nextLine();
			System.out.println("사원 부서 : ");
			String dept = sc.nextLine();
			
			//사원추가
			pc.insertEmployee(name,age,height,weight,salary,dept);
			
			//위에서 사원이 추가된 이후 사원수 조회해오기 
			int eCount = pc.personCount()[1];//담겨있는 사원 수
			
			if(eCount != 10) {
				System.out.println("그만 하시려면 N(또는 n),이어하시려면 아무 키나 누르세요 : ");
				String answer = sc.nextLine().toUpperCase();
				
				if(answer.equals("N")) {//n입력받으면
					return;
				}
				
			}else {//10명으로 가득찬 경우 
				System.out.println("사원을 담을 수 있는 공간이 꽉 찼기 때문에 사원 추가를 종료하고 사원 메뉴로 돌아갑니다.");
				return;
			}
		}
	}
//	+ printEmployee() : void
	public void printEmployee() {
		
		Employee[] e = pc.printEmployee();
		
		for(int i=0; i<e.length; i++) {
			if(e[i]!=null) {//null이 아닌경우만 
				System.out.println(e[i]);
			}else {
				break;//순차적으로 추가되었다는 가정 
			}
		}
		
	}
}
