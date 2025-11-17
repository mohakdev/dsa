package sorting;
public class SelectionSort {
    public static int[] Sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int end = arr.length - i - 1;
            int maxIndex = 0;
            //Find max in (0,end) search space
            for (int j = 0; j <= end; j++) {
                if(arr[j] > arr[maxIndex]) {
                    maxIndex = j;
                }
            }
            //Now after finding the max element swap it to the end index
            int temp = arr[maxIndex];
            arr[maxIndex] = arr[end];
            arr[end] = temp;
        }
        return arr;
    }
}
