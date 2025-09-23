package com.hw3.view;

import java.util.Scanner;

import com.hw3.model.vo.Employee;

public class EmpMenu {
	Scanner sc = new Scanner(System.in);
	
	public EmpMenu() {
		
	}
	
	public void mainMenu() {
		
		Employee emp = null; 
		
		System.out.println("===== 사원 정보 관리 프로그램 =====");
		
		while (true) {
			System.out.print("메뉴 번호 선택 : ");
			int number = sc.nextInt(); 
			
			switch (number) {
			case 1: {
				System.out.println("1. 새 사원 정보 입력");
				emp = inputEmployee();
				break;
			}

			case 2: {
				if(emp == null) { // 만약에 3번을 눌렀을 경우, null로 되기 때문에 NullPointerException이 터짐. 
					System.out.println("등록된 정보가 없습니다.");
					break;  // 예외를 방지하고자 함. 
				}
				
				System.out.println("2. 사원 정보 수정");
				modifyEmployee(emp);
				break;
			}

			case 3: {
				System.out.println("3. 사원 정보 삭제 ");
				emp = null;
				break;
			}

			case 4: {
				if(emp == null) {
					System.out.println("등록된 정보가 없습니다.");
					break; 
				}
				
				System.out.println("4. 사원 정보 출력 ");
				String str = emp.information();
				System.out.println(str);
				break;
			}

			case 9: {
				System.out.println("9. 프로그램 종료");
				return;
			}
		  }
		}	
			
		
		
	}
	
	public Employee inputEmployee() {
		Employee e = new Employee("사원100","백엔드개발","개발자",25,'남',400,0.3,"010-1234-5678","강남구 테헤란로 123길"); 
		return e; 
	}
	
	public void modifyEmployee(Employee emp) {
		 
		// int i = 0; 
		
		while(true) { // i <=4
			System.out.println("==== 사원 정보 수정 메뉴 ====");
			System.out.println("1. 이름 변경");
			System.out.println("2. 급여 변경");
			System.out.println("3. 부서 변경");
			System.out.println("4. 직급 변경");
			System.out.println("9. 이전 메뉴로");
			
			System.out.print("번호를 입력하시오(1,2,3,4,9) : ");
			int number = sc.nextInt(); 
			
			sc.nextLine(); 
			
			switch(number) {
			  case 1 : {
				  System.out.print("변경할 이름을 적으시오 : ");
				  String name = sc.nextLine();
				  emp.setEmpName(name);
				  break;
			  }
			  
			  case 2 : {
				  System.out.print("변경할 급여를 적으시오 : ");
				  int salary = sc.nextInt();
				  emp.setSalary(salary);
				  break;
			  }
			  
			  case 3 : {
				  System.out.print("변경할 부서를 적으시오 : ");
				  String dept = sc.nextLine();
				  emp.setDept(dept);
				  break;
			  }
			  
			  case 4 : {
				  System.out.print("변경할 직급을 적으시오 : ");
				  String job = sc.nextLine();
				  emp.setJob(job);
				  break;
			  }
			  
			  case 9 : {
				  System.out.println("이전 메뉴로");
				  
				  //break; 완전히 탈출이 안된다. 
				  return;
			  }
			  
			}
			
			//i++;
		}
		
	}
	

}
