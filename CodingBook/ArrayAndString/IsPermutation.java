import java.util.*;

class IsPermutation{

  static Boolean isPermutation(String s1, String s2){
    int n1 = s1.length();
    int n2 = s2.length();
    if( n1!= n2){
      return false;
    }
    int var;
    int charCount[] = new int[26];
    for(int i=0; i<n1; i++){
      var = s1.charAt(i) - 'a';
      charCount[var]++;
    }
    for(int j=0; j<n2; j++){
      var = s2.charAt(j)-'a';
      if(--charCount[var] < 0){
        return false;
      }
    }
    return true;
  }

  public static void main(String agrs[]){
    Scanner in = new Scanner(System.in);
    int T;
    String str1, str2;
    T = in.nextInt();
    for(int t=0; t<T; t++){
      str1 = in.next();
      str2 = in.next();
      System.out.println(isPermutation(str1, str2));
    }
  }
}