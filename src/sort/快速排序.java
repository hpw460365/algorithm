package sort;

public class 快速排序 {

	public static void main(String[] args) {
		int[] arr = {10,7,2,4,7,62,3,4,2,1,8,9,19};
		sort(arr, 0, arr.length-1);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

	}
	
	public static void sort(int[] a, int i, int j) {
		if(i>j) {
			return;
		}
		int temp = a[i];
		int low = i;
		int high = j;
		
		while(low != high) {
			while(temp <= a[high] && low < high) {
				high --;
			}
			while(temp >= a[low] && low< high) {
				low ++;
			}
			if(low < high) {
				int t = a[low];
				a[low]= a[high];
				a[high] = t;
			}
		}
		a[i] = a[low];
		a[low] = temp;
		sort(a, i, low-1);
		sort(a, low+1, j);
	}
}
