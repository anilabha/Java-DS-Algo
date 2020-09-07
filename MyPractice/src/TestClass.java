import java.io.*;
import java.util.*;

public class TestClass {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter wr = new PrintWriter(System.out);
		int T = Integer.parseInt(br.readLine().trim());
		for (int t_i = 0; t_i < T; t_i++) {
			String str = br.readLine();

			int out_ = solve(str);
			System.out.println(out_);

		}

		wr.close();
		br.close();
	}

	static int solve(String s) {
		// Write your code here
		int n = s.length();
		int count = 0;
		if (n <= 1) {
			return 0;
		}
		char ch[] = new char[n];
		for (int i = 0; i < n; i++) {
			ch[i] = s.charAt(i);
		}

		for (int i = 1; i < n; i++) {

			if (ch[i] == 'b' && ch[i - 1] == 'b') {
				ch[i] = 'w';
				count++;

			} else if (ch[i] == 'w' && ch[i - 1] == 'w') {
				ch[i] = 'b';
				count++;

			}

		}
		return count;

	}
}