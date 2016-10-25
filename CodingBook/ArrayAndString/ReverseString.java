import java.util.*;

class ReverseString{

  static String reverseString(String s){
    char str[] = s.toCharArray();
    int start = 0;

    int end = str.length -1;
    char temp;
    while(start < end){
      if(str[start] != str[end]){
        // swapChar(str[start], str[end]);
        temp = str[start];
        str[start] = str[end];
        str[end] = temp;
      }
      start++;
      end--;
    }
    return new String(str);
  }

  static void swapChar(char c1, char c2){
    char temp;
    temp = c1;
    c1 = c2;
    c2 = temp;
  }

  public static void main(String args[]){
    Scanner in = new Scanner(System.in);
    int T;
    String str;
    T = in.nextInt();
    for(int t=0; t<T; t++){
      str = in.next();
      System.out.println(reverseString(str));
    }
  }
}