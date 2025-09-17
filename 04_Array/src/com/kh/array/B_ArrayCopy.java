package com.kh.array;

import java.util.Arrays;
import java.util.Scanner;

public class B_ArrayCopy {
	
		/*
		 * 배열의 복사
		 * 
		 * 1) 얕은 복사 - 주소값 복사
		 * 2) 깊은 복사 - 실제 데이터 복사
		 * 
		 * 깊은 복사 방법
		 * 1. 반복문을 이용하여 데이터 옮겨 담기
		 * 2. System.arraycopy() 메소드
		 * -몇번 인덱스부터 몇개를 몇번 인덱스 위치에 복사할것인지 지정 가능(인덱스 범위 주의하여 사용)
		 * 3. Arrays.copyOf() 메소드
		 * -원본배열의 0번 인덱스로부터 시작하여 복사가 진행되고 제시한 개수만큼 복사를 수행
		 * -제시한 개수가 원본배열의 크기보다 크다면 복사되고 나머지 자리는 기본값으로 초기화 되어 생성
		 * 4.배열.clone() 메소드
		 * -원본 배열과 동일하게 복사하는 메소드(크기,인덱스 지정 불가)
		 * 
		 */
		
		//배열의 선언 및 할당과 동시에 초기화(값 넣은채로 배열 생성)
		public void method01() {
			int[] arr = new int[5]; // 선언 및 할당
			// 초기화까지
			
			int[] arr2 = new int[] {1,2,3,4,5};
			for(int a : arr2) {
				System.out.println(a);
			}	
			
			int[] arr3 = {10,20,30};
			for(int a : arr3) {
				System.out.println(a);
			}
			
			String[] sArr = {"안녕","하세요","반갑","습니다","!"};
			for(String s : sArr) {
				System.out.println(s);
			}
			
			System.out.println("sArr 의 크기 : " + sArr.length);
			
			//문자열 배열에 좋아하는 과일 5개를 초기화하여 생성하고
			//사용자에게 과일 하나를 입력받아 해당 과일이 몇번째 인덱스에 있는지
			//OOO 과일은 O번 인덱스에 있습니다. 라는 출력문을 출력해보세요.
			
			Scanner sc = new Scanner(System.in);
			
			String[] fruits = {"사과","포도","수박","망고","애플망고"};
			
			System.out.println("사과,포도,수박,망고,애플망고 중 하나를 입력하시오 : ");
			String fruit_name = sc.next();
			
			for(int i = 0; i < fruits.length; i++) {
				if(fruit_name.equals(fruits[i])) {
					System.out.println(fruit_name + " 과일은 " + i+"번 " + "인덱스에 있습니다.");
				}
			}
		}
		
		public void method02() {
			//원본배열
			int[] arr = {1,2,3,4,5};
			
			System.out.println("=====원본 배열 출력=====");
			//원본 배열 출력
			for(int i = 0; i < arr.length; i++) {
				System.out.println(arr[i]);
			}
			
			//복사본 배열
			int[] copy = arr; // arr참조변수에 담긴 배열의 주소값을 arr2 참조변수에 대입.
			
			System.out.println("=====복사본 배열 출력=====");
			for(int i = 0; i <copy.length; i++) {
				System.out.println(copy[i]);
			}
			
			//복사본 배열로 원본배열을 복사했으니
			//원본배열 수정하여 확인해보기
			arr[2] = 100; // 원본 배열의 2번 인덱스에 100 대입
			
			//변경되었는지 확인해보기
			System.out.println("변경 후 원본 배열 출력");
			for(int i = 0; i <arr.length; i++) {
				System.out.println(arr[i]);
			}
			
			for(int i = 0; i < copy.length; i++) {
				System.out.println(copy[i]);
			}
			
			//원본배열의 참조변수와 복사본배열의 참조변수 모두 같은 값을 가졌는지 확인하기
			System.out.println("원본 arr의 주소값 : " + arr);
			System.out.println("복사본 copy의 주소값 : " + copy);	
		}
		
		//깊은 복사
		public void method03() {
			//for문을 이용하여 깊은 복사를 해보자.
			
			//원본배열
			int[] origin = {10,20,30,40,50};
			
			//새로운 배열을 생성하여 원본 배열에 담겨있는 각 데이터들을 복사해보기
			
			//복사본 배열
			int[] copy = new int[origin.length];
			
			//주소값 확인
			System.out.println("원본 배열 : " + origin);
			System.out.println("복사 배열 : " + copy);
			
			//원본 배열에 각 인덱스에 담긴 값을 복사본 배열의 각 인덱스에 담아주기
			copy[0] = origin[0];
			copy[1] = origin[1];
			copy[2] = origin[2];
			copy[3] = origin[3];
			copy[4] = origin[4];
			
			//원본 배열 출력 
			System.out.println("원본배열 출력");
			for(int i = 0; i <origin.length; i++) {
				System.out.println(origin[i]);
			}
			
			//복사본 배열 출력
			System.out.println("복사본 배열 출력");
			for(int i = 0; i < copy.length; i++) {
				System.out.println(copy[i]);
			}
			
			//원본 배열의 2번 인덱스에 담긴 값을 99로 변경해보기
			origin[2] = 99;
			
			//원본 배열 출력 
			System.out.println("원본배열 출력");
			for(int i = 0; i <origin.length; i++) {
				System.out.println(origin[i]);
			}
			
			//복사본 배열 출력
			System.out.println("복사본 배열 출력");
			for(int i = 0; i < copy.length; i++) {
				System.out.println(copy[i]);
			}
			
		}
		
		public void method04() {
			String[] sArr = {"딸기", "참외", "메론", "귤", "낑깡"};
			//복사본 배열을 만들어 위 원본배열의 데이터를 복사한 뒤
			//원본 배열의 3번 인덱스 값을 감귤로 변경한 후 
			//원본 배열과 복사본 배열 모두 출력해보기
			
			String[] copy_sArr = new String[sArr.length];
			for(int i = 0; i < copy_sArr.length; i++) {
				copy_sArr[i] = sArr[i]; 
				
				if(i == 3) {
					sArr[i] = "감귤"; 
				}
			}
			
			System.out.println("원본 배열 출력 -> 감귤로 바꿈");
			for(int i = 0; i < sArr.length; i++) {
				System.out.println(sArr[i]);
			}
			
			System.out.println("복사 배열 출력");
			for(int i = 0; i < copy_sArr.length; i++) {
				System.out.println(copy_sArr[i]);
			}
			
		}
		
		//자바에서 제공하는 배열 복사 메소드 이용해보기
		//1.System arraycopy(원본배열, 원본배열에서 시작 인덱스, 복사본 배열, 복사본 배열 시작 인덱스, 복사개수);
		public void method05() {
			//원본배열
			String[] origin = {"치킨","피자","햄버거","국밥","국수"};
			//복사본 배열
			String[] copy = new String[origin.length];
			
			System.out.println(copy);
			
			System.arraycopy(origin, 0, copy, 0, 5);
			
			//배열 출력해보기
			for(int i = 0; i<origin.length; i++) {
				System.out.println(origin[i]);
			}
			
			System.out.println();
			
			for(int i = 0; i <copy.length; i++) {
				System.out.println(copy[i]);
			}
			
			System.out.println(copy);
			
			// copy의 참조값은 똑같음. (copy의 참조값은 변화가 없음) 
			
		}
		
		//위 메소드를 이용하는 방법
		public void method05_2() {
			char[] origin = {'문','자','배','열','만'};
			
			char[] copy = new char[10];
			
			System.arraycopy(origin, 0, copy, 0, 5); // 맨마지막은 복사 하고 싶은 개수임. 
			// 근데 만약에 System.arraycopy(origin,2,copy,0,5); 라고 작성하면 2번 인덱스부터 복사하는데 3개만있음
			// 불가능함. 
			
			/*
			 * System.arraycopy(원본 배열, 원본 배열의 시작 인덱스, 복사본 배열, 복사본 배열의 시작인덱스, 복사하고싶은 개수);
			 */
			
			
			for(int i = 0; i <copy.length; i++) {
				System.out.println(copy[i]);
			}
			
			//문자배열(char[])을 출력문에 작성하면 주소값이 아닌 문자를 출력한다.
			System.out.println(origin); //문자배열만 (PrintStream?) 
			System.out.println(copy); //배열만
			
			//주소값을 hash화 한 출력값 (특정 식별용정수화)
			System.out.println(origin.hashCode());
			System.out.println(copy.hashCode());
			
			System.out.println(System.identityHashCode(origin));
			System.out.println(System.identityHashCode(copy));
		}
		
		//2. Arrays.copyOf(원본배열, 복사본 배열 크기) 
		public void method06() {
			int[] origin = {1,2,3,4,5};
			
			//Arrays.copyOf() 메소드는 복사본배열을 반환하기 때문에
			//해당 주소값을 담아주는 작업이 필요하다. 
			//원본배열과 생성할 복사본 배열의 크기를 지정한다.
			
			int[] copy = Arrays.copyOf(origin, 5);
			System.out.println(copy);
			
			//복사본 배열 출력
			for(int i = 0; i < copy.length; i++) {
				System.out.println(copy[i]);
			}
			
			copy = Arrays.copyOf(origin, 10);
			System.out.println(copy);
			
			//복사본 배열 출력
			//Arrays.toString(배열) : 해당 배열에 담긴값을 나열하여 반환해준다.
			System.out.println(Arrays.toString(copy));
			
		}
		
		//3.배열.clone(); 
		public void method07() {
			int[] origin = {1,2,3,4,5};
			int[] copy = origin.clone(); //설정없이 원본배열과 동일하게 복사된다.
			
			//출력문으로 확인하기
			System.out.println(Arrays.toString(origin));
			System.out.println(Arrays.toString(copy));
			
			//주소값을 확인하여 다른 객체인지 확인하기
			System.out.println("원본 주소값 : " + origin); 
			System.out.println("복사본 주소값 : " + copy);
		}
		
		
} 


