// number and Hash pattern

import java.util.Scanner;

class NumberAndHashPattern{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				if(j>=n-i-1){
					if(i%2==0)
						System.out.print((i+1) +"  ");
					else
						System.out.print("#  ");
				}
				else	
					System.out.print("   ");
			}
			System.out.println(); 
		}
	}	
}	