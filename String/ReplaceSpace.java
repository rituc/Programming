import java.util.*;

class ReplaceSpace{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int T, length;
		T = in.nextInt();
		for(int i=0; i<T; i++){
			length = in.nextInt();
			char s[] = new char[length];
			for(int k=0; k<length; k++){
				s[k] = in.nextChar();
			}
			for(int j=0; j<length; j++){
				System.out.print(s[j]);
			}
		}
	}
}