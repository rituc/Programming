class TelexEncoding{

  static String getTelexEcoding(char a[], int N){
    k = 0
    for(int i=0; i<N; i++){
      if(a[i] == '.'){
        k += 3;
      }
      else if(a[i] == ','){
        k += 5;
      }else if(a[i] == '?'){
        k += 12;
      }else if(a[i] == '!'){
        k += 17;
      }
    }
  }

  public static void main(String args[]){
    int N;
    Scanner in = new Scanner(System.in);
    N = in.nextInt();
    char a[] = new char[N];
    for(int i=0; i< N; i++){
      a[i] = in.next();
    }
    getTelexEcoding(a, N);
  }
}