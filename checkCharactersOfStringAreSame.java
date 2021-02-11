
public class checkCharactersOfStringAreSame {

	
	public static void main(String[] args) {
		
		String characters = "ABCD";
		
		String[] StringofArray  = {"ABCDABCD","ABZCDA","AABCD"};
		
		for(String new_string : StringofArray) {
		
			boolean res =  hasSameChar(characters, new_string);
			System.out.println("new_string"+new_string+"Res"+res);
		}		
		
	}
	
	public static boolean hasSameChar(String characters, String new_string) {
		
		
		for(char c : characters.toCharArray()) {
			
			if(new_string.indexOf(c) < 0) return false;
		}
	

		for(char c : new_string.toCharArray()) {
		
			if(characters.indexOf(c) < 0) return false;
		}
		
		return true;
	}
}
