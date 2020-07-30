package new_app;

import java.util.*;

public class Def {

	public static void main(String[] args) {
		Map<String,String> val = new HashMap<>();
		val.put("anilabha","ceo");
		val.put("mainak","cmo");
		val.put("sourav","cto");
		System.out.println(val);//directly print witout using set
		Set<String> keys=val.keySet();

		for (String i : keys) {
			System.out.println(i+" "+val.get(i));//print using set
		}
	}

}
