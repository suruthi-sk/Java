//addition of digits

import java.util.Scanner;

class digitAdd{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int real = num;
		int sum = 0;
		
		while(num>0){
			int rem = num%10;
			sum = sum + rem;
			int quo = num/10;
			num = quo;
		}
		
		System.out.println("The sum is " + sum);
	}
}