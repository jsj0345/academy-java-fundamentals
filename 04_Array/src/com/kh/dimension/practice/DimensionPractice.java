package com.kh.dimension.practice;

import java.util.Scanner;

public class DimensionPractice {
	
	public void practice1() {
		int[][] intArr = new int[3][3];
		
		for(int i = 0; i < intArr.length; i++) {
			for(int j = 0; j < intArr[i].length; j++) {
				System.out.print("(" + i + ", " + j + ")" );
			}
			System.out.println();
		}
	}
	
	public void practice2() {
		int[][] intArr = new int[4][4];
		
		int num = 1; 
		
		for(int i = 0; i < intArr.length; i++) {
			for(int j = 0; j <intArr[i].length; j++) {
				intArr[i][j] = num;
				num++;
				System.out.print(intArr[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public void practice3() {
        int[][] intArr = new int[4][4];
		
		int num = 16; 
		
		for(int i = 0; i < intArr.length; i++) {
			for(int j = 0; j <intArr[i].length; j++) {
				intArr[i][j] = num;
				num--;
				System.out.print(intArr[i][j] + " ");
			}
			System.out.println();
		}	
	}
	
	public void practice4() {
	    int[][] intArr = new int[4][4];

	    
	    for (int i = 0; i < intArr.length - 1; i++) {
	        int rowSum = 0;
	        for (int j = 0; j < intArr[i].length - 1; j++) {
	            intArr[i][j] = (int)(Math.random() * 10) + 1;
	            rowSum += intArr[i][j];
	        }
	        intArr[i][intArr[i].length - 1] = rowSum; 
	    }

	    
	    for (int j = 0; j < intArr[0].length; j++) {
	        int colSum = 0;
	        for (int i = 0; i < intArr.length - 1; i++) {
	            colSum += intArr[i][j];
	        }
	        intArr[intArr.length - 1][j] = colSum; 
	    }

	    
	    for (int i = 0; i < intArr.length; i++) {
	        for (int j = 0; j < intArr[i].length; j++) {
	            System.out.print(intArr[i][j] + " ");
	        }
	        System.out.println();
	    }
	}
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("행 크기 : ");
			int row = sc.nextInt();

			System.out.print("열 크기 : ");
			int column = sc.nextInt();
			
			if (row > 0 && column > 0) {
				if (!(row >= 1 && row <= 10) || !(column >= 1 && column <= 10)) {
					System.out.println("반드시 1~10 사이의 정수를 입력해야 합니다.");
					continue; 
				}
			} else {
				System.out.println("반드시 1~10 사이의 정수를 입력해야 합니다.");
				continue; 
			}
			
			char[][] charArr = new char[row][column]; 
			
			for(int i = 0; i < charArr.length; i++) {
				for(int j = 0; j < charArr[i].length; j++) {
					char c =(char)((int)(Math.random() * 26) + 65);
					charArr[i][j] = c;
					System.out.print(c + " ");
				}
				System.out.println();
			}

		}
	}
	
	public void practice6() {
		String[][] strArr = new String[][] {{"이", "까", "왔", "앞", "힘"}, {"차", "지", "습", "으", "냅"}, {"원",
			"열", "니", "로", "시"}, {"배", "심", "다", "좀", "다"}, {"열", "히", "! ", "더", "!! "}};
			
			String mid = ""; 
			
			for(int i = 0; i < strArr.length; i++) {
				for(int j = 0; j < strArr[i].length; j++) {
					if(i != j && i <= j) {
						mid = strArr[i][j];
						strArr[i][j] = strArr[j][i];
						strArr[j][i] = mid; 
					}
				}
			}
			
			for(int i = 0; i < strArr.length; i++) {
				for(int j = 0; j < strArr[i].length; j++) {
					System.out.print(strArr[i][j]);
				}
			}
	}
	
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		
		int number = 97; // a 아스키 코드 
		
		System.out.print("행의 크기 : ");
		int row = sc.nextInt();
		
		System.out.print("0행의 크기 : ");
		int zero_size = sc.nextInt(); 
		
		System.out.print("1행의 크기 : ");
		int one_size = sc.nextInt();
		
		System.out.print("2행의 크기 : ");
		int two_size = sc.nextInt();
		
		System.out.print("3행의 크기 : ");
		int three_size = sc.nextInt();
		
		char[][] char_Array = new char[row][]; 
		
		for(int i = 0; i < char_Array.length; i++) {
			switch(i) {
			 case 0 : 
				 char_Array[i] = new char[zero_size];
				 break;
			 case 1 :
				 char_Array[i] = new char[one_size];
				 break;
			 case 2 :
				 char_Array[i] = new char[two_size];
				 break;
			 case 3 :
				 char_Array[i] = new char[three_size];
				 break; 
			}
			
			for(int j = 0; j < char_Array[i].length; j++) {
				char_Array[i][j] = (char) number;
				number++;
				System.out.print(char_Array[i][j] + " ");
			}
			System.out.println();
			
		}
		
		
	}
	
	public void practice8() {
		String[] attandance = {"강건강", "남나나", "도대담", "류라라",
				"문미미", "박보배", "송성실", "윤예의","진재주"
				,"차천축","피풍표","홍하하"};
		
		String[][] attandance1 = new String[3][2];
		String[][] attandance2 = new String[3][2];
		
		int num = 0; 
		
		System.out.println("== 1분단 ==");
		
		for(int i = 0; i < attandance1.length; i++) {
			for(int j = 0; j < attandance1[i].length; j++) {
				attandance1[i][j] = attandance[num++]; 
				System.out.print(attandance1[i][j] + " ");
			}
			System.out.println();
		}
		
        System.out.println("== 2분단 ==");
		
		for(int i = 0; i < attandance2.length; i++) {
			for(int j = 0; j < attandance2[i].length; j++) {
				attandance2[i][j] = attandance[num++]; 
				System.out.print(attandance2[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public void practice9() {
		String[] attandance = {"강건강", "남나나", "도대담", "류라라",
				"문미미", "박보배", "송성실", "윤예의","진재주"
				,"차천축","피풍표","홍하하"};
		
		String[][] attandance1 = new String[3][2];
		String[][] attandance2 = new String[3][2];
		
		int num = 0; 
		
		System.out.println("== 1분단 ==");
		
		for(int i = 0; i < attandance1.length; i++) {
			for(int j = 0; j < attandance1[i].length; j++) {
				attandance1[i][j] = attandance[num++]; 
				System.out.print(attandance1[i][j] + " ");
			}
			System.out.println();
		}
		
        System.out.println("== 2분단 ==");
		
		for(int i = 0; i < attandance2.length; i++) {
			for(int j = 0; j < attandance2[i].length; j++) {
				attandance2[i][j] = attandance[num++]; 
				System.out.print(attandance2[i][j] + " ");
			}
			System.out.println();
		}
		
		Scanner sc = new Scanner(System.in);
	    
		System.out.print("검색할 학생 이름을 입력하세요 : ");
		String student_name = sc.nextLine(); 
		
		for(int i = 0; i < attandance1.length; i++) {
			for(int j = 0; j < attandance1[i].length; j++) {
				if(student_name.equals(attandance1[i][j]) && j == 0) {
					System.out.println("검색하신 " + student_name + " 학생은 "
							+ "1분단 " + (i+1) + "번째 줄 " + "왼쪽에 있습니다.");
				} else if(student_name.equals(attandance1[i][j]) && j == 1) {
					System.out.println("검색하신 " + student_name + " 학생은 "
							+ "1분단 " + (i+1) + "번째 줄 " + "오른쪽에 있습니다.");
				}
			}
		}
		
		for(int i = 0; i < attandance2.length; i++) {
			for(int j = 0; j < attandance2[i].length; j++) {
				if(student_name.equals(attandance2[i][j]) && j == 0) {
					System.out.println("검색하신 " + student_name + " 학생은 "
							+ "2분단 " + (i+1) + "번째 줄 " + "왼쪽에 있습니다.");
				} else if(student_name.equals(attandance2[i][j]) && j == 1) {
					System.out.println("검색하신 " + student_name + " 학생은 "
							+ "2분단 " + (i+1) + "번째 줄 " + "오른쪽에 있습니다.");
				}
			}
		}
		
		
	}
	
	
	

}
