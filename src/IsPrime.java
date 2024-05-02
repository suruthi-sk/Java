//prime number check

import java.util.Scanner;

class IsPrime{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int i=2;
		int flag = 0;
		
		while(i<num){
			if(num%i==0){
				flag = 1;
				break;
			}
			else{
				flag = 0;
				//i++;
			}
		i++;
		}
		if(flag == 0)
			System.out.println("Prime");
		else
			System.out.println("Not Prime");
	}
}
			