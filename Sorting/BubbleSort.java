import java.io.*;
import java.util.*;

class BubbleSort {
    public static void main(String args[] ) throws Exception {
    	 int T, N, temp;
    	 int MAX = 100000;
        Scanner in = new Scanner(System.in);
        T = in.nextInt();
        int num[] = new int[MAX];
        for(int t = 0; t < T; t++){
        	N = in.nextInt();
        	
        	for(int j = 0; j < N; j++){
        		num[j] = in.nextInt();
        	}
        	for(int k = 0; k < N-1; k++){
        		for(int i = 0; i < N-k-1; i++){
        			if(num[i] < num[i+1]){
        				temp = num[i];
        				num[i] = num[i+1];
        				
        				num[i+1] = temp;
        			}
        		}
        	}
        	for(int i = 0; i < N; i++){
        		System.out.print(num[i] + " ");
        	}
        	 System.out.println();
        }
    }
}
 