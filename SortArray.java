import java.util.ArrayList;
import java.util.List;

public class SortArray {

	public static void main(String[] args) {
		
		System.out.println("In Main");
		String[] arr = {"W", "B", "W","W"};
		
		String[] res=  SortStringArray(arr);
		System.out.println(res);
	}

	private static String[] SortStringArray(String[] arr) {
		List<String>  list = new ArrayList<>();
		for(String a : arr) {
			
			if(a.equals("W")) {
				list.add(0,a);
			}
			else {
				list.add(a);
			}
		}
		return (String[]) list.toArray();
	}
}
