//Group switch case

import java.util.Scanner;

class Vowels{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		char ch = sc.nextLine().charAt(0);
		
	switch(ch){
	case 'a':
	case 'e':
	case 'i':
	case 'o':
	case 'u':
		System.out.println("This is a Vowel");
		break;
	default:
		System.out.println("This is a Consonant");
		break;
	}
	}
}
		