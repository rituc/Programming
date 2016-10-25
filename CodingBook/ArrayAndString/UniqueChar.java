import java.util.*;

class UniqueChar{

  static Boolean hasUniqChar(String str){
    int checker = 0;
    for(int i=0; i<str.length();i++){
      int var = str.charAt(i)-'a';
      if((checker & (1 << var)) > 0){
        return false;
      }
      checker |= (1 << var);
    }
    return true;
  }

  public static void main(String args[]){
    Scanner in = new Scanner(System.in);
    int T;
    String str;
    T = in.nextInt();
    for(int t=0; t<T; t++){
      str = in.next();
      if(hasUniqChar(str)){
        System.out.println("String has all unique characters");
      }else{
        System.out.println("String has not all unique characters");
      }
    }
  }
}