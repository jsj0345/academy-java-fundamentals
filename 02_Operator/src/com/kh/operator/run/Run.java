package com.kh.operator.run;

import com.kh.operator.A_Arithmetic; 
import com.kh.operator.B_InDecrease; 
import com.kh.operator.*;

public class Run {
	
	public static void main(String[] args) {
		A_Arithmetic a = new A_Arithmetic(); 
		//a.method1(); 
		B_InDecrease b = new B_InDecrease(); 
		//b.method1(); 
		//b.method2();
		//b.method5();
		
		C_Compound c = new C_Compound();
		//c.method1(); 
		
		D_LogicalN d = new D_LogicalN();
		//d.method1(); 
		
		E_Comparison e = new E_Comparison();
		e.method1();
	}

}
