// https://www.hackerrank.com/challenges/lonely-integer
import java.util.*;
class LonelyInteger{

  static int findLonelyInteger(int a[], int n){
    int xor = a[0];
    for(int i = 1; i < n; i++){
      xor = xor ^ a[i];  
    }
    return xor;
  }

  public static void main(String args[]){
    Scanner in  = new Scanner(System.in);
    int n;
    n = in.nextInt();
    int a[] = new int[n];
    for(int i = 0; i < n; i++){
      a[i] = in.nextInt();
    }
    System.out.println(findLonelyInteger(a, n));
  }
}