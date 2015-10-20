import java.util.*;

class PairSum{

	static int binarySearch(int a[], int start, int end, int x){
		
		int mid;
		while(start <= end){
			mid = (start + end)/2;
			if(a[mid] < x){
				end = mid - 1;
			}else if(a[mid] == x){
				return mid;
			} else{
				start = mid + 1;
			}
		}
		return -1;
	}

	public static void main(String args[]){
		int T, N, sum, result = 0;
		Scanner in  = new Scanner(System.in);
		T = in.nextInt();

		for(int t = 0; t < T; t++){
			N = in.nextInt();
			sum = in.nextInt();
			int num[] = new int[N];
			for(int i = 0; i < N; i++){
				num[i] = in.nextInt();
			}
			Array.sort(num);
			for(int j = 0; j < N; j++){
				result = binarySearch(a, 0, N, sum - num[j]);
				if(result != -1){
					break; 
				}
			}
			
			if(result != -1){
				System.out.print(result, j);
			} else{
				System.out.print("No found");
			}
		}
	}
}