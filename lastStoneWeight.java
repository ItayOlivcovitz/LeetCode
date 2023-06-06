
import java.util.Comparator;
import java.util.PriorityQueue;

public class lastStoneWeight {
	  static int lastStoneWeightSolution(int[] stones) {
		  PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
		  int max_1 = 0 ;
		  int max_2 = 0 ;
		  
		  for(int i = 0 ; i< stones.length ; i ++)
		  {
			  maxHeap.add(stones[i]);
		  }
		   while(maxHeap.size() >= 2)
		   {
			      max_1 =maxHeap.remove();
				  max_2 =maxHeap.remove();
				  if(max_1 >= max_2)
				  {
					  maxHeap.add(max_1-max_2);
				  }
				  else if (max_1 < max_2)
				  {
					  maxHeap.add(max_2-max_1);
				  }
		   }
		  
		return maxHeap.remove() ;
	            
		  
  }
	  
	public static void main(String[] args) {
		int [] a = {2,2};
		System.out.print(lastStoneWeightSolution(a));

	}

}
