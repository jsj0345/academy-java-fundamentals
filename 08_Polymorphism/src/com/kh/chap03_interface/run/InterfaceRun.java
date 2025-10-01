package com.kh.chap03_interface.run;

import com.kh.chap03_interface.model.vo.Animal;
import com.kh.chap03_interface.model.vo.Cat;
import com.kh.chap03_interface.model.vo.Dog;
import com.kh.chap03_interface.model.vo.Eagle;
import com.kh.chap03_interface.model.vo.Fish;
import com.kh.chap03_interface.model.vo.Sea;

public class InterfaceRun {

	public static void main(String[] args) {
		// Animal animal = new Animal(); 
		// 인터페이스는 객체 생성 불가(미완성)
		
		Animal cat = new Cat();
		Animal dog = new Dog(); 
		
		cat.speak();
		cat.eat();
		cat.run();
		cat.test();
		
		dog.speak();
		dog.eat();
		dog.run();
		dog.test();
		
		Animal eagle = new Eagle();
		eagle.speak();
		eagle.eat();
		eagle.run();
		//eagle.lungBreath();
		Eagle eagle1 = (Eagle) eagle;
		eagle1.lungBreath();
		
		//해양 생물 지정해서 클랫 작성 
		//animal과 sea를 상속 및 구현 받고 
		//각각 animal,sea에서 접근 가능한 메소드들을 호출
		//최종 클래스에서 접근 가능한 메소드들 호출
		//다중 구현
		
		System.out.println("==========================");
		
		Sea fish = new Fish();
		fish.gill();
		
		
		Fish fish2 = (Fish) fish;
		
		fish2.eat();
		fish2.gill();
		fish2.run();
		fish2.speak();
		
		
		
	}

}
