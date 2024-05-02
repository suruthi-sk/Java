//Print prime numbers

import java.util.Scanner;

class Prime{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int i = 2;
		
		
		System.out.println("The Prime Numbers are: ");
		
		while(i<num){
			int j =2;
			boolean isPrime = true;
			
			while(j<i){
				if(i%j==0){
					isPrime=false;
					break;
				}
			j++;
			}
			
			
			if(isPrime==true){
				System.out.println(i);
				
			}
			i++;
			
		}
		
	}
}
