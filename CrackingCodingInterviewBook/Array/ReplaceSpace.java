import java.util.*;
import java.io.*;

class ReplaceSpace{

  static String replaceSpace(char arr[], int strLen, String str){
    int spaceCount = 0;
    for(int i=0; i<strLen; i++){
      if(arr[i] == ' ') spaceCount++;
    }
    int newLength = strLen + 2*spaceCount;

    arr[newLength] = '\0';
    for(int i=strLen-1; i>=0; i--){
      if(arr[i] == ' '){
        arr[newLength - 1] = '0';
        arr[newLength - 2] = '2';
        arr[newLength - 3] = '%';
        newLength = newLength - 3;
      }
      else{
        arr[newLength-1] = arr[i];
        newLength = newLength - 1; 
      }
      
    }
    String final_str = String.valueOf(arr);
    System.out.println(final_str);
    return final_str;
  }

  public static void main(String args[]){
    Scanner in = new Scanner(System.in).useDelimiter("\\n");
    String str = in.next();
    
    char c[] = new char[100];
    for(int i=0; i<str.length(); i++){
      c[i] = str.charAt(i);
    }
    System.out.println(replaceSpace(c, str.length(), "%20"));
  }
}