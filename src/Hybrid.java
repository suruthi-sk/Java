//Hybrid Inheritance

import java.util.*;

class A{
	void m1(){
		System.out.println("A Class");
	}
}

class B extends A{
	void m2(){
		System.out.println("B class");
	}
}

class C extends A{
	void m3(){
		System.out.println("C class");
	}
}

class D extends C{
	void m4(){
		System.out.println("D Class");
	}
}

class Hybrid{
	public static void main(String args[]){
		D obj = new D();
		B obj1 = new B();
		obj.m1();
		obj1.m2();
		obj.m3();
		obj.m4();
	}
}
	