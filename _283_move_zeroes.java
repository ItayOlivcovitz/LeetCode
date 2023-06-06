package Algorithm_I;
//Could you minimize the total number of operations done?
//Note that you must do this in-place without making a copy of the array.
public class _283_move_zeroes {
	public static void print(int []a) {
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
			
		}
	}

public static void moveZeroes(int[] nums) {
	int i = 0 , j = 1;
	if(nums.length == 0) {
		return;
	}
	while(j<=nums.length-1) {
		if(nums[i] == 0 ) {
			while(nums[j] == 0 ) {
				j++;
				if(j >=nums.length)
					return ;
			}
			nums[i] = nums[j];
			nums[j] = 0 ;
			i++;
			j++;
		}
		else {
			i++;
			j++;
		}
			
	}
        
 }
	public static void main(String[] args) {
		int []a = {0,0};
		int []b = {0,1,0,3,12};
		int []c = {1,0,1};
		moveZeroes(c);
		print(c);
		

	}
}
