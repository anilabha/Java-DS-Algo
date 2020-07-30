package new_app;

public class MyStack<E> {
	private LinkedListNew<E> ll=new LinkedListNew<>();
	void push(E e) {
		ll.add(e);
	}
	E pop() throws Exception{
		if (ll.isEmpty()) {
			throw new Exception("Poping in empty LL");
		}
		return null;
		
	}
//	E peek() {
//		
//	}

}
