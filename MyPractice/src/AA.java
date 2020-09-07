
import java.util.*;

public class AA {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int rows = 3;
		int cols = scan.nextInt();

		char li[][] = new char[rows][cols];

		for (int i = 0; i <rows; i++) {
			for (int j = 0; j < cols; j++) {
				li[i][j] = scan.next().charAt(0);
			}
		}
		try {

		for (int i = 0; i <= (cols - 2); i++) {
			if (li[0][i] == '#') {
				System.out.print("#");
			     continue;
			     }
			if (li[0][i] == '.' && li[0][i + 1] == '*' && li[0][i + 2] == '.')
				if (li[1][i] == '*' && li[1][i + 1] == '*' && li[1][i + 2] == '*')
					if (li[2][i] == '*' && li[2][i + 1] == '.' && li[2][i + 2] == '*')
						System.out.print('A');
			if (li[0][i] == '*' && li[0][i + 1] == '*' && li[0][i + 2] == '*')
				if (li[1][i] == '*' && li[1][i + 1] == '*' && li[1][i + 2] == '*')
					if (li[2][i] == '*' && li[2][i + 1] == '*' && li[2][i + 2] == '*')
						System.out.print('E');
			if (li[0][i] == '*' && li[0][i + 1] == '*' && li[0][i + 2] == '*')
				if (li[1][i] == '.' && li[1][i + 1] == '*' && li[1][i + 2] == '.')
					if (li[2][i] == '*' && li[2][i + 1] == '*' && li[2][i + 2] == '*')
						System.out.print('I');
			if (li[0][i] == '*' && li[0][i + 1] == '*' && li[0][i + 2] == '*')
				if (li[1][i] == '*' && li[1][i + 1] == '.' && li[1][i + 2] == '*')
					if (li[2][i] == '*' && li[2][i + 1] == '*' && li[2][i + 2] == '*')
						System.out.print('O');
			if (li[0][i] == '*' && li[0][i + 1] == '.' && li[0][i + 2] == '*')
				if (li[1][i] == '*' && li[1][i + 1] == '.' && li[1][i + 2] == '*')
					if (li[2][i] == '*' && li[2][i + 1] == '*' && li[2][i + 2] == '*')
						System.out.print('U');

		}
		}
		catch(Exception e) {
			
		}

	}

}
