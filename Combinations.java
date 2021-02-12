import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Combinations {

	public static void main(String[] args) {
		
		System.out.println("In Main");
		int n = 3;
		int k =3;
		
		List<List<Integer>> res=  combine(n,k);
		System.out.println(res);
	}
	  public static List<List<Integer>> combine(int n, int k) {
	        
		  List<List<Integer>> result = new LinkedList<>();
		  	
		  if(k == 0) {
			 result.add(new LinkedList());
			 return result;
		  }
		  backtrack(1,new LinkedList(),n,k,result);
		  return result;
			  
	
		  }
	  	public static void backtrack(int start,LinkedList<Integer> current,int n, int k ,List<List<Integer>>result) {
	  		
	  		if(current.size()==k) {
	  			result.add(new LinkedList(current));
	  		}
	  		for(int i =start; i<=n && current.size() <k;i++ ) {
	  			current.add(i);
	  			backtrack(i+1,current,n,k,result);
	  			current.removeLast();
	  		}
	  	}
	  }
