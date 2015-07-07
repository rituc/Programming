import java.io.*;
import java.util.*;

class StairsWays{
	public static void main(String args[]){
		int T, n;
		Scanner in = new Scanner(System.in);
		T = in.nextInt();
		for(int j = 0; j < T; j++){
			n = in.nextInt();
			int A[] = new int[n+2];
			A[0] = 1;
			A[1] = 1;
			A[2] = 2;
			for(int i = 3; i <= n; i++){
				A[i] = A[i-1] + A[i-2] + A[i-3];
			}
			System.out.println(A[n]);
		}
	}
}