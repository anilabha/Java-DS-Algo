package cp;

/*
 * 
 * Created By Anilabha Baral
 * */

public class Zero12SortOn {
	public static void main(String[] args) {
		int a[]= {2,0,2,1,1,0};
		Solution1 s=new Solution1();
		s.sortColors(a);
		for (int i:a)
		  System.out.print(i+" ");

	}


}


class Solution1 {
		public void sortColors(int[] nums) {
			int l = 0;
			int m = 0;
			int h = nums.length - 1;
			while (m <= h) {
				switch (nums[m]) {
				case 0: {
					int temp = nums[l];
					nums[l] = nums[m];
					nums[m] = temp;
					l++;
					m++;

					break;
				}
				case 1: {
					m++;
					break;
				}
				case 2: {
					int temp = nums[m];
					nums[m] = nums[h];
					nums[h] = temp;
					h--;
					break;
				}

				}

			}

		}
	}
