package selectionsort;

public class InsertionSort {

	public static void insertionSort(int[] array) {  
	    for (int i = 1; i < array.length; i++) {
	        int current = array[i];
	        int j = i - 1;
	        while(j >= 0 && current < array[j]) {
	            array[j+1] = array[j];
	            j--;
	        }
	        array[j+1] = current;
	    }
	}
	
	 public static void main(String[] args) {
	        //initialize
	        int[] input = {10, 8, 1, 88, 64, 21, 19, 4, 3, 2};

	        
	        System.out.println("sorting");
	        //sort
	        insertionSort(input);

	        for (int i : input) {
				System.out.println(i);
			}
	        //print
	        
	    }
}
