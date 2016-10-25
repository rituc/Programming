import java.util.*;

class SetZero{

  static void setZero(int a[][], int N, int M){
    for(int i=0; i<N; i++){
      for(int j=0; j<M; j++){
        if(a[i][j] == 0){
          a[i][0] = 0;
          a[0][j] = 0;
        }
      }
    }
    int col_index = 1;
    for(int i=0; i<N; i++){
      if(a[i][0] == 0 && col_index<M){
        a[i][col_index] = 0;
        col_index++;
      }
    }
    
    int row_index = 1;
    for(int j=0; j<M; j++){
      if(a[0][j] == 0 && row_index < N){
        a[row_index][j] = 0;
        row_index++;
      }
    }
    System.out.println("**************************");
    for(int i=0; i<N; i++){
      for(int j=0; j<M; j++){
        System.out.println(a[i][j]);
      }
    }
  }

  public static void main(String args[]){
    Scanner in = new Scanner(System.in);
    int N, M;
    System.out.println("Enter number of rows: ");
    N = in.nextInt();
    System.out.println("Enter number of cols: ");
    M = in.nextInt();
    int a[][] = new int[N][M];
    for(int i=0; i<N; i++){
      for(int j=0; j<M; j++){
        a[i][j] = in.nextInt();
      }
    }
    setZero(a, N, M);
  }
}