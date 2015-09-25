import java.io.*;
import java.util.*;

class TestClass1{
	public static void main(String args[]){
		int T, N;
		long odd, even;
		Scanner in = new Scanner(System.in);
		T = in.nextInt();
		for(int i = 0; i < T; i++){
			odd = even = 0;
			N = in.nextInt();
			int arr[] = new int[N];
			for(int j =0; j < N; j++){
				arr[j] = in.nextInt();
			}
		
			for(int k = 0; k < N; k++){
				if(arr[k] % 2 == 0){
					even++;
				} else {
					odd++;
				}
			}
			long sol = even*(even -1)/2 + odd*(odd -1)/2;
			System.out.println(sol);
		}
	}
}
