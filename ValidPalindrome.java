
public class ValidPalindrome {

public static void main(String[] args) {
		
		System.out.println("In Main");

		String numsMain = args[0];
		//String[] numsString = numsMain.replaceAll("\\[", "").replaceAll("\\]", "").replaceAll("\\s", "").split(",");
		
		 boolean var = validPalindrome(numsMain);
	}
	
public static boolean validPalindrome(String s) {
	
	StringBuilder sb = new StringBuilder(s);
	for(int i =0 ; i < sb.length();i++) {
		char c = sb.charAt(i);
		sb = sb.deleteCharAt(i);
		if(isPalindrome(sb)) return true;
		sb.insert(i, c);
	}
	  
	return isPalindrome(s);
}

public static boolean isPalindrome(CharSequence sb) {
	
	for(int i = 0 ; i< sb.length()/2; i++) {
		if(sb.charAt(i) != sb.charAt(sb.length() -1 -i)){
			return false;
		}
	}
	return true;
}
}
