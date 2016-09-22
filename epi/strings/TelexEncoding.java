import java.util.*;

class TelexEncoding{

  static String getTelexEcoding(char a[], int N){

    char comma[] = "comma".toCharArray();
    char dot[] = "dot".toCharArray();
    char ques[] = "question mark".toCharArray();
    char ex[] = "exclamation".toCharArray();

    int k = 0;

    for(int i=0; i<N; i++){
      if(a[i] == '.'){
        k += dot.length-1;
      }else if(a[i] == ','){
        k += comma.length-1;
      }else if(a[i] == '?'){
        k += ques.length-1;
      }else if(a[i] == '!'){
        k += ex.length-1;
      }
    }

    System.out.println("k: "+k);
    int index = N + k -1;
    System.out.println("index: "+index);

    for(int i=N-1; i>=0; i--){
      if(a[i] == '?'){
        for(int c=ques.length-1; c>=0; c--){
          a[index] = ques[c];
          index --;
          System.out.println("index value: "+index);
        }
      } else if(a[i] == ','){
        for(int c=comma.length-1; c>=0; c--){
          a[index] = comma[c];
          index --;
        }
      } else if(a[i] == '!'){
        for(int c=ex.length-1; c>=0; c--){
          a[index] = ex[c];
          index --;
        }
      } else if(a[i] == '.'){
        for(int c=dot.length-1; c>=0; c--){
          a[index] = dot[c];
          index --;
        }
      } else{
        a[index] = a[i];
        index --;
        System.out.println("index value str: "+index);
      }
    }
    System.out.println("index value at end: "+index);
    return  new String(a);
  }

  public static void main(String args[]){
    Scanner in = new Scanner(System.in);
    System.out.println("Enter large array size: ");
    int arr_size = in.nextInt();
    System.out.println("Enter number of characters in string: ");
    int elem_no = in.nextInt();
    char a[] = new char[arr_size];
    for(int i=0; i<elem_no; i++){
      System.out.println("Enter " + i + "th character: ");
      a[i] = in.next().charAt(0);
    }
    System.out.println("output: " + getTelexEcoding(a, elem_no));
  }
}