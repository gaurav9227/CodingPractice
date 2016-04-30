package LinkedListPackage;

public class MainClass {
 
	public static void main(String[] args) {
		Linkedlist ll = new Linkedlist();
		ll.add(1);
		ll.add(3);
		ll.add(4);
		ll.add(8);
		ll.add(5);
		ll.add(20);
		ll.add(7);
		ll.add(15);
		ll.print();
		/*System.out.println("New List");
		ll.head = ll.reverselist(ll.head);
		ll.print();*/
//		ll.addFirstAndLast(ll.head);
		System.out.println("--------------");
		ll.reverselist(ll.head.getNext(), ll.head.getNext().getNext(), ll.head.getNext().getNext().getNext());
		ll.print();
	}
}
