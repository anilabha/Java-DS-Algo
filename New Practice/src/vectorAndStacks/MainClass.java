package vectorAndStacks;

public class MainClass {

	public static void main(String[] args) throws Exception {

		MyStack<Integer> stack = new MyStack<>();
		stack.push(10);
		stack.push(44);
		stack.push(17);
		stack.push(90);

		int peeked = stack.peek();

		System.out.println("peeked:"+peeked);

		int poped=stack.pop();

		System.out.println("popped:"+poped);
		System.out.println("is Empty="+stack.isEmpty());
		stack.pop();
		stack.pop();
		stack.pop();
		System.out.println("is Empty="+stack.isEmpty());

	}

}
