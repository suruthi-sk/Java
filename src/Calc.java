//a simple math calc using switch case

import java.util.Scanner;

class Calc{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first number : ");
		int a = sc.nextInt();
		System.out.print("Enter the Second number : ");
		int b = sc.nextInt();
		
		System.out.print("Enter your choices: 1.Add\t 2.Sub\t 3.Multiple\t 4.Divide\t 5.Modulo\n");
		int choice = sc.nextInt();
		
		switch(choice){
			case 1:
				System.out.println("Sum of the given two numbers is "+ (a+b));
				break;
			case 2:
				System.out.println("Difference of the given two numbers is "+ (a-b));
				break;
			case 3:
				System.out.println("Product of the given two numbers is "+ (a*b));
				break;
			case 4:
				System.out.println("Quotient of the given two number is "+ (a/b));
				break;
			case 5:
				System.out.println("remainder of the given two numbers is "+ (a%b));	
				break;
			default:
				System.out.println("Enter valid Input");
		}
	}
}	