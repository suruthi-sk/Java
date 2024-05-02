//Method Overriding

import java.util.*;

class A{
	void show(){
		System.out.println("Class A is running!!");
	}
}

class B extends A{
	
	void show(){
		// super.show();
		System.out.println("Class B is running!!");
		super.show();
	}
}

class Overriding{
	public static void main(String args[]){
		//Scanner sc = new Scanner(System.in);
		B obj = new B();
		obj.show();
		
	}
}
		