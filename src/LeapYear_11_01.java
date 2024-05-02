//Leap Year

import java.util.Scanner;

class LeapYear{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the year: ");
		int year = sc.nextInt();
		
		//if loop
		if(year%4==0){
			if(year%100!=0 || year%400==0)
				System.out.println(year + " is a leap year!!");
			else
				System.out.println(year + " is not a leap year ");
		}
		
		else{
			System.out.println(year + " is not a leap year ");
		}
	}
}