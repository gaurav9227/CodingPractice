package QueuePackage;

public class Queue {
	Node first, last;
	
	public void enqueue(Object data) {
		if(first == null) {
			first = last = new Node(data);
			return;
		}
		Node t = new Node(data);
		last.setNext(t);
		last = last.getNext();
		System.out.println("Added :" + t.getData());
	}
	
	public Object dequeue() {
		if(first == null)
			return null;
		
		Object data = first.getData();
		first = first.getNext();
		
		return data;
	}
	
	public void print() {
		Node cur = first;
		System.out.println("Data is: ");
		while(cur!= null) {
			System.out.print(cur.getData()+",");
			cur = cur.getNext();
		}
	}
}
