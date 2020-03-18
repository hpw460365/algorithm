package sort;

import java.awt.Adjustable;
import java.util.Arrays;

public class 堆排序 {

	public static void main(String[] args) {
        int []arr = {7,6,7,11,5,12,3,0,1,21,22,45};
        System.out.println("排序前："+Arrays.toString(arr));
        sort(arr);
        System.out.println("排序前："+Arrays.toString(arr));
	}
	
	
	public static void sort(int arr[]) {
		//1.构建大顶堆
		for(int i=arr.length/2-1; i>=0; i--) {
			//从下至上，从右至左，非叶结点
			adjust(arr, i, arr.length);
		}
		//2.排序
		for(int j = arr.length-1; j>0; j--) {
			swap(arr, 0, j);
			adjust(arr, 0, j);
		}
	}
	
	public static void adjust(int arr[], int i, int length) {
		//从i的左子节点开始，左结点 = 2k+1
		for(int k=2*i+1; k<length; k= k*2 +1) {
			//如果左子结点小于右边子结点，k指向右子结点
			if(k+1<length && arr[k]<arr[k+1]) {
				k++;
			}
			if(arr[k]>arr[i]) {
				swap(arr, i, k);
				i=k;
			}
		}
	}

    public static void swap(int []arr,int a ,int b){
        int temp=arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

}
