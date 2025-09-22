package com.kh.chap04_constructor.run;

import com.kh.chap04_constructor.model.vo.User;

public class ConstructorRun {

	public static void main(String[] args) {
		
		//User 객체 생성해보기
		User user = new User();
		
		user.info();
		
		//User 객체 생성할 때 값을 미리 넣어놓고 생성하고자 한다면?
		// qwe123, pass01, 김유저 , 20 , 남 
		
		//정의한 매개변수 생성자를 이용하여 값을 넣어 생성해보자
		User user1 = new User("qwe123","pass01","김유저",20,'남');
		user1.info();
		
		//user2만들어서 다른 데이터값 넣고 출력해보기
		User user2 = new User("123","456","유저1",20,'남');
		user2.info();
		
		User user3 = new User("123","456","유저1");
		user3.info();
		
		

	}

}
