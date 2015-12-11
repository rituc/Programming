import java.io.*;
import java.util.*;

public class FibonacciModified {

    public static void main(String[] args) {
        int A, B, N;
        Scanner in = new Scanner(System.in);
        A = in.nextInt();
        B = in.nextInt();
        N = in.nextInt();
        int arr[] = new int[N];
        arr[0] = A;
        arr[1] = B;
        for(int i=2; i<N; i++){
            arr[i] = arr[i-1]*arr[i-1] + arr[i-2];
        }
        System.out.println(arr[N-1]);
    }
    
}