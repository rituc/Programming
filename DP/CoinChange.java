import java.io.*;
import java.util.*;

class CoinChange{
	public static void main(String args[]){
		int T, A, N, i, j;
		Scanner in = new Scanner(System.in);
		T = in.nextInt();
		for(int t = 0; t < T; t++){
			A = in.nextInt();
			N = in.nextInt();
			int value[] = new int[N+1]; 
			for(i = 1; i <= N; i++){
				value[i] = in.nextInt();
			}
			int ways[][] = new int[A+1][N+1];
			for(i = 0; i <= A; i++){
				for(j = 0; j <= N; j++){
					if(i == 0){
						ways[i][j] = 1;
					} else if (j == 0){
						ways[i][j] = 0;
					}
					else if(value[j] > i){
						ways[i][j] = ways[i][j-1];
					}
					else {
						ways[i][j] = ways[i][j-1] + ways[i-value[j]][j];
					}
				}
			}
			System.out.println(ways[A][N]);
		}
	}
}