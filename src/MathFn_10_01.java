import java.util.Scanner;

class MathFn{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the first number: ");
		int a = scan.nextInt();
		System.out.print("Enter the Second number: ");
		int b = scan.nextInt();
		
		//long add = a+b
		double res1 = Math.pow((a+b),2);
		double res2 = Math.pow((a-b),2);
		double res3 = Math.pow((a+b),3);
		double res4 = Math.pow((a-b),3);
		
		System.out.println("(a+b)^2 = "+res1);
		System.out.println("(a-b)^2 = "+res2);
		System.out.println("(a+b)^3 = "+res3);
		System.out.println("(a-b)^3 = "+res4);
	}
}