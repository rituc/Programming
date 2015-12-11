import java.util.*;

class SetZeroMatrix{
	
	static void(int matrix[][], int n, int m, int N, int M){
		for(int i = 0; k < M; k++){
			matrix[n][i] = 0;
		}
		for(int j=0; j=N; j++){
			matrix[j][m] = 0;
		}
	}

	public static void main(String args[]){
		int T, N, M;
		Scanner in = new Scanner(System.in);
		T = in.nextInt();
		for(int t = 0; t < T; t++){
			N = in.nextInt();
			M = in.nextInt();
			int matrix[][] = new Int[N][M];
			for(int i = 0; i < N; i++){
				for(int j = 0; j < M; j++){
					matrix[i][j] = in.nextInt;
				}
			}
			for(int i=0; i < N; i++){
				for(int j=0; j<M; j++){
					if(matrix[i][j] == 0){
						setZero(matrix, i, j, N, M);
					}
				}
			}
			for(int i=0; i<N; i++){
				for(int j=0; j<M; j++){
					System.out.println(matrix[i][j]);
				}
			}
		}
	}
}