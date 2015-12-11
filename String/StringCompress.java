import java.util.*;
import java.io.*;

class StringCompress{

	static String compress(String str){
		int size;
		int strLength = str.length();
		size = compressCount(str, strLength);
		if(size > strLength){
			return str;
		}

		StringBuffer sb = new StringBuffer();
		char newChar = str.charAt(0);
		int count = 1;
		for(int i = 1; i < strLength; i++){
			if(str.charAt(i) == newChar){
				count++;
			} else{
				sb.append(newChar);
				sb.append(count);
				newChar = str.charAt(i);
				count = 1;
			}
		}
		sb.append(newChar);
		sb.append(count);
		return sb.toString();
	}

	static int compressCount(String str, int strLength){
		if (strLength == 0)
			return 0;
		int count; 
		int size = 0;
		char ch = str.charAt(0);
		count = 1;
		for(int i = 1; i < strLength; i++){
			if(str.charAt(i) == ch){
				count++;
			} else{
				ch = str.charAt(i);
				size = size + 1 + String.valueOf(count).length();
				count = 1;
			}
		}
		size = size + 1 + String.valueOf(count).length();
		return size;
	}

	public static void main(String args[]){
		int T;
		String str, compString;
		Scanner in  = new Scanner(System.in);
		T = in.nextInt();
		for(int i = 0; i < T; i++){
			str = in.next();
			compString = compress(str);
			System.out.println(compString);
		}
	}
}