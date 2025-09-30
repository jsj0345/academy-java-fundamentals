package practice3.controller;

import practice3.model.vo.Animal;
import practice3.model.vo.Cat;
import practice3.model.vo.Dog;

public class AnimalManager {

	public static void main(String[] args) {
	   Animal[] animal = new Animal[5];
	   
	   animal[0] = new Dog("개1","푸들",40);
	   animal[1] = new Cat("고양이1","종류1","고양이굴1","빨간색");
	   animal[2] = new Dog("개2","푸들2",50);
	   animal[3] = new Cat("고양이2","종류2","고양이굴2","노란색");
	   animal[4] = new Cat("고양이3","종류3","고양이굴3","무지개색");
	   
	   for(int i = 0; i < animal.length; i++) {
		   animal[i].speak();
	   }
	   
	   

	}

}
