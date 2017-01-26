package arrays;

public class OneAway {
	public boolean isOneAway(String s1, String s2){
		boolean isOneAway=false;
		
		if(s1==null && s2==null){
			return true;
		}
		if(s1.equals(s2)){
			return true;
		}
		if(Math.abs(s1.length() - s2.length()) > 1){
			return false;
		}
		char[] s1Arr = s1.toLowerCase().toCharArray();
		char[] s2Arr = s2.toLowerCase().toCharArray();
		
		for(int i=0, j=0; i<s1Arr.length && j<s2Arr.length;){
			if(s1Arr[i]!=s2Arr[j] && s1Arr.length==s2Arr.length){
				i++;
				j++;
				isOneAway = !isOneAway;
			}
			else if(s1Arr[i]==s2Arr[j]){
				i++;
				j++;
			}
			else if(s1Arr[i] > s2Arr[j]){
				j++;
				isOneAway = !isOneAway;
			}
			else {
				i++;
				isOneAway = !isOneAway;
			}
		}
		if(!isOneAway && (Math.abs(s1.length() - s2.length())==1)){
			isOneAway = !isOneAway;
		}
		return isOneAway;
	}
}
