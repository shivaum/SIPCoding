import java.util.Arrays;

public class HW6 {
	public static void main(String[] args) {
		int[] arr = {1, 10, 11, 12, 15};
		System.out.println(secondSmallest(arr));
		System.out.println(Arrays.toString(bubbleSort(arr)));
	}

	public static int secondSmallest(int[] arr) {
		int smallest = Integer.MAX_VALUE; // maximum integer value
		int secondSmallest = Integer.MAX_VALUE; // maximum integer value
		for (int num: arr) {
			if (num < smallest) {
				secondSmallest = smallest;
				smallest = num;
			}
			else if (num < secondSmallest && num != smallest) {
				secondSmallest = num;
			}
		}
		return secondSmallest;
	}

	public static int[] bubbleSort(int[] a) {
	    boolean sorted = false;
	    int temp;
	    while(sorted != true) {
	        sorted = true;
	        for (int i = 0; i < a.length - 1; i++) {
	            if (a[i] > a[i+1]) {
	                temp = a[i];
	                a[i] = a[i+1];
	                a[i+1] = temp;
	                sorted = false;
	            }
	        }
    	}
    	return a;
	}


}