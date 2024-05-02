//Prime in abstract class

import java.util.*;

abstract class abs{
	abstract void get();
	abstract void prime();
	abstract void print();
}

class determine extends abs{
	int n, flag = 1;
	Scanner sc = new Scanner(System.in);
	void get(){
		n = sc.nextInt();
	}
	
	void prime(){
		get();
		for(int i=2;i<n;i++){
			if(n%i==0)
				flag = 1;
			else
				flag = 0;
				break;
		}
	}
	
	void print(){
		prime();
		if(n==2&&flag==1)
			System.out.println("it is not prime");
		else
			System.out.println("it is prime");
	}
}


class PrimeOrNot{
	public static void main(String args[]){
		determine obj = new determine();
		obj.print();
	}
}
	