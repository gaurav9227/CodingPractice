package SortingPackage;

public class MainClass {

	public static void main(String[] args) {
		Sort s = new Sort();
		int[] input = {5,4,1,2,6,8};
		int[] tmp = new int[input.length];
		s.mergeSort(input,tmp,0,input.length-1);
		for(int i:input)
			System.out.print(i+",");
	}
}
