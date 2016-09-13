import java.io.*;
import java.util.*;

class StringIntInterconversion{

  static int stringToInt(String str){
    int num = 0, startIndex = 0;
    Boolean isNegative = str.charAt(0) == '-';
    startIndex = isNegative ? 1 : 0;
    for(int i = startIndex; i < str.length(); i++){
      num = num*10 + ((int)str.charAt(i) - (int)'0');
    }
    return isNegative ? (-1)*num : num;
  }

  static String intToString(int num){
    List<Character> arr = new ArrayList<>();
    Boolean isNegative = num < 0;
    while(num != 0){
      arr.add((char)((int)'0' + num % 10));
      num /= 10;
    }
    if(isNegative){
      arr.add('-');
    }
    return new String(Collections.reverse(arr));
  }

  public static void main(String args[]){
    int T;
    Scanner in = new Scanner(System.in);
    T = in.nextInt();
    int sum = 0;
    for(int t = 0; t < T; t++){
      // sum += stringToInt(in.next());
      System.out.println(intToString(in.nextInt()));
    }
    // System.out.println(sum);
  }
}