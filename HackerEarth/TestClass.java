import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;


class TestClass {
  
  // static String toggleString(StringBuilder str){
  //   int finalAsciiValue = 0;
  //   int upperA = (int)'A';
  //   int upperZ = (int)'Z';
  //   int lowerA = (int)'a';
  //   int lowerZ = (int)'z';
  //   int convFactor = lowerA - upperA;
   
  //   for(int i=0; i<str.length(); i++){
  //     int asciiValue = (int)str.charAt(i);
  //     System.out.println("asciiValue: "+asciiValue);
  //     if(asciiValue >= upperA && asciiValue <= upperZ){
  //       finalAsciiValue = asciiValue +  convFactor;
  //       System.out.println("str: " + finalAsciiValue);
  //       System.out.println("char str: "+(char)finalAsciiValue);
  //     }else if(asciiValue >= lowerA && asciiValue <= lowerZ){
  //       finalAsciiValue = asciiValue - convFactor;
  //       System.out.println("str: " + finalAsciiValue);
  //       System.out.println("char str: "+(char)finalAsciiValue);
  //     }
  //     str.setCharAt(i, (char)finalAsciiValue);
  //   }
  //   System.out.println("upperA: "+ upperA);
  //   System.out.println("upperZ: "+ upperZ);
  //   System.out.println("lowerA: "+ lowerA);
  //   System.out.println("lowerZ: "+ lowerZ);
  //   return str.toString();
  // }
  //   public static void main(String args[] ) throws Exception {
  //     Scanner in  = new Scanner(System.in);
  //     System.out.println("Enter String");
  //     StringBuilder str = new StringBuilder(in.next());
  //     System.out.println(toggleString(str));
  //   }

  // static String toggleString(StringBuilder str){
  //   int upperA = (int)'A';
  //   int upperZ = (int)'Z';
  //   int lowerA = (int)'a';
  //   int lowerZ = (int)'z';
  //   int convFactor = lowerA - upperA;
  //   for(int i=0; i<str.length(); i++){
  //     int asciiValue = (int)str.charAt(i);
  //     if(asciiValue >= upperA && asciiValue <= upperZ){
  //       str.setCharAt(i, (char)(asciiValue + convFactor));
  //     }else if(asciiValue >= lowerA && asciiValue <= lowerZ){
  //       str.setCharAt(i,(char)(asciiValue - convFactor));
  //     }
  //   }
  //   return str.toString();
  // }
  //   public static void main(String args[] ) throws Exception {
  //      Scanner in  = new Scanner(System.in);
  //      StringBuilder str = new StringBuilder(in.next());
  //      System.out.println(toggleString(str));
  //   }

  // static boolean isPalindrome(String str){
  //   int endIndex = str.length()-1;
  //   int startIndex = 0;
  //   while(startIndex < endIndex){
  //     if(str.charAt(startIndex) != str.charAt(endIndex)){
  //       return false;
  //     }
  //     startIndex++;
  //     endIndex--;
  //   }
  //   return true;
  // }
  // public static void main(String args[] ) throws Exception {
  //   Scanner in = new Scanner(System.in);
  //   String str = in.next();
  //   String output = isPalindrome(str) ? "YES" : "NO";
  //   System.out.println(output);
  // }

    // public static void main(String args[] ) throws Exception {
    //     Scanner in = new Scanner(System.in);
    //     int num;
    //     num = in.nextInt();
    //     System.out.println(num);
    //     while(num != 42){
    //         num = in.nextInt();
    //         System.out.println(num);
    //     }
    // }

    // static String checkImageSize(int L, int W, int H){
    //     return (W<L || H<L) ? "UPLOAD ANOTHER" : ((W==H) ? "ACCEPTED" : "CROP IT");
    // }
    // public static void main(String args[] ) throws Exception {
    //    Scanner in = new Scanner(System.in);
    //    int N, L, W, H;
    //    L = in.nextInt();
    //    N = in.nextInt();
    //    for(int i=0; i<N; i++){
    //     W = in.nextInt();
    //     H = in.nextInt();
    //     System.out.println(checkImageSize(L, W, H));
    //    }
    // }

    // static int countDivisors(int l, int r, int k){
    //     int count = 0;
    //     for(int i = l;  i <= r; i++){
    //         if(i % k == 0){
    //             count++;
    //         }
    //     }
    //     return count;
    // }
    // public static void main(String args[] ) throws Exception {
    //     int l, r, k;
    //     Scanner in = new Scanner(System.in);
    //     l = in.nextInt();
    //     r = in.nextInt();
    //     k = in.nextInt();
    //     System.out.println(countDivisors(l, r, k));
    // }
    // static int findProduct(int a[], int N){
    //     int prod = 1;
    //     int modVar = 1000000000+7;
    //     for(int i=0; i<N; i++){
    //         prod = (prod*a[i])%modVar;
    //     }
    //     return prod;
    // }
    
    // public static void main(String args[] ) throws Exception {
    //    Scanner in = new Scanner(System.in);
    //    int N = in.nextInt();
    //    int numArray[] = new int[N];
    //    for(int i=0; i<N; i++){
    //         numArray[i] = in.nextInt();
    //    }
    //    System.out.println(findProduct(numArray, N));
    // }
    // static boolean minMax(int a[], int N){
    //     Arrays.sort(a);
    //     int min = a[0];
    //     int max = a[N-1];
    //     int prev = a[0];
    //     if (min == max){
    //         return true;
    //     }
    //     for(int i=1; i<N; i++){
    //         if(prev!=a[i]){
    //             min = min+1;
    //         }
    //         prev = a[i];
    //         if(prev != min){
    //             return false;
    //         }
    //     }
    //     System.out.println("Final min value: "+min);
    //     if(min == max){
    //         return true;
    //     }
    //     return false;
    // }
    // public static void main(String args[] ) throws Exception {
    //     Scanner in = new Scanner(System.in);
    //     int N = in.nextInt();
    //     int a[] = new int[N];
    //     for(int i=0; i<N; i++){
    //         a[i] = in.nextInt();
    //     }
    //     System.out.println(minMax(a, N));
    // }
    // static boolean hasSixConsecutive(String binaryNum){
    //     int count = 1;
    //     int prev = binaryNum.charAt(0);
    //     for(int i=1; i<binaryNum.length(); i++){
    //         if(prev == binaryNum.charAt(i)){
    //             count++;
    //         }else{
    //             count = 1;
    //         }
    //         if(count == 6){
    //             return true;
    //         }
    //         prev = binaryNum.charAt(i);
    //     }
    //     return false;
    // }
    // public static void main(String args[] ) throws Exception {
    //     Scanner in = new Scanner(System.in);
    //     String binaryNum = in.next();
    //     String output = hasSixConsecutive(binaryNum) ? "Sorry, sorry!" : "Good luck!";
    //     System.out.println(output);
    // }
   
    // static int[] findSeriesSum(int a[], int N){
    //     int sum1=0, sum2=0, sum3=0;
    //     int sumArray[] = new int[3];
    //     int index1 = 0, index2 = 1, index3=2;
    //     for(int i=0; i<N; i++){
    //         if(index1<N){
    //             sum1 = sum1 + a[index1];
    //             System.out.println("index1: "+index1);
    //             System.out.println("sum: " + sum1);
    //             System.out.println();
    //         }
    //         if(index2<N){
    //             sum2 = sum2 + a[index2];
    //         }
    //         if(index3<N){
    //             sum3 = sum3 + a[index3];
    //         }
    //         index1 += 3;
    //         index2 += 3;
    //         index3 += 3;
    //     }
    //     sumArray[0] = sum1;
    //     sumArray[1] = sum2;
    //     sumArray[2] = sum3;
    //     return sumArray;
    // }
    
    // public static void main(String args[] ) throws Exception {
    //     Scanner in = new Scanner(System.in);
    //     int N =  in.nextInt();
    //     int a[] = new int[N];
    //     for(int i=0; i<N; i++){
    //         a[i] = in.nextInt();
    //     }
    //     int sumArray[] = findSeriesSum(a, N);
    //     for(int i=0; i<sumArray.length; i++){
    //         System.out.println(sumArray[i]);
    //     }
    // }
    // static int getLastOccurranceIndex(int a[], int N, int M){
    //     int index = -1;
    //     for(int i=0; i<N; i++){
    //         if(a[i] == M){
    //             index = i;
    //         }
    //     }
    //     return index;
    // }
    // public static void main(String args[] ) throws Exception {
    //    Scanner in = new Scanner(System.in);
    //    int N = in.nextInt();
    //    int M = in.nextInt();
    //    int a[] = new int[N];
    //    for(int i=0; i<N; i++){
    //         a[i] = in.nextInt();
    //    }
    //    System.out.println(getLastOccurranceIndex(a, N, M));
    // }
    // static boolean checkVowel(char c){
    //     char vowelList[] = {'a', 'e', 'i', 'o', 'u'};
    //     for(int i=0; i<vowelList.length; i++){
    //         if(c == vowelList[i]){
    //             return true;
    //         }
    //     }
    //     return false;
    // }
    // static int countVowels(StringBuilder str){
    //     int vowelCount = 0;
    //     for(int i=0; i<str.length(); i++){
    //         if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z'){
    //             str.setCharAt(i, (char)((int)str.charAt(i)+'a'-'A'));
    //         }
    //         if(checkVowel(str.charAt(i))){
    //             vowelCount ++;
    //         }
    //     }
    //     return vowelCount;
    // }
    
    // public static void main(String args[] ) throws Exception {
    //     Scanner in = new Scanner(System.in);
    //     int T;
    //     String str;
    //     T = in.nextInt();
    //     for(int i=0; i<T; i++){
    //         str = in.next();
    //         System.out.println(countVowels(new StringBuilder(str)));
    //     }
    // }
    // static int countSetBits(int n){
    //     int setBitCount = 0;
    //     while(n>0){
    //          n = n & (n-1);
    //          setBitCount++;
    //     }
    //     return setBitCount;
    // }
    // public static void main(String args[] ) throws Exception {
    //     Scanner in = new Scanner(System.in);
    //     int T = in.nextInt();
    //     for(int i=0; i<T; i++){
    //         System.out.println(countSetBits(in.nextInt()));
    //     }
    // }
    // static int x = 0;
    // static int y = 0;
    
    // static void findFinalDistination(String str) {
    //     for(int i=0; i<str.length(); i++) {
    //         switch(str.charAt(i)) {
    //             case 'L': x = x-1;
    //             break;
    //             case 'U': y = y+1;
    //             break;
    //             case 'D': y = y-1;
    //             break;
    //             case 'R': x = x+1;
    //             break;
    //         }
    //         System.out.println("x: "+ x);
    //         System.out.println("y: "+ y);
    //         System.out.println();
    //     }
    // }
    
    // public static void main(String args[] ) throws Exception {
    //     Scanner in = new Scanner(System.in);
    //     findFinalDistination(in.next());
    //     System.out.println(x + " " + y);
    // }
    // static int getMaxElemIndex(int a[], int N, int M){
    //     int maxElem = 0;
    //     int maxElemIndex = -1;
    //     for(int i=0; i<N; i++){
    //         if(a[i] > maxElem){
    //             maxElem = a[i];
    //             maxElemIndex = i;
    //         }
    //     }
    //     return (maxElem <= M) ? N : maxElemIndex+1;
    // }
    // public static void main(String args[] ) throws Exception {
    //     Scanner in = new Scanner(System.in);
    //     int T, N, M;
    //     T = in.nextInt();
    //     for(int t=0; t<T; t++){
    //         N = in.nextInt();
    //         M = in.nextInt();
    //         int a[] = new int[N];
    //         for(int i=0; i<N; i++){
    //             a[i] = in.nextInt();
    //         }
    //         System.out.println(getMaxElemIndex(a, N, M));
    //     }
    // }
    // static String addString(String str){
    //   int l =  str.length();
    //   int j = l-1;
    //   int strPos;
    //   char  sumStr[] = new char[l];
    //   for (int i=0; i<l; i++){
    //     strPos = str.charAt(i) - 'a' + 1 + str.charAt(j) - 'a' + 1;
    //     if(strPos > 26){
    //       strPos = strPos - 26;
    //     }
    //     sumStr[i] = (char)(strPos + 'a' -1);
    //     j--;
    //   }
    //   return new String(sumStr);
    // }

    // public static void main(String args[]){
    //   Scanner in = new Scanner(System.in);
    //   int N = in.nextInt();
    //   for(int i=0; i<N; i++){
    //     System.out.println(addString(in.next()));
    //   }
    // }
    static int X;
    static int Y;

    static void getLongestStreak(String str[], int N){
      int maxX = 0;
      int currX = 0;
      int maxY = 0;
      int currY = 0;
     
      for(int i=0; i<N; i++){
        for(int j=0; j<str[i].length(); j++){
          if(str[i].charAt(j) == 'C'){
            currX++;
            currY++;
            if(currX > maxX){
              maxX = currX;
            }
            if(currY > maxY){
              maxY = currY;
            }
          }else {
            currX = 0;
            currY = 0;
          }
        }
        currX = 0;
      }
      X = maxX;
      Y = maxY;
    }
    // public static void main(String args[] ) throws Exception {
    //     Scanner in = new Scanner(System.in);
    //     int N = in.nextInt();
    //     String str[] = new String[N];
    //     for(int i=0; i<N; i++){
    //         str[i] = in.next();
    //     }
    //     getLongestStreak(str, N);
    //     System.out.println(X + " " + Y);
    // }
    // public static void main(String args[] ) throws Exception {
    //     Scanner in = new Scanner(System.in);
    //     int N = in.nextInt();
    //     String str;
    //     int maxX = 0;
    //     int currX = 0;
       
    //     int maxY = 0;
    //     int currY = 0;
       
    //     for(int i=0; i<N; i++){
    //       str = in.next();
    //       for(int j=0; j<str.length(); j++){
    //         if(str.charAt(j) == 'C'){
    //             currX++;
    //             currY++;
    //             if(currX > maxX){
    //               maxX = currX;
    //             }
    //             if(currY > maxY){
    //               maxY = currY;
    //             }
    //         }else {
    //             currX = 0;
    //             currY = 0;
    //             }
    //         }
    //         currX = 0;
    //     }
    //     X = maxX;
    //     Y = maxY;
    //     System.out.println(X + " " + Y);
    // }
    // static int getTotalDestroyedWalls(String str){
    //     int count = 0;
    //     int len = str.length();
    //     if()
    //     for(int i=0; i < len; i++){
    //         if(i>=2 && i < len -2)
    //             if(str.charAt(i) == 'W' && (str.charAt(i+1) == 'B' || str.charAt(i+2) == 'B' || str.charAt(i-1) == 'B' || str.charAt(i-2) == 'B' )){
    //                 count++;
    //             }
    //         }else if(i == 0 && len > 2){
    //             if(str.charAt(i) == 'W' && (str.charAt(i+1) == 'B' || str.charAt(i+2) == 'B')){
    //                 count++;
    //             }
    //         }

    //     }
    //     // if(str.charAt(0) == 'W' && (str.charAt(1) == 'B' || str.charAt(2) == 'B')){
    //     //     count++;
    //     // }
    //     // if(str.charAt(1) == 'W' && (str.charAt(1) == 'B' || str.charAt(2) == 'B')){
    //     //     count++;
    //     // }
    //     // if(str.charAt(l-1) == 'W' && (str.charAt(l-3) == 'B' || str.charAt(l-2) == 'B')){
    //     //     count++;
    //     // }
    //     // if(str.charAt(l-2) == 'W' && (str.charAt(l-3) == 'B' || str.charAt(l-2) == 'B')){
    //     //     count++;
    //     // }
        
    //     return count;
    // }
    // public static void main(String args[] ) throws Exception {
    //     Scanner in = new Scanner(System.in);
    //     int N = in.nextInt();
    //     for(int i=0; i<N; i++){
    //         System.out.println(getTotalDestroyedWalls(in.next()));
    //     }
    // }
    // public static void main(String args[] ) throws Exception {
    //    Scanner in = new Scanner(System.in);
    //    int T = in.nextInt();
    //    int N, aSum, bSum;
    //    for(int t=0; t<T; t++){
    //         N = in.nextInt();
    //         aSum = 0;
    //         bSum = 0;
    //         for(int i=0; i<N; i++){
    //             bSum = bSum + in.nextInt();
    //         }
    //         for(int j=0; j<N; j++){
    //             aSum = aSum + in.nextInt();
    //         }
    //         String output =  aSum == bSum ? "Tie" : (aSum > bSum ? "Alice" : "Bob");
    //         System.out.println(output);
    //    }
    // }
    // public static void main(String args[] ) throws Exception {
    //    Scanner in = new Scanner(System.in);
    //    int N, Q;
    //    N = in.nextInt();
    //    Q = in.nextInt();

    //    String output="";
    //    int a[] = new int[N];
    //    int q[] = new int[3];

    //    for(int i=0; i<N; i++){
    //         a[i] = in.nextInt();
    //    }
    //    for(int j=0; j<Q; j++){
    //         q[0] = in.nextInt();
    //         q[1] = in.nextInt();
    //         if(q[0] == 0){
    //             q[2] = in.nextInt();
    //         }

    //         if(q[0] == 1){
    //             a[q[1]-1] = a[q[1]-1] == 1 ? 0 : 1; 
    //         }
    //         if(q[0] == 0){
    //             output = a[q[2]-1] == 1 ? "ODD" : "EVEN";
    //         }
    //    }
    //    System.out.println(output);
    // }
    // public static void main(String args[] ) throws Exception {
    //    Scanner in = new Scanner(System.in);
    //    BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));

    //    int N, Q;
    //    N = in.nextInt();
    //    Q = in.nextInt();

    //    boolean num[] = new boolean[N];
       
    //    boolean a; 
    //    int b, c;

    //    for(int i=0; i<N; i++){
    //         num[i] = in.nextInt() == 1 ? true : false;
    //    }
    //    for(int j=0; j<Q; j++){
    //         a = in.nextInt() == 1 ? true : false;
    //         b = in.nextInt();
            
    //         if(a){
    //             num[b-1] = !num[b-1]; 
    //         } else {
    //             c = in.nextInt();
    //             System.out.println(num[c-1] ? "ODD" : "EVEN");
    //         }
    //     }  
    // }
    // public static void main(String args[] ) throws Exception {
        
    //     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //     String line = br.readLine();
    //     int N = Integer.parseInt(line);
    //     int A[] = new int[N];
    //     int B[] = new int[N];
    //     for(int i=0; i<N; i++){
    //         A[i] = Integer.parseInt(br.readLine());
    //     }
    //     for(int i=0; i<N; i++){
    //         B[i] = Integer.parseInt(br.readLine());
    //     }
    //     for(int i=0; i<N; i++){
    //         System.out.print(A[i] + B[i] + " ");
    //     }
    // }
    // public static void main(String args[] ) throws Exception {
    //     Scanner in = new Scanner(System.in);
    //     int N = in.nextInt();
    //     int X = in.nextInt();
        
    //     int skipCount = 0;
    //     int solvedCount = 0;
        
    //     for(int i=0; i<N; i++){
    //         if(in.nextInt() <= X && skipCount <= 1){
    //             solvedCount++;
    //         }else if(skipCount > 1){
    //             break;
    //         }else {
    //             skipCount++;
    //         }
    //     }
    //     System.out.println(solvedCount);
    // }
    // public static void main(String args[] ) throws Exception {
    //     Scanner in = new Scanner(System.in);
    //     int N = in.nextInt();
    //     int sum = 0, zeroCount = 0;
    //     int a[] = new int[N];
    //     for(int j=0; j<N; j++){
    //         a[j] = in.nextInt();
    //     }
    //     for(int i=N-1; i>=0; i--){
    //         if(a[i]==0){
    //             zeroCount ++;
    //         } else if(zeroCount == 0){
    //             sum = sum + a[i];
    //         }else{
    //             zeroCount--;
    //         }
    //     }
    //     System.out.println(sum);
    // }
    // public static void main(String args[] ) throws Exception {
    //     Scanner in = new Scanner(System.in);
    //     int T,N, curSpeed, count, num; 
    //     T = in.nextInt();
        
    //     for(int i=0; i<T; i++){
    //         N = in.nextInt();
    //         int a[] = new int[N]; 
    //         curSpeed = in.nextInt();
    //         count = 1;
    //         for(int j=0; j<N-1; j++){
    //             num = in.nextInt();
    //             if( num <= curSpeed){
    //                 count ++;
    //                 curSpeed = num;
    //             }
    //         }
    //         System.out.println(count);
    //     }
    // }
    // int top = -1;
    // int capacity;
    // int stack[];
    
    // Test(int capacity){
    //     this.capacity = capacity;
    //     stack = new int[capacity];
    // }
    
    // boolean isEmpty(){
    //     return top == -1 ? true : false;
    // }
    
    // void push(int x){
    //     if(top == capacity -1){
    //         System.out.println("Stack overflow");
    //     }else{
    //         top = top + 1;
    //         stack[top] = x;
    //     }
    // }
    
    // void pop(){
    //     if(top == -1){
    //         System.out.println("Stack is empty.");
    //     }else{
    //         top = top - 1;
    //     }
    // }
    // int topElement(){
    //     return stack[top];
    // }
    
    // public static void main(String args[] ) throws Exception {
    //     Scanner in = new Scanner(System.in);
    //     int Q = in.nextInt();
    //     int query;
    //     Test stack = new Test(Q);
    //     for(int i=0; i<Q; i++){
    //         query = in.nextInt();
    //         if( query == 1){
    //             if(stack.isEmpty()){
    //                 System.out.println("No Food");
    //             }else{
    //                 System.out.println(stack.topElement());
    //                 stack.pop();
    //             }
    //         }else{
    //             stack.push(in.nextInt());
    //         }       
    //     }
    // }

    // int top = -1;
    // int capacity;
    // int stack[];
    
    // TestClass(int capacity){
    //     this.capacity = capacity;
    //     stack = new int[capacity];
    // }
    
    // boolean isEmpty(){
    //     return top == -1 ? true : false;
    // }
    // void push(int x){
    //     if(top == capacity -1){
    //         System.out.println("Stack is overflow ");
    //     } else{
    //         top = top + 1;
    //         stack[top] = x;
    //     }
    // }
    // void pop(){
    //     if(top == -1){
    //         System.out.println("Stack is empty");
    //     }else{
    //         top = top - 1;
    //     }
    // }
    
    // int getTopElement(){
    //     return stack[top];
    // }
    // public static void main(String args[] ) throws Exception {
    //     Scanner in = new Scanner(System.in);
    //     int T, N, prevId;
    //     char passType;
    //     T = in.nextInt();
    //     for(int t=0; t<T; t++){
    //         N = in.nextInt();
    //         TestClass stack = new TestClass(N);
    //         stack.push(in.nextInt());
    //         for(int i=0; i<N; i++){
    //             passType = in.next().charAt(0);;
    //             if(passType == 'P'){
    //                 stack.push(in.nextInt());
    //             }else{
    //                 stack.pop();
    //                 if(topElm != stack.getTopElement());
                    
    //             }
    //             topElm = stack.getTopElement();
    //         }
    //         System.out.println(stack.getTopElement());
    //     }
    // }

    static int[] rotateArray(int a[], int N, int K){
        int i = 0, temp;
        while(N-K > 0 && K > 0){
            temp = a[i];
            a[i] = a[N-K];
            K--;
            i++;
        }
        return a;
    }
    public static void main(String args[] ) throws Exception {
        Scanner in = new Scanner(System.in);
        int T, N, K;
        T = in.nextInt();
        for(int t=0; t<T; t++){
            N = in.nextInt();
            K = in.nextInt();
            int a[] = new int[N];
            for(int i=0; i<N; i++){
                a[i] = in.nextInt();
            }
            int num[] = rotateArray(a, N, K);
            for(int i=0; i<N; i++){
                System.out.println(num[i]);
            }
        }
    }
}
