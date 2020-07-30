package opps;

import java.util.*;

public class Hello {
	public static void main(String args[]) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int a = s.nextInt();
		int arr[] = new int[a];
		System.out.println("Enter the element:");

		for (int i = 0; i < arr.length; i++) {
			arr[i] = s.nextInt();
		}
		System.out.println("Array Elements are ");

		for (int j = 0; j < arr.length; j++) {
			System.out.print(arr[j] + " ");
		}
	}

}
