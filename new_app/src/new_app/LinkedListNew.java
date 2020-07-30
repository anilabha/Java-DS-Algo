package new_app;

public class LinkedListNew<E> {
	Node<E> head;
	
	void add(E data) {
		Node<E> toadd=new Node<E>(data);
		if (isEmpty()) {
			head=toadd;
			return;
		}
		Node<E> temp=head;
		while (temp.next!=null) {
			temp=temp.next;
		}
		temp.next=toadd;
	}
	boolean isEmpty() {
		return head==null;
	}
	
	static class Node<E>{
		E data;
		Node<E> next;
		public Node (E data) {
			this.data=data;
			next=null;
		}
	}
	void print() {
		Node<E> temp=head;
		while (temp!=null) {
			System.out.print(temp.data);
			temp=temp.next;
		}
	}
}
