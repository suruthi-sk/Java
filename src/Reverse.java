//Reverse of a number

import java.util.Scanner;

class Reverse{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int rev=0;
		//int i=0;
		int divider=1;
		
		while(divider!=0){
			int remainder = input%10;
			rev = rev*10+remainder ;
			divider = input/10;
			input = divider;
			//i++;
		}
		
		System.out.println("The reverse of the given number is: " + rev);
	}
}
			
			