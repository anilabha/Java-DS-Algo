//Two Pointer algorithms
package new_app;

import java.lang.reflect.Array;
import java.util.*;

public class TwoPointer {

	public static void main(String[] args) {
		int a[] = { -3, -1, 0, 4, 6, 7 };
		int l = a.length;
		Arrays.sort(a);
		System.out.println(tsum(a, 6));
		System.out.println(twoSum(a, 6, 0));

	}

	public static boolean tsum(int arr[], int n) {
		for (int i = 0; i < n - 2; i++) {
			if (twoSum(arr, -arr[i], i + 1))
				return true;
		}
		return false;
	}

	public static boolean twoSum(int a[], int x, int i) {

		int j = a.length - 1;
		while (i < j) {
			if (a[i] + a[j] < x) {
				i++;
			} else if (a[i] + a[j] > x) {
				j--;
			} else {
				return true;

			}

		}

		return false;

	}
}
