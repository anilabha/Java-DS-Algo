package cp;

public class CountBST {
	public static void main(String[] args) {
		
		System.out.println(countbst(3));
		
	}
	static int countbst(int n) {
		int [] t=new int[n+1];
		t[0]=1;
		t[1]=1;
	for (int i=2;i<=n;i++) {
		for (int j=0;j<i;j++) {
			t[i]=t[i]+t[j]*t[i-j-1];
		}
		
	}
		return t[n];
		
	}

}
