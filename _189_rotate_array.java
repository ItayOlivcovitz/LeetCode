package Algorithm_I;

public class _189_rotate_array {
	public static void print(int []a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
			
		}
	}
	 public static void rotate(int[] nums, int k) {
		 int [] temp = new int[k];
		 int countUntilK=0;
		 if(k > nums.length) {
			 k = k % nums.length;
		 }
		 for(int i = nums.length-1 ; i >=0  ;i--) {
			 if(countUntilK < k) {
				 temp[countUntilK] = nums[i];
				 countUntilK++;
			 }
			 else {
				 nums[i + k]=nums[i];
			 }
		 }
		 for(int i = 0 ;i<k;i++) {
			 nums[i]=temp[k-1-i];
		 }
	        
	    }
	public static void main(String[] args) {
		int []a = {1,2};
		rotate(a,3);
		print(a);
	}

}
