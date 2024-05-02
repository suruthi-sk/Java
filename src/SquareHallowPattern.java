//Square hollow pattern

import java.util.Scanner;

class SquareHollowPattern{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int i=0;
		int j=0;
		
		for(i=0;i<n;i++){
			for(j=0;j<n;j++){
				if(i==0 || j==0 || i==n-1 || j==n-1)
					System.out.print("* ");
				else
					System.out.print("  ");
				}
			System.out.println();
		}
	}
}