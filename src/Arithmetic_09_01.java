import java.util.Scanner;

class Arithmetic{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the first number: ");
		int a = scan.nextInt();
		System.out.print("Enter the Second number");
		int b = scan.nextInt();
		
		int Sum = a+b;
		int Diff = a-b;
		int Prod = a*b;
		int Div = a/b;
		
		System.out.println("Sum = " + Sum);
		System.out.println("Difference = "+Diff);
		System.out.println("Product = " +Prod);
		System.out.println("Division = "+Div);
	}
}