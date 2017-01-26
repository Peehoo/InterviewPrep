package arrays;

import java.util.HashMap;

public class PalindromePermutation {
	
	public boolean isPalindromePermutation(String str){
		boolean onlyOneOdd=false;
		if(str.trim().length()==0 || str == null){
			return true;
		}
		str = str.toLowerCase();
		char[] strArray = str.toCharArray();
		HashMap<Character, Integer> charMap = new HashMap<Character, Integer>();
		for (char c : strArray){
			if(c == ' '){
				continue;
			}
			if(!charMap.containsKey(c)){
				charMap.put(c, 0);
			}
			charMap.put(c, charMap.get(c)+1);
		}
		for (int i: charMap.values()){
			if (i%2 == 0){
				continue;
			}
			else {
				onlyOneOdd = !onlyOneOdd;
			}
		}
		return onlyOneOdd;
	}
}
