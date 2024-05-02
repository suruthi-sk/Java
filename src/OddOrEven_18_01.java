//Odd or Even 18_01_2024

import java.util.Scanner;

class OddOrEven{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		if(num%2==0){
			System.out.println("Even");
		}
		
		else{
			System.out.println("Odd");
		}
	}
}
		