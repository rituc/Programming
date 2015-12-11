import java.io.*;
import java.util.*;

public class MaximumSubarray {
    
    static int max_contiguous(int A[]){
        int current_sum = 0;
        int value = 0;
        int best_sum = -100000;
        int count = 0;
        int l = A.length;
        
        for(int i=0; i<l; i++){
            if(A[i] > best_sum){
                best_sum = A[i];
            }
            if(A[i] < 0)
                 count++;
        }
         if(count != l){
            for(int i=0; i<A.length; i++){
                value = current_sum + A[i];
                if(value>0)
                    current_sum = value;
                else
                    current_sum = 0;
                if(current_sum > best_sum)
                    best_sum = current_sum; 
            }
        }
        return best_sum;
    }
    
    static int non_max_contiguous(int A[]){
        int L = A.length;
        int max_sum = 0;
        int count = 0;
        int max_no = -10000;
        for(int i=0; i<L; i++){
            if(A[i] > 0){
                max_sum = max_sum + A[i];    
            }
            else count++;
        }
        if(count == L){
            for(int i=0; i<L; i++){
                if(A[i] > max_no)
                    max_no = A[i];
            }
            max_sum = max_no;
        }
        return max_sum;
    }

    public static void main(String[] args) {
        int T, N;
        Scanner in = new Scanner(System.in);
        T = in.nextInt();
        for(int i=0; i<T; i++){
            N = in.nextInt();
            int A[] = new int[N];
            for(int j=0; j<N; j++){
                A[j] = in.nextInt();
            }
            System.out.println(max_contiguous(A) + " " + non_max_contiguous(A));
        }
        
    }
}