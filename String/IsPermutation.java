import java.util.*;

class IsPermutation{

	public static void main(String args[]){
		int T;
		String s1, s2;
		int count1[] = new int[26];
		int count2[] = new int[26];
		
		Scanner in = new Scanner(System.in);
		T = in.nextInt();
		for(int t=0; t<T; t++){
			boolean isPermutation = true;
			s1 = in.next();
			s2 = in.next();
			for(int i=0; i<s1.length(); i++){
				count1[s1.charAt(i)-'a']++;
			}
			for(int j=0; j<s2.length(); j++){
				count2[s2.charAt(j)-'a']++;
			}
			for(int i=0; i<26; i++){
				if(count1[i] != count2[i]){
					isPermutation = false;
				}
			}
			System.out.println(isPermutation);
		}
	}
}