package GeneralPackage;

public class General {

	public void spiralSquareMatrixPrint(int[][] a) {
		int m = a.length;
		int n = a[0].length;
		
		for(int k=0;k<n;k++) {
			int i=k;
			int j=k;
			System.out.println("k:"+k);
			while(j<n-k){
				System.out.print(a[i][j]+",");
				j++;
			}
			j--;
			i++;
			while(i<m-k) {
				System.out.print(a[i][j]+",");
				i++;
			}
			i--;
			j--;
			while(j>=k){
				System.out.print(a[i][j]+",");
				j--;
			}
			j++;
			i--;
			while(i>k){
				System.out.print(a[i][j]+",");
				i--;
			}
		}
	}
}
