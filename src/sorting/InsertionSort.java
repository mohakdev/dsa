package sorting;

public class InsertionSort {
    public static int[] Sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i+1; j > 0; j--) {
                if(arr[j] < arr[j-1]) //swap items
                {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
                else {
                    //if arr[j] > arr[j-1] then that means all
                    //prev elements are already sorted
                    break; 
                }
            }
        }
        return arr;
    }
}
