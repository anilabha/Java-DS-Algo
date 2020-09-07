package sorting;

public class Selectionsort {
	public static void main(String[] args) {
		int arr[] = { 12, 11, 13, 5, 6, 7 };

		ssort1(arr);

		for (int i : arr) {
			System.out.print(i + " ");
		}
	}

//	 static void ssort(int a[]) {
//		
//		int n=a.length;
//		int t[]=new int [n];
//		for (int i=0;i<n;i++) {
//			int mn=0;
//			for (int j=1;j<n;j++) {
//				if(a[j]<a[mn]) {
//					mn=j;
//				}
//				t[i]=a[mn];
//				a[mn]=Integer.MAX_VALUE;
//			}
//			
//		}
//		for(int i=0;i<n;i++) {
//			a[i]=t[i];
//		} 
//		
//		
//	}
	 private static void ssort1(int arr[]) {
		 int n=arr.length;
			
		 int i, j, min_idx;

		    for (i = 0; i < n-1; i++)
		    {
		        min_idx = i;
		        for (j = i+1; j < n; j++)
		          if (arr[j] < arr[min_idx])
		            min_idx = j;
		        int temp = arr[min_idx];
				arr[min_idx] = arr[i];
				arr[i] = temp;

		        
		    } 
			
			
		}

}
