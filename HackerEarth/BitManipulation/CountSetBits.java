import java.util.*;
class CountSetBits{
    static int countSetBits(int n){
        int setBitCount = 0;
        while(n>0){
            n = n & (n-1);
            setBitCount++;
        }
        return setBitCount;
    }
    public static void main(String args[] ) throws Exception {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for(int i=0; i<T; i++){
            System.out.println(countSetBits(in.nextInt()));
        }
    }
}