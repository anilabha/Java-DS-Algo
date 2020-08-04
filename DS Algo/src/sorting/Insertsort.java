package sorting;

public class Insertsort {
	public static void main(String[] args) {
		int arr[] = { 12, 11, 13, 5, 6, 7 };

		isort(arr);

		for (int i : arr) {
			System.out.print(i + " ");
		}
	}
	static void isort(int a[]) {
		int n=a.length;
		for (int i=1;i<n;i++) {
			int key=a[i];
			int j=i-1;
			while (j>=0 && a[j]>key) {
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=key;
		}
		
	}

}
