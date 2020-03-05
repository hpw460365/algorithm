package test;

public class MaxCollection {

	public static void main(String[] args) {
		maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4});
	}
	public static int maxSubArray(int[] nums) {
	    int max=Integer.MIN_VALUE, i=0,sum=0;
		while (i<nums.length) {
			if (sum+nums[i]<nums[i]) {
				sum=0;
			}
			sum+=nums[i];
			if (sum>max) {
				max=sum;
			}
			i++;
	    }	
		System.out.println(max);
		return max;  
	    }
}
