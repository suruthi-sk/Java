import java.util.Scanner;

class Formulas{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		//Formula 
		long formula1 = (a*a)+(2*a*b)+(b*b);
		long formula2 = (a*a)-(2*a*b)+(b*b);
		long formula3 = (a*a*a)+(b*b*b)+(3*(a*a)*b)+(3*a*(b*b));
		long formula4 = (a*a*a)-(b*b*b)-(3*(a*a)*b)+(3*a*(b*b));
		
		System.out.println("Formula 1 = " + formula1);
		System.out.println("Formula 2 = "+formula2);
		System.out.println("Formula 3 = "+formula3);
		System.out.println("Formula 4 = "+formula4);
	}
}