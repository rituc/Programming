import java.util.*;

class UniqueCharacterString{

	static boolean isUniqueChar(String s){
		s.toLowerCase();
		if(s.length() > 26){
			return false;
		}
		boolean char_set[] = new boolean[26];
		int val;
		for(int i = 0; i < s.length(); i++){
			System.out.println(s.charAt(i));
			val = s.charAt(i);
			if(char_set[val])
				return false;
			char_set[val] = true;
		}
		return true;
	}

	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int T;
		String s;
		boolean uniqChar;
		T = in.nextInt();

		for(int t=0; t<T; t++){
			uniqChar = true;
			s = in.next();
			int count[] = new int[26];
			for(int i = 0; i < s.length(); i++){
				count[s.charAt(i)-'a']++;
			}
			for(int i=0; i<26; i++){
				if(count[i] > 1){
					uniqChar = false;
				}
			}
			/*if(isUniqueChar(s))
				System.out.println("String contains unique characters");
			else
				System.out.println("String does not contains unique characters");*/
			System.out.println(uniqChar);
		}
	}
}