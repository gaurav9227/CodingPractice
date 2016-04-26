package QueuePackage;

public class MainClass {

	public static void main(String[] args) {
		Queue q = new Queue();
		q.enqueue("10");
		q.enqueue("20");
		q.enqueue("30");
		Object data = q.dequeue();
		q.print();
	}
}
