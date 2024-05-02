//Number Increasing Pyramid

import java.util.Scanner;

class NumberIncreasingPyramid{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i =0;
		int j = 0;
		 
		for(i=0;i<n;i++){
			for(j=0;j<i;j++){
				System.out.print((j+1)+"  ");
			}
			System.out.println();
		}
	}
}
		