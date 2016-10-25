import java.util.*;

class StringCompression{

  static String compress(String str){
    if(str.length() < countCompression(str)){
      return str;
    }
    char last = str.charAt(0);
    int count = 1;
    StringBuffer mystr = new StringBuffer();
    for(int i=1; i<str.length(); i++){
      if(last == str.charAt(i)){
        count++;
      } else{
        mystr.append(last);
        mystr.append(count);
        last = str.charAt(i);
        count = 1;
      }
    }
    mystr.append(last);
    mystr.append(count);
    return mystr.toString();
  }

  static String compress1(String str){
    int size = countCompression(str);
    if(str.length() < size){
      return str;
    }
    char s[] = new char[size];
    char last = str.charAt(0);
    int count = 1;
    int index = 0;
    for(int i=1; i<str.length(); i++){
      if(str.charAt(i) == last){
        count++;
      } else{
          index = setChar(s, last, index, count);
          last = str.charAt(i);
          count = 1;
      }
    }
    index = setChar(s, last, index, count);
    return String.valueOf(s);
  }

  static int setChar(char array[], char last, int index, int count){
    array[index] = last;
    index ++;
    char cnt[] = String.valueOf(count).toCharArray();
    for(int i=0; i<cnt.length; i++){
      array[index] = cnt[i];
      index++;
    }
    return index;
  }

  static int countCompression(String str){
    char last = str.charAt(0);
    int size = 0;
    int count = 1;
    for(int i=1; i<str.length(); i++){
      if(last == str.charAt(i)){
        count++;
      } else{
        size += 1 + String.valueOf(count).length();
        last = str.charAt(i);
        count = 1;
      }
    }
    size += 1 + String.valueOf(count).length();
    return size;
  }

  public static void main(String args[]){
    Scanner in = new Scanner(System.in);
    int T;
    String s;
    T = in.nextInt();
    for(int t=0; t<T; t++){
      s = in.next();
      // System.out.println(compress(s));
      System.out.println(compress1(s));
    }
  }
}