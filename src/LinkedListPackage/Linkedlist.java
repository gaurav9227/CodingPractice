package LinkedListPackage;

public class Linkedlist {

	private Node head;
	private int listCount = 0;
	
	
	
	public void add(Object data ) {
		Node temp = new Node(data);
		Node current = head;
		
		if(head == null) {
			head=temp;
			listCount++;
			return;
		}
		
		while ( current.getNext() != null) {
			System.out.println("Data in iteration: "+current.getData());
			current = current.getNext();
		}
		System.out.println("Data: "+current.getData());
		current.setNext(temp);
		listCount++;
	}
	
	public boolean remove(int index) {
		
		if(index<1 || index>listCount) 
			return false;
		
		Node current = head;
		for(int i=1 ; i<index ; i++) {
			if(current.getNext() == null)
				return false;
			current = current.getNext();
		}
		current.setNext(current.getNext().getNext());
		listCount--;
		return true;
	}
	
	
	public void print() {
		Node current = head;
		for ( int i=1 ; i <= listCount; i++) {
			System.out.println( current.getData());
			current=current.getNext();
		}
	}
}
