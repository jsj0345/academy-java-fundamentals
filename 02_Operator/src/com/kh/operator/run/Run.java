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
		//e.method1();
		
		F_Logical f = new F_Logical();
		//f.method1();
		//f.method2(); 
		//f.method3();
		//f.method4();
		//f.method5(); 
		
		G_Triple g = new G_Triple(); 
		//g.method1();
		//g.method2();
		//g.method3();
		
		H_Ex h = new H_Ex();
		h.method1();
		//h.method2();
		//h.method3();
		//h.method4();
		//h.method5();
		//h.method6();
		//h.method7();
		//h.method8();
		//h.method9();
		//h.method10(); 
		//h.method11();
	}

}
