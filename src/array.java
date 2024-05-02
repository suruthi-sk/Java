//Array

import java.util.Scanner;

class array{
	public static void main(String args[]){
			Scanner in = new Scanner(System.in);
			System.out.println("Enter no.of elements");
			int n = in.nextInt();
			int[] arr = new int[n];
			
			for(int i=0;i<n;i++){
				arr[i] = in.nextInt();
			}
			
			for(int i=0;i<n;i++)
				System.out.println(arr[i]);
		}
	}