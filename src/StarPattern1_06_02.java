//star patter 01 06/02/24

import java.util.Scanner;

class StarPattern1{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i =0;
		int j = 0;
		 
		for(i=0;i<n;i++){
			for(j=0;j<=i;j++){
				System.out.print("*  ");
			}
			System.out.println();
		}
	}
}
		