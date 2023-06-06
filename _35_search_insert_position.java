package Algorithm_I;

public class _35_search_insert_position {

	public static int searchInsert(int[] nums, int target) {
        
		int start = 0 , end = nums.length-1;
		int mid = 0 ;
		  while(start <= end) {
			  mid = ( end + start )/2;
			  if(nums[mid]< target) {
				  start = mid+1 ;
			  }
			  else if(nums[mid]> target) {
				  end = mid-1 ;
			  }
			  if(nums[mid]==target) {
				  System.out.println("Found");
				  return mid ;
			  }
				  
		  }
		  if(nums[mid]<target) {
			  System.out.println("not Found , it should be index "+ (mid+1));
			  return mid+1;
		  }
		  
			  return mid;
		  
		  
		  
		 
    }
	public static void main(String[] args) {
		int []a = {1,3,5,6};
		searchInsert(a,0);
		

	}

}
