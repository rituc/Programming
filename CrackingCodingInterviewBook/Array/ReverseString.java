import java.util.*;
import java.io.*;

class ReverseString{

  static String reverseString(StringBuilder str){
    int start = 0;
    int end = str.length() - 1;
    char startTemp;
    char endTemp;
    while(start < end){
      startTemp = str.charAt(start);
      endTemp = str.charAt(end);
      str.setCharAt(start, endTemp);
      str.setCharAt(end, startTemp);
      start = start + 1;
      end = end - 1 ;
      System.out.println(end);
    }
    return str.toString();
  }


  public static void main(String args[]){
    Scanner in = new Scanner(System.in);
    StringBuilder str = new StringBuilder(in.next());
    System.out.println(reverseString(str));
  }

}
