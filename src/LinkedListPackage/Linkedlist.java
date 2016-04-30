package LinkedListPackage;

public class Linkedlist {

	public Node head;
	private int listCount = 0;
	public boolean isEven = false;
	
	
	
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
	
	public Node reverselist(Node root1 ,Node prev, Node endNode) {
		Node cur = root1;
		
		if(cur == endNode || cur.getNext() == endNode)
			return cur;
		
		//Node prev = null;
		Node next = cur;
		
		while(cur!=endNode) {
			next = next.getNext();
			cur.setNext(prev);
			prev = cur;
			cur = next;
			
		}
		return prev;
			
	}
	
	public Node findMiddle(Node root1) {
		Node slow,fast;
		
		if(root1 == null)
			return null;
		slow = fast = root1;
		
		while(fast != null && fast.getNext() != null) {
			slow = slow.getNext();
			fast = fast.getNext().getNext();
		}
		if(fast == null)
			isEven = true;
		else if(fast.getNext() == null)
			isEven = false;
		return slow;
	}
	
	public Node addFirstAndLast(Node root1) {
		Node middle = findMiddle(head);
		System.out.println("Middle is:"+middle.getData());
		Node halfReversedHead = reverselist(middle.getNext(), middle, null);
		if(isEven){
			Node cur = head;
			Node reverseCur = halfReversedHead;
			while(cur != middle && cur != null) {
				int data = (int)cur.getData()+ (int)reverseCur.getData();
				cur.setData(data);
				cur = cur.getNext();
				reverseCur =  reverseCur.getNext();
			}
				
		}
		else {
			Node cur = head;
			Node reverseCur = halfReversedHead;
			do {
				int data = (int)cur.getData()+ (int)reverseCur.getData();
				cur.setData(data);
				cur = cur.getNext();
				reverseCur =  reverseCur.getNext();
			} while(cur != middle && cur != null);
			
		}
		Node newHead = reverselist(halfReversedHead, null,middle);
		
		return head;
	}
}
