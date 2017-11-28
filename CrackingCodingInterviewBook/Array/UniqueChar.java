import java.util.*;
import java.io.*;


class UniqueChar{
  static Boolean hasUniqueChars(String str){
    int checker=0;
    for(int i=0; i<str.length(); i++){
      System.out.println(str.charAt(i));
      int val = str.charAt(i) - 'a';
      if((checker & (1 << val)) > 0) return false;
      checker = checker | (1 << val);
    }
    return true;
  }

  static Boolean hasUniqueChars2(String str){
    boolean char_array[] = new boolean[26];
    for(int i=0; i<str.length(); i++){
      int val = str.charAt(i) - 'a';
      System.out.println(val);
      if (char_array[val]) return false;
      char_array[val] = true;
    }
    return true;
  }

  public static void main(String args[]){
    Scanner in  = new Scanner(System.in);
    String s = in.next();
    if(hasUniqueChars(s)){
      System.out.println("UniqueChar");
    } else{
      System.out.println("No UniqueChar"); 
    }
  }

}