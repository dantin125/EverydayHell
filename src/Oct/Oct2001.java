package Oct;

public class Oct2001 {
	public static void main(String[] args) {
		int[][] arr = new int[][] {{1,2,3},{4,5,6},{7,8,9}};
		int[][] b = reverse(arr,3);
		System.out.println("The original array:");
		printArr(arr,3);
		System.out.println("The array after reverse:");
		printArr(b,3);
	}
	
	public static int[][] reverse(int[][] a, int n){
		int [][] b = new int [n][n];
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				b[n-1-i][n-1-j] = a[i][n-1-j];
			}
		}
		return b;
	}
	
	public static void printArr(int[][] a, int n) {
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
