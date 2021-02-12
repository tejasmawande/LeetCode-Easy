
public class StringEqualsExample {

	
	public static void main(String[] args) {
		
		String a = new String("ABC");
		String b = new String("ABC");
		String c = "XYZ";
		String d = "XYZ";
		String e = "ABC";
		if(a.equals(b))
			System.out.println("True"); //True - we can compare two String objects with equals method.

		if(a == b)
			System.out.println("True"); // false - we cannot compare two String object with == operator
		
		if(c.equals(d)) {
			System.out.println("true"); // true - we can compare two string Literals with equals method.
		}
		
		if(c == d) {
			System.out.println("true"); // true - we can compare two String literals with == operator
		}
		
		if(a.equals(d)) {
			System.out.println("true"); //false - we cannot compare String Literal with String Object with equals method
		}
		
		if(a == d) {
			System.out.println("true");// false - we cannot compare String Literal with String  object with == operator
		}
	}
}
