//Border and core pattern 08/02/24


import java.util.Scanner;

public class BorderAndCorePattern{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of matrix: ");
		int size = sc.nextInt();
		int[][] arr = new int[size][size];
		System.out.println("Enter the elements: ");
		
		for(int i=0;i<size;i++){
			for(int j=0;j<size;j++){
				arr[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("The given Matrix is: ");
		
		for(int i=0;i<size;i++){
			for(int j=0;j<size;j++){
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("Border pattern is: ");
		
		for(int i=0;i<size;i++){
			for(int j=0; j<size; j++){
				
				if(i==0 || j==0 || i==size-1 || j==size-1)
					System.out.print(arr[i][j] + " ");
				else
					//System.out.print(arr[i][j]);
					System.out.print("  ");
			}
			System.out.println();
		}
		
		System.out.println("Core pattern is: ");

		
		for(int i=0;i<size;i++){
			for(int j=0; j<size; j++){
				
				if(i==0 || j==0 || i==size-1 || j==size-1)
					System.out.print(" ");
				else
					System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		/*
		System.out.println("Triangular pattern is: ");
		
        for(int i=0;i<size;i++){
			for(int j=0; j<size; j++){
				
				if(i==0 || j==0 || j<size-i-1)
					System.out.print(" ");
				else
					System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		*/
	}
}