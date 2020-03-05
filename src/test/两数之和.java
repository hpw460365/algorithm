package test;

public class 两数之和 {

	public static void main(String[] args) {
		findTwoNum(new int[]{2, 7, 11, 15}, 9);
	}
	
	
	public static void findTwoNum(int[] nums, int target) {
		int i = 0;
		for(; i<=nums.length ; i++) {
			for(int j=i+1; j<= nums.length; j++) {
				if(nums[i] + nums[j] == target) {
					System.out.println(nums[i]);
					System.out.println(nums[j]);
					return;
				}
			}
		}
	}
}
