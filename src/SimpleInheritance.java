//Single inheritance Example

import java.util.Scanner;

class A{
	int a,b,c;
	Scanner sc = new Scanner(System.in);
	void get(){
		a = sc.nextInt();
		b = sc.nextInt();
	}
}

class B extends A{
	void add(){
		get();
		c = a+b;
		System.out.println("Sum = "+ c);
	}
}

class C extends B{
		public static void main(String args[]){
			B obj = new B();
			obj.add();
	}
}
	