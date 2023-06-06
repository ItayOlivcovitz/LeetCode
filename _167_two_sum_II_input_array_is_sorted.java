package leet;

public class _167_two_sum_II_input_array_is_sorted {
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
				  else
					  return mid ;
			  }
			  return -1;
			  
	    }
	 public static int[] twoSum(int[] numbers, int target) {
		 int [] ret = new int[2];
		 int ans=0;
		 for (int i = 0; i < numbers.length; i++) {
			 ans =  search(numbers,target - numbers[i]);
			if(ans != -1) {
				if(i == ans) {
					if(numbers.length > ans && numbers[ans+1] == numbers[i]) {
						ans++;
					}
					else {
						ans--;
					}
				}
				
				ret[0]=i + 1;
				ret[1]=ans + 1;
				return ret;
			}
			
			
		}
		return numbers;
	        
	  }
	public static void main(String[] args) {
		int []a = {2,7,11,15};
		twoSum(a, 9);

	}

}
