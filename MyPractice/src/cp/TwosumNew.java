package cp;
import java.util.*;

public class TwosumNew {
	public static void main(String[] args) {
		int A[] = { 1, 4, 45, 6, 10, 8 };
		int n = 16;
		printpairs(A, n);
	}

	private static void printpairs(int[] a, int sum) {
		// TODO Auto-generated method stub
		HashSet<Integer> s=new HashSet<>();
		for (int i=0;i<a.length;i++) {
			int temp=sum-a[i];
			if (s.contains(temp)) {
				System.out.println("("+temp+","+a[i]+")");
				
			}
			s.add(a[i]);
		}
		
	}

}
//
//Time Complexity: O(n).
//As the whole array is needed to be traversed only once.
//Auxiliary Space: O(n).
//As a hash map has been used to store array elements.