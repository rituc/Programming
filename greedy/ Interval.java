import java.io.;
import java.util.*;

class Interval{
	public static void main(String args[]){
		int T, maxt, N, current_time = 0, no_of_things = 0;
		Scanner in = new Scanner(System.in);
		T = in .nextInt();
		for(int i = 0; i < T; i++){
			maxt = in.nextInt();
			N = in.nextInt();
			int A[] = new int[N];
			for(int j = 0; j <N; j++){
				A[i] = in.nextInt();
			}
			Arrays.sort(A);
			for(int k = 0; k < N; k++){
				if(current_time <= T)
				current_time += A[i];
				no_of_things++;
			}
			System.out.println(no_of_things);
		}
	}
}