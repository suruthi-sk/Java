//Factorial 13.01.2024

import java.util.Scanner;

class Factorial{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = sc.nextInt();
		long fact=1;
		
		for(int i=1;i<=num;i++){
			fact = i*fact;
		}
		System.out.println("Factorial of "+num+" is "+fact);
	}
}