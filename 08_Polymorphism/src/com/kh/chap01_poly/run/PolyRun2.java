package com.kh.chap01_poly.run;

import com.kh.chap01_poly.model.vo.Animal;
import com.kh.chap01_poly.model.vo.Bird;
import com.kh.chap01_poly.model.vo.Cat;
import com.kh.chap01_poly.model.vo.Dog;

public class PolyRun2 {

	public static void main(String[] args) {
		
		
		//동물 클래스를 정의하여 동물이라면 있을만한 기능 3가지 메소드 정의
		//강아지,고양이,새 클래스를 각각 정의하여 동물 클래스를 상속받고 
		//각 클래스마다 고유기능 1개씩 추가 정의한 뒤 
		//부모클래스 참조변수로 자식클래스 고유 기능을 각각 출력해보세요
		
		Animal dog = new Dog();
		Animal cat = new Cat();
		Animal bird = new Bird();
		
		//다운 캐스팅 하기 
		((Dog)dog).play(); //형변환 먼저 처리
		((Cat)cat).cute(); 
		((Bird)bird).fly();
		
		System.out.println("====================");
		dog.speak();
		cat.speak();
		bird.speak();
		
		//다형성을 적용한 객체배열 생성해보기 
		Animal[] arr = new Animal[5];
		
		arr[0] = new Dog();
		arr[1] = new Bird();
		arr[2] = new Dog();
		arr[3] = new Cat();
		arr[4] = new Bird();
		System.out.println("====================");
		//부모클래스 자료형으로 객체배열을 생성했기 때문에
		//참조변수또한 부모클래스 자료형이다. 때문에 접근 가능한 범위도
		//부모클래스에 정의되어있는 메소드.
		for(int i=0; i<arr.length; i++) {
			arr[i].speak();
			
			//instanceof 연산자를 이용하여 각 자료형 판별하기 
			if(arr[i] instanceof Bird) {//arr[i]번째 위치한 타입이 Bird타입인가요? 
				((Bird)arr[i]).fly();
			}else if(arr[i] instanceof Dog) {//arr[i]번째 위치한 타입이 Dog?
				((Dog)arr[i]).play();
			}else {//arr[i]번째 위치한 타입이 Bird도 아니고 Dog도 아니면? Cat
				((Cat)arr[i]).cute();
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
