import java.io.*;
import java.util.*;
class Lcs{
	public static void main(String args[]){
		int T;
		String X, Y;

		Scanner in = new Scanner(System.in);
		T = in.nextInt();
		for(int k = 0; k < T; k++){
			X = in.next();
			Y = in.next();
			int m = X.length();
			int n = Y.length();
			int lcs[][] = new int[m+1][n+1];
			for(int i = 0; i <= m; i++){
				lcs[i][0] = 0;
			}
			for(int j = 0; j <= n; j++){
				lcs[0][j] = 0;
			}
			for(int i = 1; i <= m; i++){
				for(int j = 1; j <= n; j++){
					if(X.charAt(i-1) == Y.charAt(j-1)){
					lcs[i][j] = 1 + lcs[i-1][j-1];
					} else{
						lcs[i][j] = Math.max(lcs[i][j-1], lcs[i-1][j]);
					}
				}
			}
			System.out.println(lcs[m][n]);
		}
	}
}