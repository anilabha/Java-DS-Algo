
public class MaxCuts {
	public static void main(String[] args) {
		System.out.println(maxcut(5,1,2,3));

	}

	static int maxcut(int n, int a, int b, int c) {
		if (n<0) return -1;
		if (n==0) return 0;
		int res=max(maxcut( n-a,  a,  b,  c)
				, maxcut( n-b,  a,  b,  c),
				maxcut( n-c,  a,  b,  c));
		if (res==-1)
			return res;
		else 
			return res+1;

	}
	static int max(int a,int b,int c) {
		return Math.max(a, Math.max(c, b));
	}

}
