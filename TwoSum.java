
public class TwoSum {
	
	    public int[] twoSum(int[] nums, int target) {
	    	int [] ans  = {0,0}  ;
	    	
	        for(int i = 0 ; i < nums.length; i ++)
	        {
	        	
	        	for(int j = 0 ;j < nums.length ; j++)
	        	{
	        		if(j != i)
	        		{
	        			if(nums[i]+nums[j] == target)
	        			{
	        				ans[0]=i;
	        				ans[1]=j;
	        				
	        			}
	        		}
	        	}
	        	
	        }
	        return ans;
	    }
	    
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
