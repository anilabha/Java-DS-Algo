

public class Hello11 {
	public static void main(String[] args) {
		int a[]= {4,10,6,10};
		int b[]= {4,10,6,8};
		boolean c=cure(a,b);
		if (c) {
		System.out.println("Yes");
		}else
		System.out.println("No");

		

		
	}
	public static boolean cure(int a[],int b[]) {
		boolean c= false;
		for (int i=0;i<a.length;i++) {
			for (int j=0;j<b.length;j++) {
				if (a[i]>=b[j]) {
					c=true;
				}
				else {
					c=false;
				}
			}
		}
		return c;
	}

}
