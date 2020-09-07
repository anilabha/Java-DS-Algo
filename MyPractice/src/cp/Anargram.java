package cp;

public class Anargram {
	public static final int C = 255;

	public static void main(String[] args) {

		System.out.println(is("?atq", "tas?"));

	}

	static boolean is(String s1, String s2) {
		if (s1.length() != s2.length()) {
			return false;

		}

		int[] count = new int[C];
		for (int i = 0; i < s1.length(); i++) {
			count[s1.charAt(i)]++;
			count[s2.charAt(i)]--;

		}
		for (int i = 0; i < C; i++) {
			if (count[i] != 0) {
				return false;
			}
		}
		return true;

	}

}

//Time - O(n) ,Space - O(1) 
