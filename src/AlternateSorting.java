//sorting the elements in alternative order

import java.util.Scanner;

class AlternateSorting{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no.of elements in the array");
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		System.out.println("Enter the elements one by one");
		for(int i=0;i<n;i++){
			arr[i] = sc.nextInt();
		}
		
		for(int i=0;i<n;i++){
			int min = arr[i];
			for(int j=i+1;j<n;j++){
				if(min>arr[j]){
					int t=min;
					min = arr[j];
					arr[j] = t;
					arr[i] = min;					
				}
				else
					continue;
			}
		}
		
		int left=0;
		int right = n-1;
		int[] sorted = new int[n];
		
		for(int i=0;i<n;i++){
			if(i%2==0)
				sorted[i] = arr[left++];
			else	
				sorted[i] = arr[right--];
		}
		
		
		for(int i=0;i<n;i++){
			System.out.print(sorted[i] + "  ");
		}
	}
}