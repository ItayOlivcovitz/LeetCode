
public class number_1822 {
	
	private static int signFunc(int sum) {
		if(sum == 0 )
		return 0;
		if(sum > 0)
			return 1;
		return -1;
	}
	    public static int arraySign(int[] nums) {
	    	int sum = 1;
	    	for(int i:nums) {
	    		if(i > 0)
	    		sum*=1;
	    		 if(i < 0)
	    			sum*= -1;
	    		else
	    			sum = 0 ;
	    	}
			return signFunc(sum);
	        
	    }
	
	

	public static void main(String[] args) {
		int [] a = {41,65,14,80,20,10,55,58,24,56,28,86,96,10,3,84,4,41,13,32,42,43,83,78,82,70,15,-41};
		arraySign(a);
	}

}
