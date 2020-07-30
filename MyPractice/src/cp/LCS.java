package cp;

public class LCS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "GeeksforGeeks";
		String b = "skeeGrofskeeG";
		int m = a.length();
		int n = b.length();

		System.out.println(lcs(a, b, m, n));

	}

	static int lcs(String s, String t, int m, int n) {

		if (n==0 || m==0) return 0;
		if (s.charAt(m - 1) == t.charAt(n - 1)) {
			return (1 + lcs(s, t, m - 1, n - 1));
		} else {
			return Math.max(lcs(s, t, m - 1, n), lcs(s, t, m, n - 1));
		}

	}

}
//
//Longest palindromic subsequence
//package cp;
//
//import java.util.*;
//import java.lang.*;
//import java.io.*;
//class LCS
// {
//	public static void main (String[] args)
//	 {
//	 //code
//	Scanner sc=new Scanner(System.in);
//	int T=sc.nextInt();
//	int x=0;
//	while(T-- > 0){
//	     int m=sc.nextInt();
//	     int n=sc.nextInt();
//	     String s1=sc.next();            // Take both the string as input
//		 String s2=sc.next();
//		  x=lcs(s1,s2,m,n);
//		  System.out.println(x);
//	 }
//	 		           // Output the answer of dp[0][0]
//
//	     
//	 }
//	 
//	static int lcs(String s, String t, int m, int n) {
//
//		if (n==0 || m==0) return 0;
//		if (s.charAt(m - 1) == t.charAt(n - 1)) {
//			return (1 + lcs(s, t, m - 1, n - 1));
//		} else {
//			return Math.max(lcs(s, t, m - 1, n), lcs(s, t, m, n - 1));
//		}
//
//	}
//     
// }
