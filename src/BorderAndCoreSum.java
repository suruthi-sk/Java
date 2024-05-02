//Border and core sum 08/02/24


import java.util.Scanner;

public class BorderAndCoreSum{
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
		
		int bordersum = 0;
		int coresum = 0;
		int totalsum = 0;
		
		for(int i=0;i<size;i++){
			for(int j=0; j<size; j++){
				totalsum+=arr[i][j];
				
				if(i==0 || j==0 || i==size-1 || j==size-1)
					bordersum+= arr[i][j];
				else
					coresum+=arr[i][j];
			}
		}
		
		System.out.println("Border Sum = "+ bordersum);
		System.out.println("Core Sum = "+ coresum);
		System.out.println("Total Sum = "+ totalsum);
	}
}