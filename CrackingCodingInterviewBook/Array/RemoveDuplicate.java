import java.util.*;
import java.io.*;

class RemoveDuplicate{
  static String removeDup(char str[]){
    int len = str.length;
    // if(str==null) return;
    // if(len<2) return;
    boolean hit[] = new boolean[256];
    for(int i=0; i<26; i++){
      hit[i] = false;
    }
    hit[str[0]-'a'] = true;
    int tail = 1;
    for(int i=1; i<len; ++i){
      if(!hit[str[i]-'a']){
        str[tail] = str[i];
        ++tail;
        hit[str[0]-'a'] = true;
      }
      System.out.println(str[tail]);
    }
    str[tail] = '\0';
    String final_str = String.valueOf(str);
    System.out.println(final_str);
    return final_str;
  }

  // static void removeDup1(char str[]){
  //   len = str.length
  //   if(str==null) return;
  //   if(len < 2) return;
    
  //   int tail = 1
  //   for(int i=1; i<len; i++){
  //     for(int j=0; j<=i; j++){
  //       if (str[i] == str[j]){
  //         str[i] = str[i+1];
  //       }
  //     }
  //   }
  // }

  public static void main(String args[]){
    Scanner in = new Scanner(System.in);
    String str = in.next();
    System.out.println(removeDup(str.toCharArray()));
  }
}