package SelectionSort;

public class SelectionSort {
	
	public static void sort (long[] arr) {
		
		// k always points to the minimum number
		// k = index[minimumNumber]
		int k = 0;
		long tmp = 0;
		
		for (int i = 0; i < arr.length - 1; i++) {
			k = i;
			for (int j = i; j < arr.length; j++) {
				if (arr[j] < arr[i]) {
					k = j;
				}
			}
			tmp = arr[i];
			arr[i] = arr[k];
			arr[k] = tmp; 
		}
	}
}
