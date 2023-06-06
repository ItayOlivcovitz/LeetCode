package Algorithm_I;

public class _704_binary_search {
	/*public static int help(int[] nums, int target,int start,int end) {
		int mid = (end + start )/2;
		if(start> end)
			return -1;
		if(nums[mid] < target)
			return help(nums,target,mid+1,end);
			
		else if (nums[mid] > target)
			return help(nums,target,start,mid-1);
		
		return (end + start)/2;
	}*/
	  public static int search(int[] nums, int target) {
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
			  if(nums[mid]==target)
				  return mid ;
		  }
		  return -1;
		  
		 
		  //return help(nums,target,0,nums.length-1);
	        
	    }
	public static void main(String[] args) {
		int [] a = {-1,0,3,5,9,12};
		System.out.println(search(a,9));

	}

}
