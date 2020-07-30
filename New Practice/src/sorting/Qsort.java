package sorting;

public class Qsort {
	public static void main(String[] args) {
		int arr[] = { 12, 11, 13, 5, 6, 7 };
		int n = arr.length;

		qsort(arr, 0, n - 1);

		for (int i : arr) {
			System.out.print(i + " ");
		}
	}

	static void qsort(int[] arr, int l, int h) {

		if (l < h) {
			int p = partion(arr, l, h);
			qsort(arr, l, p - 1);
			qsort(arr, p + 1, h);

		}
	}

	private static int partion(int[] arr, int l, int h) {
		int p = arr[h];
		int i = l - 1;
		for (int j = l; j < h; j++) {
			if (arr[j] < p) {
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;

			}
		}
		int temp = arr[i + 1];
		arr[i + 1] = arr[h];
		arr[h] = temp;
		return (i + 1);
	}

}

//Java program for implementation of QuickSort 
//class Qsort 
//{ 
//	
//	int partition(int arr[], int low, int high) 
//	{ 
//		int pivot = arr[high]; 
//		int i = (low-1); // index of smaller element 
//		for (int j=low; j<high; j++) 
//		{ 
//			if (arr[j] < pivot) 
//			{ 
//				i++; 
//
//				int temp = arr[i]; 
//				arr[i] = arr[j]; 
//				arr[j] = temp; 
//			} 
//		} 
//
//		int temp = arr[i+1]; 
//		arr[i+1] = arr[high]; 
//		arr[high] = temp; 
//
//		return i+1; 
//	} 
//
//
//	void sort(int arr[], int low, int high) 
//	{ 
//		if (low < high) 
//		{ 
//			
//			int pi = partition(arr, low, high); 
//
//			sort(arr, low, pi-1); 
//			sort(arr, pi+1, high); 
//		} 
//	} 
//
//	static void printArray(int arr[]) 
//	{ 
//		int n = arr.length; 
//		for (int i=0; i<n; ++i) 
//			System.out.print(arr[i]+" "); 
//		System.out.println(); 
//	} 
//
//	// Driver program 
//	public static void main(String args[]) 
//	{ 
//		int arr[] = {10, 7, 8, 9, 1, 5}; 
//		int n = arr.length; 
//
//		Qsort ob = new Qsort(); 
//		ob.sort(arr, 0, n-1); 
//
//		System.out.println("sorted array"); 
//		printArray(arr); 
//	} 
//} 
