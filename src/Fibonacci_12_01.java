//Fibonacci 12.01.24

import java.util.Scanner;

class Fibonacci{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the input: ");
		int input = sc.nextInt();
		int i = 0;
		long fibo = 0;
		long f1 = 1;
		long f2 = 1;

		while(i<input){
			System.out.println(fibo);//0
			f1 = f2;//1
			f2 = fibo;//0
			fibo = f1+f2;//1
			i++;
		}
	}
}