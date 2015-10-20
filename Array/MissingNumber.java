import java.util.*;

class MissingNumber{

	static int findMissingNumber(int a[], int n) {
		int total = (n+1)*(n+2)/2;
		for(int i = 0; i < n; i++){
			total = total - a[i];
		}
		return total;
	}

	public static void main(String args[]){

		int T, N;
		Scanner in = new Scanner(System.in);
		T = in.nextInt();
		for(int t = 0; t < T; t++){
			N = in.nextInt();
			int num[] = new int[N];
			for(int i = 0; i < N; i++){
				num[i] = in.nextInt();
			}
			
			for(int j = 0; j  < N-1; j++){
				if(num[j+1] - num[j] > 1){
					return;
				}
			}
			System.out.println(num[j] + 1);
			System.out.println("findMissingNumber" + findMissingNumber(num, N));
		}
	}
}