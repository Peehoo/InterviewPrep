package arrays;

public class StringCompression {
	public String compressString(String str){
		String returned = "";
		int count=1;
		returned += str.charAt(0);
		
		for (int i=1; i<str.length(); i++){
			if(str.charAt(i-1)==str.charAt(i)){
				count++;
			}
			else{
				returned += count;
				count=1;
				returned += str.charAt(i);
			}
		}
		returned += count;
		if(returned.length()>str.length()){
			return str;
		}
		return returned;
	}
}
