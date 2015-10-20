import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class MergeTwoSortedArray {

    static int mergeSortedArray(int M, int N, int arrayM[], arrayN){

        int mergedArray[] = new int[M+N];
        for(int i = 0; i < m+n; i++)
            if(m < n){
                for(int m = 0; m < M; m++){
                    if(arrayM[m] > arrayN[m]){
                        mergedArray[i] = arrayM[m];
                    } else{
                        mergedArray[i] = arrayN[m];
                    }
                }
                mergedArray[i] = 
            }
        }  
    }

    public static void main(String args[] ) throws Exception {
        int T, M, N;
        Scanner in = new scaner(System.in);
        T = in.nextInt();
        for(int t = 0; t < T; t++){
        	M = in.nextInt();
        	N = in.nextInt();
        	int arrayM[] = new int[M];
        	int arrayN[] = new int[N];
        	for(int m = 0; m < M; m++){
        		arrayM[m] = in.nextInt();
        	}
            for(int n = 0; n < N; n++){
                arrayN[n] = in.nextInt();
            }

        }
    }
}
