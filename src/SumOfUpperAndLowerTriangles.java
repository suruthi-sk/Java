// Sum of upper and lower triangular matrics

import java.util.*;

class SumOfUpperAndLowerTriangles{
	
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of matrix: ");
		int m = sc.nextInt();
		int n = sc.nextInt();
		int[][] arr = new int[m][n];
		System.out.println("Enter the elements: ");
		
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				arr[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("The given Matrix is: ");
		
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		int upperTriMat = 0;
		int lowerTriMat = 0;
		int diagonalMatrix = 0;
				
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				if(i < j) {
					upperTriMat += arr[i][j];
				} else if(i == j) {
					diagonalMatrix += arr[i][j];
				} else {
					lowerTriMat += arr[i][j];
				}
			}
		}	
		System.out.println("The Sum of Upper Triangular matrix is " + upperTriMat);
		System.out.println("The Sum of Lower Triangular matrix is " + lowerTriMat);
		System.out.println("The Sum of diagonal matrix is " + diagonalMatrix);
	}
}
		