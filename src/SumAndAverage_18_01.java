//Sum and Average 18/01/24

import java.util.Scanner;

class SumAndAverage{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum = 0;
		
		for(int i=1; i<=num;i++){
			sum = sum+i;
		}
		System.out.println("Sum of the given terms : " + sum);
		
		double avg = sum/num;
		
		System.out.println("Average = "+ avg);
	}
}