//GCD 

import java.util.Scanner;

class GCD {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no.of elements");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Find the minimum element in the array
        int minElement = arr[0];
        for (int num : arr) {
            minElement = Math.min(minElement, num);
        }

        // Calculate the GCD of the minimum element and each other element
        int ans = minElement;
        for (int num : arr) {
            if (num != minElement) {
                ans = gcd(ans, num);
            }
        }

        System.out.println(ans);
    }

    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
