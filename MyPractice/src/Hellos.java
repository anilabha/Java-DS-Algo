import java.util.*;
public class Hellos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> l=new ArrayList<Integer>();
		l.add(5);
		l.add(4);

		l.add(44);

		l.add(1);

		l.add(2);
		System.err.println(topoSort(l));
		

		

	}
	
	static int[] topoSort(ArrayList<Integer> list) {
		Collections.sort(list); 
        int  a[] = null;
        // add your code here
        for (int i=0;i<list.size();i++){
            a[i]=list.indexOf(i);
        }
        return a;
        
    }

}
