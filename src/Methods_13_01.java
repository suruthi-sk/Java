//Methods invoking Homework 13.1.24

import java.util.Scanner;

class Methods{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		Methods obj = new Methods();
		obj.add(a,b);
		obj.sub(a,b);
		obj.prod(a,b);
		obj.div(a,b);
	}
	
	void add(int a, int b){
		System.out.println("Sum of "+a+" and "+b+" is "+(a+b));
	}
	
	void sub(int a, int b){
		System.out.println("Difference of "+a+" and "+b+" is "+(a-b));
	}
	
	void prod(int a, int b){
		System.out.println("Product of "+a+" and "+b+" is "+(a*b));
	}
	
	void div(int a, int b){
		System.out.println("Division of "+a+" and "+b+" is "+(a/b));
	}
}
		

