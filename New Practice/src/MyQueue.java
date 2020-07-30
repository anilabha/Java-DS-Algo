import java.util.*;

public class MyQueue extends Thread{
	public static void main(String[] args)  {
		ArrayDeque<Integer> qu = new ArrayDeque<Integer>();
		qu.add(10);
		qu.add(41);
		qu.add(14);
		qu.add(44);
		System.out.println(qu);
		System.out.println(qu.peek());
		System.out.println(qu.isEmpty());
		System.out.println(qu.poll());
		System.out.println(qu.contains(14));

	}

}
