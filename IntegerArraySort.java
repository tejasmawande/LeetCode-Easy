import java.util.ArrayList;
import java.util.List;

public class IntegerArraySort {

	
	public static void main(String[] args) {
		
		System.out.println("In Mian");
		
		ArrayList<Integer> res = new ArrayList<>();
		int[] integer1= {4,6,2,1,3};
		
		int[] ans = sortedList(integer1);
		for(Integer s : ans) {
			res.add(s);
		}
		System.out.println(res);
	}
	
	public static int[] sortedList(int[] list){
		
		for(int i= 0;i<list.length;i++) {
			for(int j=i+1 ;j < list.length;j++) {
			 {
					if(list[i] > list[j]) {
						int temp = list[i];
						list[i] = list[j];
						list[j] = temp;
					}
				}
			}
		}
		return list;
	}
}
