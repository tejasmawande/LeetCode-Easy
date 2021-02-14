import java.util.*;

public class B extends A{

	
	public static void main(String[] args) {
	
		
		A b= new B();
		System.out.println("Object "+b.toString());
		System.out.println("In Main");
		List<String> list = new ArrayList<>();
		String a= "Tejas Mawande";
		list.add("Tejas Mawande");
		
		 b.stringEval(0); 
		 b.stringEval("tejas");
		
		B bb = new B();
		bb.stringEval1("Tejas");
	
	}

	public static void stringEval1(String val){
		System.out.println("IN class B");

	HashMap<Student,Integer> map = new HashMap<>();
	
	HashMap<String,Integer> map1 = new HashMap<>();
	Student s = new Student();
	map.put(new Student(1,"Tejas","Java Developer"),1);
map.put(new Student(1,"Tejas","Java Developer"),1);
	 
	 map.put(s, null);
	 map1.put("Tejas", 1);
	 map1.put("Tejas", 2);
	 System.out.println("Map"+map);
	 System.out.println("Map1"+map1);
}
}