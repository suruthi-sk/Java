import java.util.Scanner;

class BigNum{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the first number: ");
		int a = scan.nextInt();
		System.out.print("Enter the Second number: ");
		int b = scan.nextInt();
		
		int big;
		
		big = (a>b) ? a: b;
		
		System.out.println("The greatest number is "+big);
	}
}

		