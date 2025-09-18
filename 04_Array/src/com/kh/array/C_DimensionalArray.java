package com.kh.array;

public class C_DimensionalArray {
	
	public void method01() {
		/*
		 * 이차원 배열 선언
		 * [표현법]
		 * 1. 자료형[][] 배열명
		 * 2. 자료형 배열명[][]
		 * 3. 자료형[] 배열명[]
		 * 
		 * 이차원 배열 할당
		 * [표현법]
		 * new 배열명[행크기][열크기]
		 * 
		 * 이차원 배열 선언 및 할당 초기화
		 * [표현법]
		 * 자료형[][] 배열명 = {{}, {}, {}, ....};
		 * 
		 * */
		
		//선언 방법
		int[][] arr; //이 방법 사용
		int arr2[][];
		int[] arr3[];
		
		arr = new int[3][5]; // 3칸짜리 배열에 각 5칸짜리 배열을 넣겠다.
		//할당시 이차원 배열 객체가 heap영역에 생성된다.
		//이때 각 인덱스에는 어떠한 값이 담겨졌는지 확인해보자.
		System.out.println(arr); // 배열명(참조변수) [[I@4926097b
		
		System.out.println(arr[0]); // 1행에 관한 참조값 { {}, {}, {} } {}에 대한 참조값. 
		System.out.println(arr[0][0]); // 1행을 접근 한다음에 그중에 0번째 요소에 접근 
		
		//길이를 알아보자.
		System.out.println(arr.length); //3 - 행의 길이
		System.out.println(arr[0].length);//5 - 열의 길이
		System.out.println(arr[1].length);//5 - 열의 길이
		System.out.println(arr[1].length);//5 - 열의 길이
		
		//반복문 이용하여 이차원배열 접근해보기
		//일차원 배열의 경우 반복문이 하나만 필요하지만
		//이차원 배열의 경우 행과 열을 각각 접근해줄 반복문 2개가 필요하다. (중첩)
		
		//행을 반복 접근해줄 반복문 작성
		for(int i = 0; i < arr.length; i++) {
			//열을 반복 접근해줄 반복문 작성
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public void method02() {
		//반복문을 이용하여 이차원 배열에 순서대로 1~15의 값을 넣고
		//위에서 출력한 형식과 유사하게 출력해보세요 
		
		int[][] intArr = new int[3][5];
		
		int num = 1; 
		
		for(int i = 0; i < intArr.length; i++) {
			for(int j = 0; j < intArr[i].length; j++) {
				intArr[i][j] = num;
				num++; 
				System.out.print(intArr[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public void method03() {
		//이차원 배열에 넣을 값을 미리 알고있다면
		//선언 및 초기화 구문으로 작성 가능하다.
		//일차원 배열에서 예시
		int[] arr = {1,2,3,4,5};
		//이차원 배열에서 예시 3행 5열
		int[][] arr2 = { {1,2,3,4,5} , {6,7,8,9,10}, {11,12,13,14,15} };
		
		System.out.println(arr2.length); //3
		System.out.println(arr2[0].length);//5
		System.out.println(arr2[1].length);//5
		System.out.println(arr2[2].length);//5
		
		for(int i = 0; i < arr2.length; i++) {
			for(int j=0; j < arr2[i].length; j++) {
				System.out.print(arr2[i][j] + " ");
			}
			System.out.println();
		}
		
	}
	
	public void method04() {
		//각 반의 점수 합계와 평균을 구해보자.
		int[][] score = { 
				{50,20,60,76},
				{44,99,55,89,100},
				{30,20,90,96,98,72}                 
		};
		
		//반복문을 이용하여 각반의 점수 합계를 구하고 합계를 이용하여 평균을 구해 출력해보시오.
		//출력형식
		// 1반 점수 합계 : OOO
		// 1반 점수 평균 : OOO
		
		for(int i = 0; i < score.length; i++) {
			int sum = 0; // 각 반의 점수 합계 변수
			int k = 0;  // 각 반의 학생 수 
			for(int j = 0; j < score[i].length; j++) {
				sum += score[i][j];
				k++; 
			}
			
			System.out.println((i + 1) + "반 점수 합계 : " + sum);
			System.out.println((i + 1) + "반 점수 평균 : " + (double) sum / k);
		}
		
	}
	
	//가변 배열 
	public void method05() {
		/*
		 * 가변 배열은 행의 크기를 정해놓고 각 행별 열의 크기는 정해놓지 않은 채로
		 * 생성 후 각 행에 열 크기를 별도의 크기로 지정할 수 있는 배열 형태
		 * 이차원 배열은 일차원 배열의 묶음이기 때문에 일차원 배열들의 크기가 전부 같을 필요는 없다.
		 * 단, 행의 크기는 정해져있어야한다. 열의 크기는 생략 가능
		 * 
		 * [표현법]
		 * int[][] arr = new int[행크기][];
		 * ex) int[][] arr = new int[3][];
		 */
		int[][] arr = new int[3][];
		
		System.out.println(arr); // [[I@...
		//null : 참조자료형의 기본값 - 아무것도 참조하고 있지 않은 상태를 의미하는 값.
		System.out.println(arr[0]); // null
		System.out.println(arr[1]); // null
		System.out.println(arr[2]); // null 
		// NullPointerException - null인 상태를 참조하려고 했을때 나는 오류
		// null은 참조할 수 없음.
		// System.out.println(arr[0][0]);
		
		// 각 인덱스에 원하는 크기만큼 배열 할당해주기
		arr[0] = new int[7];
		arr[1] = new int[3];
		arr[2] = new int[5];
		
		//각 행에 대한 열 배열이 잘 만들어졌는지 확인해보기
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j<arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

}
