package BinaryTreePackage;

public class Bunny {

	public int addBun(int n, int sum) {
		if(n==0)
			return sum;
		 if(n%2==0)
			 return addBun(n-1,sum+2);
		 else
			 return addBun(n-1,sum+3);
	}
	
	public static void main(String[] args) {
		Bunny b= new Bunny();
		int sum = b.addBun(2, 0);
		System.out.println("Sum:"+sum);
	}
}
