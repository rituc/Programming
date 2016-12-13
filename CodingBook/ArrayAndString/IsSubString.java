import java.util.*;

class IsRotation{

  static Boolean isRotation(String s1, String s2){
    int len = s1.length();
    if(len == s2.length() && len > 0){
      //return isSubString(s1+s2, s2); //isSubstring is given
      return true;
    }
    return false;
  }

  public static void main(String args[]){
    Scanner in = new Scanner(System.in);
    String s1, s2;
    s1 = in.next();
    s2 = in.next();
    isRotation(s1, s2);
  }
}