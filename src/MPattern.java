//MPattern 07/02/24

import java.util.Scanner;

class StarPattern1{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i =0;
		int j = 0;
		 
		for(i=0;i<n;i++){
			for(j=0;j<n;j++){
				if(j==0 || j==n-1)
					System.out.print("* ");
				else if(i==j && j<=(n-1)/2)
					System.out.print("* ");
				else if(j==n-i-1 && j>i)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}
		