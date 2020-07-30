package new_app;

public class SelectionSort {
	public static void main(String[] args) {
		int a[] = { 3, 1, 4, 0, 10 };
		int l = a.length;
		for (int i = 0; i < l - 1; i++) {
			int min = i;
			for (int j = i; j < l; j++) {
				if (a[j] < a[min]) {
					min = j;
				}

			}
			int temp = a[i];
			a[i] = a[min];
			a[min] = temp;

		}
		for (int s : a) {
			System.out.print(s + " ");
		}

	}

}
