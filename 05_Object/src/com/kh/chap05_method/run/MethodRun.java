package com.kh.chap05_method.run;

import com.kh.chap04_constructor.model.vo.User;
import com.kh.chap05_method.controller.MethodTest;

public class MethodRun {

	public static void main(String[] args) {
		MethodTest m = new MethodTest();
		m.method01();
		
		int ranNum = m.method02();
		System.out.println("랜덤값 : " + ranNum);
		
		m.method03(ranNum, ranNum);
		
		int result = m.method04(ranNum, ranNum);
		System.out.println("결과값 : " + result);
		
        String str = m.method05('밥', 5);
        System.out.println(str);
        
        //method06에서 반환하는 User객체 주소값 받아서 확인해보기
        System.out.println(m.method06());
        User user = m.method06();
        user.info();
        
        int[] arr = {1,2,3,4,5}; 
        User u = new User("user01","pass01","김유저",20,'남');
        
        //만들어준 User와 arr 전달하기 
        m.method07(u,arr);
        
	}

}
