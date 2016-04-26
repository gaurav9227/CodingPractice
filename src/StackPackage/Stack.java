package StackPackage;

public class Stack {

	Node top;
	
	public void push(Object data) {
		if(top == null) {
			top = new Node(data);
		}
		Node t = new Node(data);
		t.setNext(top);
		top=t;
	}
	
	public Object pop() {
		if(top != null) {
			Object data = top.getData();
			top = top.getNext();
			return data;
		}
		return null;
	}
	
	public void print() {
		Node cur = top;
		while(cur.getNext()!=null) {
			System.out.println("Data is: "+cur.getData());
			cur = cur.getNext();
		}
	}
}
