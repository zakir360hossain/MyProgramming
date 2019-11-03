import java.util.*;


public class QuickSortingMethod {
	private static void QuickSort(int []arr, int left, int right){
		int index= partition(arr, left, right);
		if(left<index-1)
			QuickSort(arr, left, index);
		if(index<right)
			QuickSort(arr, index, right);
			
	}
	
	private static int partition(int[] arr, int left, int right) {
		int pivot=arr[(left+right)/2];
		while(left<=right){
			while(arr[left]<pivot)left++;
			while(arr[right]>pivot)right--;
			if(left<=right){
				int tmp=arr[left];
				arr[left]=arr[right];
				arr[right]=tmp;
				left++;
				right--;
			}
		}
		return left;
	}

	public static void main(String[] args){
	Random r=new Random();
        int[] ar1 = new int[2];
        for(int i = 0; i <  ar1.length; i++) {
            ar1[i] = r. nextInt(20);
            QuickSort(ar1, 0, ar1.length-1);
            System.out.print(ar1[i] + "  ");
        }
	}
}


