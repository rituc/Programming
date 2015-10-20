import java.util.*;

class MajorityElement{

	public static void main(String args[]){
		Scaner in = new Scanner(System.in);
		int T, N, result;
		int max = 0; 
		T = in.nextInt();
		for(int t = 0; t < T; t++){
			N = in.nextInt();
			int num[] = new int[N];
			for(int  i = 0; i < N; i++){
				num[i] = in.nextInt();
			}
			for(int k = 0; k < N; k++){
				if(max < num[k]){
					max = num[k];
				}
			}
			int count[] = new int[max];
			for(int c = 0; c < max; c++){
				count[num[c]]++;
			}
			for(int j = 0; j < max; j++){
				if(count[j] >= N/2){
					System.out.println(j);
				} else{
					System.out.println("no majority element");
				}
			}
		}
	}
}