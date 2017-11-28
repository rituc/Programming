import java.util.*;
import java.io.*;

class Anagram{
  static boolean checkAnagram(String str1, String str2){
    int len1 = str1.length();
    int len2 = str2.length();

    int char_arr[] = new int[26];
    int n_uniq_chars = 0;
    int completed_num_str2 = 0;

    if(len1 != len2) return false;
    for(int i=0; i<len1; i++){
      int val = str1.charAt(i) - 'a';
      if(char_arr[val] == 0) ++n_uniq_chars;
      ++char_arr[val];
    }
   
    for(int i=0; i<len2; i++){
      int val = str2.charAt(i) - 'a';
      if(char_arr[val] == 0){
        return false;
      }
      --char_arr[val];
      if(char_arr[val] == 0){
        completed_num_str2++;
        if(completed_num_str2 == n_uniq_chars){
          return i==str2.length()-1;  
        }
      }
    }
    return false;
  }

  public static void main(String args[]){
    Scanner in = new Scanner(System.in);
    String str1 = in.next();
    String str2 = in.next();
    if(checkAnagram(str1, str2)){
      System.out.println("Two Strings are Anagram");
    } else{
      System.out.println("Two Strings are not Anagram");
    }
  } 
}