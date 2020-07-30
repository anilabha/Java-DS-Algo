package new_app;

public class ListNew {
	public static void main(String[] args) {
		LinkedListNew<Integer> a=new LinkedListNew<>();
		for (int i=0;i<10;i++) {
			a.add(i);
		}
		a.print ();
	}

}
