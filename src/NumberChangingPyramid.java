//Number Changing Pyramid

import java.util.Scanner;

class NumberChangingPyramid{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i =0;
		int j = 0;
		int c = 1;
		 
		for(i=0;i<n;i++){
			for(j=0;j<i;j++){
				System.out.print(c+"  ");
				c++;
			}
			System.out.println();
		}
	}
}
		