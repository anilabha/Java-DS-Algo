package sorting;

public class Bsort {
	public static void main(String[] args) {
		int arr[] = { 12, 11, 13, 5, 6, 7 };

		bsort(arr);

		for (int i : arr) {
			System.out.print(i + " ");
		}
	}

	static void bsort(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++)
			for (int j = 0; j < n -i - 1; j++)
				if (arr[j] > arr[j + 1]) {

					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
	}

}
