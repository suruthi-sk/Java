//Searching

import java.util.Scanner;

class Searching{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of element in array");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the searching element");
		int ele = sc.nextInt();
		
		System.out.println("Enter the element one by one");
		for(int i=0;i<n;i++){
			arr[i] = sc.nextInt();
		}
		
		int flag=0;
		for(int i=0;i<n;i++){
			if(arr[i]==ele){
				System.out.println(ele + " is present at the position " + (i+1));
				flag=0;
				break;
			}
			else{
				flag = 1;
				continue;
			}
		}
		
		if(flag==1)
			System.out.println(ele + " is not present in this array");			
		System.out.println("Searching Successfull");
	}
}