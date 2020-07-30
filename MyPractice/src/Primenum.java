
public class Primenum {
	public static void main(String[] args) {
		int a=101;
		System.out.println(isPrime(a));
	}

	private static boolean isPrime(int a) {
		int m=(int) Math.sqrt(a);
		if (a<=1)
			return false;
		for (int i=2;i<m;i++) {
			if (a%i==0)
				return false;
		}
		return true;
	}

}
