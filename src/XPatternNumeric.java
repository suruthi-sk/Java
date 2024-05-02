//X Pattern Numeric 07/02/24

import java.util.Scanner;

class XPatternNumeric{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i =0;
		int j = 0;
		 
		for(i=0;i<n;i++){
			for(j=0;j<n;j++){
				if(i==j || j==n-i-1)
					System.out.print(j+1);
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}
		