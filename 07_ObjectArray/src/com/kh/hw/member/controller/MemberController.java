package com.kh.hw.member.controller;

import java.util.Arrays;

import com.kh.hw.member.model.vo.Member;

public class MemberController {
	
	public final int SIZE = 10;
   
	private Member[] m = new Member[SIZE];
	
	
	
	public int existMemberNum() {
		
		int count = 0; 
		
		// System.out.println("최대 등록 가능한 회원 수는 " + SIZE + "명입니다.");
		
		for(int i = 0; i < m.length; i++) {
			if(m[i] == null) {
				count++; 
			} 
		}
		
		return 10 - count;		
	}
	
	public Boolean checkId(String inputId) {
		for(int i = 0; i < m.length; i++) {
			if(m[i] != null) { // 만약에 이 조건을 안걸어두고 바로 아이디 같은지 조회하다가 null 만나면 안되서 걸어둠.
				if(m[i].getId().equals(inputId)) {
					return true;
				}
			} 
		}
		
		return false; 
		
	}
	
	public void insertMember(String id, String name, String password, String email
			, char gender, int age) {
		for(int i = 0; i < m.length; i++) {
			if(m[i] == null) { // 인덱스에 null이 있으면 값 초기화하고 바로 탈출 
				m[i] = new Member(id,name,password,email,gender,age); 
				break; 
			}
		}
		
	}
	
	public String searchId(String id) {
		String str = ""; 
		for(int i = 0; i < m.length; i++) {
			if(m[i] != null ) {
				if(m[i].getId().equals(id)) {
					str = m[i].inform();
					break;
				}
				
			} else if(i==m.length -1) {
				str = "없음";
			}
		}
		
		return str; 		
	}
	
	public Member[] searchName(String name) {
		int count = 0; 
		
		Member[] member = new Member[SIZE]; //같은 이름이면 그 이름에 해당하는 객체 담기용 배열		
		
		for(int i = 0; i < m.length; i++) {
		  if(m[i] != null) {	
			if(m[i].getName().equals(name)) { // NPE(NullPointerException) 방지
				//member[count] = m[i];
				member[count]= m[i]; 
				count++; 
			} 
			
		  }
		  
		  if(i== m.length -1) { // 이름이 중복될수 있어서 끝까지 봐야함. 
			  return Arrays.copyOf(member, count); // 같은 이름이 여러개 일수도 있어서 같은 이름개수만큼 반환
		  }
		  
		  
		}
	
		return null;	
	}
	
	public Member[] searchEmail(String email) {
		Member[] member = new Member[SIZE];
		int count = 0;
		   for(int i = 0; i < m.length; i++) {
			   if(m[i] != null) {
					if(m[i].getEmail().equals(email)) {
						member[count] = m[i];
					    count++; 
					} 
			   }	
			   
			   if(i== m.length -1) { // 이름이 중복될수 있어서 끝까지 봐야함. 
				   if(count!=0) {
					  return Arrays.copyOf(member, count); // 같은 이름이 여러개 일수도 있어서 같은 이름개수만큼 반환
				   }
				}
		   }	
					
		return null;
	}
	
	public Boolean updatePassword(String id, String passWord) {
		
		for(int i = 0; i < m.length; i++) {
			if(m[i] != null) {
				if(m[i].getId().equals(id)) { // NPE 방지 
					m[i].setPassword(passWord);
					return true;
				}
			}
			
		}
		
		return false; 
		
		
	}
	
	public Boolean updateName(String id, String name) {

		for(int i = 0; i < m.length; i++) {
			if(m[i] != null) {
				if(m[i].getId().equals(id)) {
					m[i].setName(name);
					return true; 
				}
			}	
		}
		
		return false; 
	}
	
	public Boolean updateEmail(String id, String email) {
		
		for(int i = 0; i < m.length; i++) {
			if(m[i] != null) {
				if(m[i].getId().equals(id)) {
					m[i].setEmail(email);
					return true;
				}
			}
			
		}
		
		return false; 
		
	}
	
	public Boolean delete(String id) {
		int k = 0; 
		for(int i = 0; i < m.length; i++) {
		   if(m[i] != null) {
			   if(m[i].getId().equals(id)) {
					m[i] = null; 
					//return true;
					k = i; // null에 해당하는 인덱스 보관. 
					
					break; 
				}  
		   }
		}
		
		for(int i = k; i < m.length -1; i++) { // 삭제하면 데이터들을 옮겨줘야함. 
			m[i] = m[i + 1]; // m.length - 1을 안해주면 예외터짐.	 
			
			if(i == m.length -2) {
				return true; 
			}
		}
		
		return false;
	}
	
	public void delete() {
		for(int i = 0; i < m.length; i++) {
			m[i] = null; 
		}
		
	}
	
	public Member[] printAll() {
		return m;
	}

	
	
}
