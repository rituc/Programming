import java.util.*;
import java.io.*;

class SetZero{
  static void steZero(int arr[][], int n_rows, int n_cols){
    int rows[] = new int[n_rows];
    int cols[] = new int[n_cols];
    for(int i=0; i<n_rows; i++){
      for(int j=0; j<n_cols; j++){
        if(arr[i][j] == 0){
          rows[i] = 1;
          cols[j] = 1;
        }
      }
    }
    for(int i=0; i<n_rows; i++){
      for(int j=0; j<n_cols; j++){
        if(rows[i]==1 | cols[j] == 1){
          arr[i][j] = 0;
        }
      }
    }
    System.out.println("OUTPUT");
    for(int i=0; i<n_rows; i++){
      for(int j=0; j<n_cols; j++){
        System.out.println(arr[i][j]);
      }
    }
  }
  public static void main(String args[]){
    Scanner in = new Scanner(System.in);
    int n_rows = in.nextInt();
    int n_cols = in.nextInt();
    int arr[][] = new int[n_rows][n_cols];
    for(int i=0; i<n_rows; i++){
      for(int j=0; j<n_cols; j++){
        arr[i][j] = in.nextInt();
      }
    }
    steZero(arr, n_rows, n_cols);
  }
}