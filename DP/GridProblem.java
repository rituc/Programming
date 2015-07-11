import java.io.*;
import java.util.*;

class GridProblem{
	public static void main(String[] args) {
		int T;
		int n,m;
		int i, j;
		Scanner in = new Scanner(System.in);
		T = in.nextInt();
		for(int t = 0; t < T; t++){
			n = in.nextInt();
			m = in.nextInt();
			int A[][] = new int[n][m];
			for(i = 0; i < n; i++){
				for(j = 0; j < m; j++){
					A[i][j] = in.nextInt();
				}
			}
			int ways[][] = new int[n][m];
			for(i = 0; i < n; i++){
				for(j = 0; j < m; j++){
					if(i == 0 && A[i][j] != 0){
						ways[i][j] = 1;
					}else if(j == 0 && A[i][j] != 0){
						ways[i][j] = 1;
					}else if(A[i][j] != 0){
						ways[i][j] = ways[i-1][j] + ways[i][j-1];
					}else{
						ways[i][j] = 0;
					}
				}
			}
			System.out.println(ways[n-1][m-1]);
			/*for (i=0; i<n; i++) {
				for (j=0; j<m; j++) {
					System.out.print(ways[i][j] + " ");
				}
				System.out.println();
			}*/
		}
	}
}