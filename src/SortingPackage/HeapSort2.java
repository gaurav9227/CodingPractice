package SortingPackage;

public class HeapSort2 {

	public void sort(int[] a) {
		int N = a.length-1;
		heapify(a,N);
		for(int i=N;i>0;i--) {
			swap(a,0,i);
			N=N-1;
			maxHeap(a,0,N);
		}
	}
	
	public void swap(int[] a, int l,int r) {
		int temp = a[l];
		a[l] = a[r];
		a[r] = temp;
	}
	
	public void heapify(int[] a, int N) {
		for(int i=N/2;i>=0;i--) {
			maxHeap(a,i,N);
		}
	}
	
	public void maxHeap(int[] a, int i,int N) {
		int l = 2*i+1;
		int r = 2*i+2;
		int max = i;
	       if (l <= N && a[l] > a[i])
	           max = l;
	       if (r <= N && a[r] > a[max])        
	           max = r;

	       if (max != i)
	       {
	           swap(a, i, max);
	           maxHeap(a,max,N);
	       }
	}
}
