package new_app;

public class BubbleSort {

	public static void main(String[] args) {

		int a[] = { 3, 1, 4, 0, 10 };
		int l = a.length;
		for (int i = 0; i < l - 1; i++) {
			for (int j = 0; j < l - 1 - i; j++) {
				if (a[j + 1] < a[j]) {
					int temp = a[j + 1];
					a[j + 1] = a[j];
					a[j] = temp;
				}

			}

		}
		for (int s : a) {
			System.out.print(s + " ");
		}

	}

}
