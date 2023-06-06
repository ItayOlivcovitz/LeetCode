import java.util.HashMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map.Entry;
public class number_2215 {
	
	 public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
         HashMap<Integer, Integer> map1 = new HashMap<>();
		 HashMap<Integer, Integer> map2 = new HashMap<>();
		 
		 List<List<Integer>> ret = new ArrayList<List<Integer>>();
	     List<Integer> list_nums1 = new ArrayList<Integer>();
	     List<Integer> list_nums2 = new ArrayList<Integer>();
		 
		 for(int i :nums1)
		 {
			 map1.put(i, i) ;
		 }
		 for(int i :nums2)
		 {
			 map2.put(i, i) ;
		 }
		
		 for (Entry<Integer, Integer> entry : map1.entrySet()) {
			    int value = entry.getValue();
			    if(map2.get(value) == null)
			    	list_nums1.add(value);
			}
		 
		 for (Entry<Integer, Integer> entry : map2.entrySet()) {
			    int value = entry.getValue();
			    if(map1.get(value) == null)
			    	list_nums2.add(value);;
			}

	     ret.add(list_nums1);
	     ret.add(list_nums2);
	     
		 return ret;
        
	    }
	

	public static void main(String[] args) {
		int []a = {1,2,3,3};
		int []b = {1,1,2,2};
		
		findDifference(a,b);

	}

}
