// Hierarchial Inheritance

import java.util.*;

class Input{
	int a,b,c,d;
	Scanner sc = new Scanner(System.in);
	void get(){
		a = sc.nextInt();
		b = sc.nextInt();
	}
}

class Add extends Input{
	void add(){
		get();
		c = a+b;
		System.out.println("Sum = " + c);
	}
}

class Sub extends Input{
	void sub(){
		get();
		d = a-b;
		System.out.println("difference = " + d);
	}
}

class Result{
	public static void main(String args[]){
		//Input obj = new Input();
		Add obj1 = new Add();
		obj1.add();
		Sub obj2 = new Sub();
		obj2.sub();
	}
}

