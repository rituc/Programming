import java.util.*;

class ReplaceSpace{

  static String replaceSpace(char s[], String substr, int l){
    int spaceCount = 0;
    int subl = substr.length();
    int m;
    for(int i=0; i<l; i++){
      if(s[i] == 'a'){
        spaceCount++;
      }
    }
    int index = l + spaceCount*(subl-1) -1;
    for(int j=l; j>=0; j--){
      m = 0;
      if(s[j] == 'a'){
        s[index] = '0';
        s[index-1] = '2';
        s[index - 2] = '%';
        // for(int k=subl-1; k>=0; k--){
        //   s[j-m] = substr.charAt(k);
        //   m++;
        // }
        // System.out.println(j);
        index -= 2;
      } else{
        s[index] = s[j];
        index --;
      }
      // System.out.println(spaceCount);
    }
    return new String(s);
  }

  public static void main(String args[]){
    Scanner in = new Scanner(System.in);
    int T, strLen;
    T = in.nextInt();
    String str, substr;
    char c[] = new char[100];
    for(int t=0; t<T; t++){
      substr = in.next();
      strLen = in.nextInt();
      for(int i=0 ; i<strLen; i++){
        c[i] = in.next().charAt(0);
      }
      System.out.println(replaceSpace(c, substr, strLen));
    }
  }
}