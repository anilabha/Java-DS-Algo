package new_app;

import java.util.*;

public class Abc{
	public static void main(String[] args) {//collections don't support index number
		Collection values = new ArrayList();//the is collection framework
		values.add(1);
		values.add(2);
		values.add(3);
		Iterator it=values.iterator();
		while (it.hasNext()) {
		System.out.println(it.next());
		}

	}
}