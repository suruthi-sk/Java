//Finding perfect square

import java.util.Scanner;

class IsPerfectSquare{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int flag=0;
		
		for(int i=0;i<=(num/2);i++){
			if(i*i==num){
				System.out.println("The number is a perfect square of "+i);
				flag = 0;
				break;
			}
			else{
				flag = 1;
				continue;
			}
		}
		if(flag==1){
			System.out.println("The number is not a perfect square");
		}
	}
}