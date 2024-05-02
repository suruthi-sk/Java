//star patter 02 06/02/24

import java.util.Scanner;

class StarPattern2{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i =0;
		int j = 0;
		 
		for(i=n;i>0;i--){
			for(j=i;j>=1;j--){
				System.out.print("*  ");
			}
			System.out.println();
		}
	}
}
		