import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class G {
	public static void main(String[] args) {
		int a[] = { 0, 1, 0, 3, 12, 0, 22, 88 };
		moveZeroes(a);
		for (int i : a) {
			System.out.print(i + " ");

		}
	}

	public static void moveZeroes(int[] a) {
		int n = a.length;
		int nxt = 0;
		for (int x : a) {
			if (x != 0) {
				a[nxt] = x;
				nxt++;
			}
		}
		for (int i = nxt; i < n; i++) {
			a[i] = 0;
		}

	}

}