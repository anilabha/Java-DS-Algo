package cp;

public class MinJumps {
	public static void main(String[] args) {
		int a[] = { 2, 3, 1, 1, 4 };
		int n = a.length;
		System.out.println(minJumps(a, n));

	}

	private static int minJumps(int[] arr, int n) {
		// jumps[n-1] will hold the
		int jumps[] = new int[n];
		// result
		int i, j;

		// if first element is 0,
		if (n == 0 || arr[0] == 0)
			return Integer.MAX_VALUE;
		// end cannot be reached

		jumps[0] = 0;

		// Find the minimum number of jumps to reach arr[i]
		// from arr[0], and assign this value to jumps[i]
		for (i = 1; i < n; i++) {
			jumps[i] = Integer.MAX_VALUE;
			for (j = 0; j < i; j++) {
				if (i <= j + arr[j] && jumps[j] != Integer.MAX_VALUE) {
					jumps[i] = Math.min(jumps[i], jumps[j] + 1);
					break;
				}
			}
		}
		return jumps[n - 1];
	}

	static int minJumps1(int a[], int n) {
		if (n == 1)
			return 0;
		int r = Integer.MAX_VALUE;
		for (int i = 0; i < n; i++) {
			if (i + a[i] >= n - 1) {
				int sub_r = minJumps1(a, i + 1);
				if (sub_r != Integer.MAX_VALUE)
					r = Math.min(r, sub_r);

			}
		}
		return r;
	}

}
