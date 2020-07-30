import java.util.Arrays;
import java.util.Scanner;

public class Sol {
	public static void main(String[] args)  {
		Scanner s= new Scanner(System.in);
		int t=s.nextInt();
		
		
		int[] a=new int[t];
		for (int i = 0; i < t; i++) {
		      int userInput = s.nextInt();
		      a[i] = userInput;
		    }
 		int n=a.length;

		
		
		for (int i=0;i<n;i++) {
			if (a[i]==1) {
				System.out.println("1");
				break;
			}
			if (a[i]%2==0)
				System.out.println((a[i]/2)-1);
			else 
				System.out.println((a[i]/2)+1);
			
		}
		
		
	}
	

}
