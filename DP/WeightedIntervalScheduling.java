import java.io.*;
import java.util.*;

class WeightedIntervalScheduling{
	public static void main(String args[]){
		int T;
		int i, j;
		Scanner in = new Scanner(System.in);
		T = in.nextInt();
		for(int t = 0; t < T; t++){
			int n = in.nextInt();
			int Start[] = new int[n+1];
			int Finish[] = new int[n+1];
			int Weight[] = new int[n+1];
			for(j = 1; j <= n; j++){
				Start[j] = in.nextInt();
				Finish[j] = in.nextInt();
				Weight[j] = in.nextInt();
			}
			int P[] = new int[n+1];
			int M[] = new int[n+1];
			P[0] = 0;
			for(j = 1; j <= n; j++){
				for(i = 1; i <= n; i++){
					if(Start[j] >= Finish[i]){
						P[i] = Math.max(Finish[i], Start[j]);
					}
				}
			}
			for(j = 0; j <= n; j++){
				if(j == 0){
					M[j] = 0;
				}
				if (j > 0){
					M[j] = Math.max(Weight[j] + Weight[P[j]], M[j-1]);
				}
			}
			System.out.print(M[j]);
		}
	}
}