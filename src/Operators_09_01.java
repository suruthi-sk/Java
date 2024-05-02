import java.util.Scanner;

class Operators{
	public static void Arithmetic(int a,int b){
		int Sum = a+b;
		int Diff = a-b;
		int Prod = a*b;
		int Div = a/b;
		
		System.out.println("Arithmetic Operations");
		System.out.println("Sum = " + Sum);
		System.out.println("Difference = "+Diff);
		System.out.println("Product = " +Prod);
		System.out.println("Division = "+Div);
	}
	
	public static void Relational(int a,int b){
		System.out.println("Relational Operations");
		System.out.println(a>b);
		System.out.println(a!=b);
		System.out.println(a<=b);
	}

	public static void Logical(int a,int b){
		System.out.println("Logical Operations");
		System.out.println(a&b);
		System.out.println(a|b);
	}
	
	public static void Shift(int a){
		System.out.println("Shift Operation");
		System.out.println(a++);
		System.out.println(++a);
		System.out.println(a--);
		System.out.println(--a);
	}

	public static void Ternary(int a,int b){
		System.out.println("Ternary Operator");
		int res = a>b?a-b:a+b;
		System.out.println(res);
	}
		
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the first number: ");
		int a = scan.nextInt();
		System.out.print("Enter the Second number");
		int b = scan.nextInt();
		
		Arithmetic(a,b);
		Relational(a,b);
		Logical(a,b);
		Shift(a);
		Ternary(a,b);
	}
	
}
		
		
		