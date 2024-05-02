//Number Increasing reverse Pyramid

import java.util.Scanner;

class NumberIncreasingReversePyramid{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int i=0;
		int j=0;
		
		for(i=0;i<n;i++){
			for(j=0;j<n;j++){
				if(j<n-1-i)
					System.out.print((j+1)+"  ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}