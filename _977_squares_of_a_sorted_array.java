package Algorithm_I;
//Squaring each element and sorting the new array is very trivial,
// could you find an O(n) solution using a different approach?
public class _977_squares_of_a_sorted_array {
public static int[] sortedSquares(int[] nums) {
	int start = 0;
	int end = nums.length-1 ;
	int [] ret = new int [nums.length]; 
	for(int i = end ; i>=0; i --) {
		if(Math.abs(nums[start])>=nums[end]) {
			ret[i]=nums[start]*nums[start];
			start++;
		}
		else {
			ret[i]=nums[end]*nums[end];
			end--;
		}
	}
	return ret;
        
    }
	public static void main(String[] args) {
		int []a = {-4,-1,0,3,10};
		sortedSquares(a);
		
	}

}
