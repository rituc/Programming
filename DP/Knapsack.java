import java.io.*;
import java.util.*;

class Knapsack
{
	public static void main(String args[]){
		int n, Wmax;

		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		Wmax = in.nextInt();
		int sol[][] = new int[Wmax+1][n];
		int values[] = new int[n];
		int weights[] = new int[n];
		for(int i = 0; i < n; i++){
			values[i] = in.nextInt();
			weights[i] = in.nextInt();
		}
		for(int w = 0; w <= Wmax; w++){
			if(w >= weights[0]){
				sol[w][0] = values[0];
			} else {
				sol[w][0] = 0;
			}
		}
		for(int i = 1; i < n; i++){
			for(int w = 0; w <= Wmax; w++){
				sol[w][i] = sol[w][i-1];
				if(w >= weights[i]){
					sol[w][i] = Math.max(sol[w][i], values[i] + sol[w - weights[i]][i-1]);
				}
			}
		}
		System.out.println(sol[Wmax][n-1]);
	}
}