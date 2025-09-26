package com.hw1.run;

import com.hw1.model.vo.Employee;

public class Run {

	public static void main(String[] args) {
		
		Employee[] emp = new Employee[3];
		emp[0] = new Employee();
		// int empNo, String empName, int age, char gender, String phone, String address
		emp[1] = new Employee(1, "홍길동", 19, 'M', "01022223333", "서울 잠실");
		/*
		 * int empNo, String empName, String dept, String job, int age, char gender, int salary,
			double bonusPoint, String phone, String address
		 */
		emp[2] = new Employee(2, "강말순", "교육부", "강사", 20, 'F', 1000000, 0.01, "01011112222"
				, "서울 마곡"); 
		
		
		for(int i = 0; i < emp.length; i++) {
			System.out.println("emp["+i+"]"+ " : " + emp[i].information());
		}
		
		System.out.println("=================================================================");
		
		
		
		/*
		emp[0] = new Employee(0,"김말똥","영업부","팀장",30,'M',3000000,0.2,"01055559999","전라도 광주");
		emp[1] = new Employee(1,"홍길동","기획부","부장",19,'M',4000000,0.3,"01022223333","서울 잠실");
		emp[1] = new Employee(1, "홍길동", 19, 'M', "01022223333", "서울 잠실");
		*/
		
		emp[0].setEmpNo(0);
		emp[0].setEmpName("김말똥");
		emp[0].setDept("영업부");
		emp[0].setJob("팀장");
		emp[0].setGender('M');
		emp[0].setSalary(3000000);
		emp[0].setBonusPoint(0.2);
		emp[0].setPhone("01055559999");
		emp[0].setAddress("전라도 광주");
		
		emp[1].setDept("기획부");
		emp[1].setJob("부장");
		emp[1].setSalary(4000000);
		emp[1].setBonusPoint(0.3);
		emp[1].setPhone("01022223333");
		emp[1].setAddress("서울 잠실");
		
		for(int i = 0; i < emp.length-1; i++) {
			System.out.println("emp["+i+"]"+ " : " + emp[i].information());
		}
		
		System.out.println("=================================================================");
		
		int sum = 0; 
		
		for(int i = 0; i < emp.length; i++) {
			int bonus = (int)(emp[i].getSalary() + (emp[i].getSalary()) * (emp[i].getBonusPoint())) * 12;	
			System.out.println(emp[i].getEmpName() + "의 연봉 : " + bonus + "원");
			sum += bonus;
		}
		
		System.out.println("=================================================================");
		
		System.out.println("직원들의 연봉의 평균 : " + sum / 3 +"원");
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
