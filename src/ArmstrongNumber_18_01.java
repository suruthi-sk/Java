//Armstrong number 18_01

import java.util.Scanner;

class ArmstrongNumber{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int org = num;
		int rem=1;
		int res=0;
		System.out.println("************");
		System.out.println(org);
		
		while(rem>0){
			int div = num%10;
			res = res+(div*div*div);
			rem = num/10;
			num = rem;
		}
		System.out.println(res);
		System.out.println("**********");
		
		if(res==org){
			System.out.println("It is an Armstrong Number");
		}
		else{
			System.out.println("It is not an Armstrong Number");		
		}
	}
}