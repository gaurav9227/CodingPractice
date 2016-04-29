package SortingPackage;

public class Sort {

	public int[] bubbleSort(int[] input) {
		
		for(int i=input.length-1;i>=0;i--) {
			for(int j=1;j<=i;j++) {
				if(input[j-1]>input[j]){
					int temp = input[j-1];
					input[j-1] = input[j];
					input[j] = temp;
				}
			}
		}
		return input;
	}
	
	public void mergeSort(int[] in,int[] tmp,int start,int end) {
		
		if(start<end){
			int center = (start+end)/2;
			mergeSort(in,tmp,start,center);
			mergeSort(in,tmp,center+1,end);
			merge(in,tmp,start,center+1,end);
			
		}
	}
	
	public void merge(int[] in,int[] tmp,int left,int right,int rightEnd) {
		int leftEnd = right-1;		
		int k = left;
		int num = rightEnd-left+1;
		while(left<=leftEnd && right<=rightEnd) {
			if(in[left]<in[right])
				tmp[k++] = in[left++];
			else
				tmp[k++] = in[right++];
		}
		while(left<=leftEnd)
			tmp[k++] = in[left++];
		while(right<=rightEnd)
			tmp[k++] = in[right++];
		
		for(int i=0;i<num;i++,rightEnd--)
			in[rightEnd] = tmp[rightEnd];
			
		
	}
}
