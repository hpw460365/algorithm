package search;

public class 二分循环查找 {

	public static void main(String[] args) {
		int[] ints = {1,2,7,9,25,44,66,99};
		System.out.println(erfen(ints, 99));
	}
	
	public static int erfen(int arr[], int target) {
		int left = 0;
		int right = arr.length - 1;
		int mid;
		while(true) {
			mid = (right + left)/2;
			if(target > arr[mid]) {
				left = mid+1;
			}
			if(target< arr[mid]) {
				right = mid-1;
			}
			if(target == arr[mid]) {
				return mid;
			}
			if(right< left) {
				return -1;
			}
		}
		
	}
}
