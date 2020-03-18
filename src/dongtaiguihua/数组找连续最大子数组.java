package dongtaiguihua;

public class 数组找连续最大子数组 {

	public static void main(String[] args) {
		maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4});
	}
	public static int maxSubArray(int[] nums) {
	    int max=Integer.MIN_VALUE, sum=0;
	    for(int i=0; i< nums.length; i++) {
	    	sum = Math.max(nums[i], sum + nums[i]);
	    	if(sum > max) {
	    		max = sum;
	    	}
	    }
	    
		System.out.println(max);
		return max;  
	    }
}
