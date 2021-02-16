package Student;

public class ReverseString {

	
	public static void main(String[] args) {
		String t ="Tejas";
		System.out.println("In Main");
		StringBuilder sb = new StringBuilder(t);
		sb.reverse();
		System.out.println(sb);
	
		String a = "ABC";
		byte[] charA = a.getBytes();
		byte[] result = new byte[charA.length];
		for(int i =0;i < result.length;i++) {
			
			result[i] = charA[charA.length -i -1];
		}
		System.out.println("original String--"+a);
		System.out.println(new String(result));
	}
	
	
}
