package vectorAndStacks;

public class MainClass {

	public static void main(String[] args) throws Exception {
		
		MyStack<Integer> stack = new MyStack<>();
		
		
		stack.push(10);
		stack.push(44);
		stack.push(10);
		stack.push(44);
		
		
		int popped = stack.pop();
		
		System.out.println(popped);
		
		int peeked = stack.peek();
		
		System.out.println(peeked);
	}

}
