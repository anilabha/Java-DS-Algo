
public class Tower {
	public static void main(String[] args) {
		double lo1=28.644800;
		double lo2=22.572645;
		double la1=77.216721;
		double la2=88.363892;
		int h1=5;
		int h2=7;
		double lo=48.864716;
		double la=2.349014; 
		Tower t=new Tower();

		System.out.println(t.towerconnect(lo1, lo2, la1, la2, h1, h2, lo, la));
		
	}

	

	int towerconnect(double lo1, double lo2, double la1, double la2, int h1, int h2, double lo, double la) {
		
		if (h1==0 && h2==0)
			return 0;

		if (lo1 < lo && lo2 > lo) {

			return 1;

		}
		if (la1 < la && la2 > la) {

			return 1;

		}
		return 0;
	}

}
