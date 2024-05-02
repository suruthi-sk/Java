// abstract class example

import java.util.*;

abstract class abs{
	abstract void add();
	abstract void sub();
	abstract void mul();
	abstract void div();
	
	int a,b;
	Scanner sc = new Scanner(System.in);
    void get(){
		a = sc.nextInt();
		b = sc.nextInt();
	}
}

class demo extends abs{
	int c;
	void add(){
	//get();
		c = a+b;
		System.out.println("Sum = "+c);
	}
	
	int d;
	void sub(){
	//get();
		d = a-b;
		System.out.println("Difference = "+d);
	}
	
	int e;
	void mul(){
		e = a*b;
		System.out.println("Product = "+e);		
	}
	
	int f;
	void div(){
		if(b==0){
			System.out.println("Division by 0 gives you infinity!!!");
		}
		else{
		f = a/b;
		System.out.println("Divide = "+f);	
		}
	}
}

class abstractExample{
	public static void main(String args[]){
		demo obj = new demo();
		obj.get();
		obj.add();
		obj.sub();
		obj.mul();
		obj.div();
	}
}	
		
		

