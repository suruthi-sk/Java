// Regular Star Pattern

import java.util.Scanner;

class RegularStarPattern{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				if(j==n-i-1)
					System.out.print("  ");
				if(j<(2*i+1))
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}