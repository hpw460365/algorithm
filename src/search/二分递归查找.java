package search;

public class 二分递归查找 {

	public static void main(String[] args) {
		int[] ints = {1,2,7,9,25,44,66,99};
		System.out.println(erfen(0, ints.length-1,ints, 44));
	}
	
	public static int erfen(int min, int max, int arr[],int target) {
		if(min > max) {
			return -1;
		}
		int mid = (min + max)/2;
		if(target> arr[mid]) {
			min = mid + 1;
		}
		if(target< arr[mid]) {
			max = mid -1;
		}
		if(target == arr[mid]) {
			return mid;
		}
		return erfen(min, max, arr, target);
			
	}
}
