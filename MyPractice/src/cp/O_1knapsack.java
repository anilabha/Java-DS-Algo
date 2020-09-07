package cp;
//0 - knapsack

public class O_1knapsack {

	public static void main(String[] args) {
		
		int w=10;
		int []wt= {5,4,6,3};
		int []val= {10,40,30,50};
		System.out.println(kanpsack(w, wt, val, 4));

	}
	static int kanpsack(int w,int []wt,int []val,int n) {
		if (w==0 || n==0) return 0;
		if (wt[n-1]>w) return kanpsack(w, wt, val, n-1);
		else 
			return Math.max(kanpsack(w, wt, val, n-1),
					(val[n-1]+kanpsack(w-wt[n-1], wt, val, n-1)));
					
		
	}

}
