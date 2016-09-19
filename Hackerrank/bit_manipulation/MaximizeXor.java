// https://www.hackerrank.com/challenges/maximizing-xor
import java.util.*;
class MaximizeXor{
  static int getMaxXor(int L, int R){
    int maxXor = (int)Double.NEGATIVE_INFINITY;
    int xor;
    for(int i=L; i<=R; i++){
      for(int j=L; j<=R; j++){
        xor = i ^ j;
        if(maxXor < xor){
          maxXor = xor;
        }
      }
    }
    return maxXor;
  }

  public static void main(String args[]){
    Scanner in = new Scanner(System.in);
    int L, R;
    L = in.nextInt();
    R = in.nextInt();
    System.out.println(getMaxXor(L, R));
  }
}