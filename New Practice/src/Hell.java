import java.util.*;

public class Hell {
	public static void main(String[] args) {
		int a[] = { 1, 2, 1, 1, 2, 6, 9, 0, 3, 99, 55 };
		int n = a.length;
		Arrays.sort(a);
		for (int i = 0; i < n; i++) {
			for (int j = i + 2; j < n; j++) {
				if (a[i] != a[j]) {
					System.out.print(a[j] + " ");
					break;
				}
				
			}

		}
		//System.out.print(a[n - 1]+" "+a[n - 2]+" "+a[n - 3]+" "+a[n - 4]);
	}

}
