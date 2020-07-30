package cp;

public class TwoSum {
	public static void main(String[] args) {
		int arr[]= {-2,5,8,10,12};
		boolean x=sol(arr,13);
		System.out.println(x);
		
	}
	static boolean sol(int arr[],int x) {
		int n=arr.length;
		for (int i=0;i<n;i++) {
			for (int j=i+1;j<n;j++) {
				if (arr[i]+arr[j]==x) {
					return true;
				}
			}
			
		}
		return false;
	}

}
