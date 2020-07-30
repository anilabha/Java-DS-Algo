package cp;

public class Repeatchar {

	public static void main(String[] args) {
		rep("aaabbc");
	}

	static void rep(String a) {
		int n = a.length();
		int cont = 0,t=0;
		char q = 0;

		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (a.charAt(i) == a.charAt(j)) {

					cont++;
					q = a.charAt(j);
					System.out.println(cont + "" + q+" ");

				}
				else {
					System.out.println(1 + "" + a.charAt(i)+" ");

				}

			}
		
			


		}
		

	}

}
