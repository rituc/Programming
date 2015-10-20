import java.util.*;
import java.lang.*;

class MinSum {
    public static void main(String args[] ) throws Exception {
        int T, N;
        
        Scanner in = new Scanner(System.in);
        T = in.nextInt();
        for(int t = 0; t < T; t++){
        	N = in.nextInt();
        	int price[][] = new int[N][3];
        	for(int i = 0; i < N; i++){
        		price[i][0] = in.nextInt();
        		price[i][1] = in.nextInt();
        		price[i][2] = in.nextInt();
        	}
        
			int minSum[][] = new int[N][3];
			int minTotalPrice = 0;
			minSum[0][0] = price[0][0];
			minSum[0][1] = price[0][1];
			minSum[0][2] = price[0][2];
			
			for(int  i = 1; i < N; i++){
				minSum[i][0] = Math.min(minSum[i-1][1], minSum[i-1][2]) + price[i][0];
				minSum[i][1] = Math.min(minSum[i-1][0], minSum[i-1][2]) + price[i][1];
				minSum[i][2] = Math.min(minSum[i-1][0], minSum[i-1][1]) + price[i][2];
			}
			 minTotalPrice = Math.min(minSum[N-1][0], Math.min(minSum[N-1][1], minSum[N-1][2]));
			 System.out.println(minTotalPrice);
        }
    }
}
