//Multilevel Inheritance 

import java.util.Scanner;

class Input{
	int n,rev = 0;
	int original;
	Scanner sc = new Scanner(System.in);
	void get(){
		n = sc.nextInt();
		original = n;
	}
	
}

class Reverses extends Input{
	
	void reverse(){
		get();
		while(n!=0){
			int remainder = n%10;
			rev = rev*10+remainder;
			int divider = n/10;
			n = divider;
		}
		//System.out.print(original);
		System.out.println(rev);
	}
}

class Multilevel extends Reverses{
	public static void main(String args[]){
		Multilevel obj1 = new Multilevel();
		obj1.reverse();
		obj1.palin();
	}
	void palin(){
		if(original == rev)
			System.out.println("The given number is palindrome");
		else
			System.out.println("The given number is not a palindrome");
	}
}

			
		
		