//Sum of n natural numbers

import java.util.Scanner;

class SumOfnTerms{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of terms: ");
		int number = sc.nextInt();
		
		//declaring formula
		double Sum = (number*(number+1))/2;
		
		System.out.println("Sum of first " + number + " terms is " + Sum);
	}
}