
public class Test {
	public static void main(String[] args) {

		int a[] = { 9, 8, 5 };
		int n = a.length;
		int ans = Solution.maxSubarrayXOR(a, n);
		System.out.println(ans);

	}
}

class Solution {
	static int XOR(int arr[], int a, int n, int i) {
		if (i == n)
			return a;
		else {
			return Math.max(XOR(arr, a ^ arr[i], n, i + 1), XOR(arr, a, n, i + 1));
		}
	}

	static int maxSubarrayXOR(int A[], int n) {
		return XOR(A, 0, n, 0);
	}
}