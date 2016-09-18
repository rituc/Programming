import java.util.*;

class AddRemoveChar{
  static String toAddRemoveChar(String str){
    int j = 0;
    int l = str.length();
    int aCount = 0;
    for(int i = 0; i < l; i++){
      if(str.charAt(i) != 'b'){
        str.charAt(j) = str.charAt(i);
        j++;
      }
      if(str.charAt(i) == 'a'){
        aCount += 1;
      }
    }
    int m = l + aCount -1;
    for(int k = l-1; k >= 0; k--){
      if(str.charAt(k) == 'a'){
        str.charAt(m) = 'd';
        str.charAt(m-1) = 'd';
        m -= 2; 
      } else {
        m -= 1; 
      } 
    }
    return str;
  }

  public static void main(String args[]){
    int T;
    String str;
    Scanner in = new Scanner(System.in);
    T = in.nextInt();
    for(int t = 0; t < T;  t++){
      str = in.next();
      System.out.println(toAddRemoveChar(str));
      System.out.println();
    }
  }
} 