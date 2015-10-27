import java.util.*;
import java.lang.*;

class ReverseString{

	static void toReverse(String s){
		char str[] = s.toCharArray();
		for(int i = str.length-1; i >=0; i--){
			System.out.print(str[i]); 
		}
	}

	static void reverse(String s){
		char str[] = s.toCharArray();
		int N;
		N = s.length();
		int start = 0, end = N-1; 
		char temp;
		while(start < end){
			if(str[start] != str[end]){
				temp = str[start];
				str[start] = str[end];
				str[end] = temp;
				start++;
				end--;
			}
		}
		for(int i=0; i<N; i++){
			System.out.print(str[i]);
		}
	}

	public static void main(String args[]){
		int T;
		String s;
		Scanner in = new Scanner(System.in);
		T = in.nextInt();
		for(int i = 0; i < T; i++){
			s = in.next();
			//toReverse(s);
			reverse(s);
			System.out.println();
		}
	}
}