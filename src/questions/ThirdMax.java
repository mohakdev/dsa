package questions;

import java.util.Arrays;

public class ThirdMax {
    public static void main(String[] args) {
        int[] arr = {3, 2, 1};
        System.out.println(ThirdMaximum(arr));
    }

    static int ThirdMaximum(int[] arr) {
        if (arr.length < 3) {
            return arr[FindMaxIndex(arr, arr.length)];
        }
        //Selection Sort
        for (int i = 0; i < arr.length; i++) {
            int end = arr.length - i - 1;
            int maxIndex = FindMaxIndex(arr, end);
            //Swap
            int temp = arr[end];
            arr[end] = arr[maxIndex];
            arr[maxIndex] = temp;
        }
        System.out.println(Arrays.toString(arr));
        return arr[arr.length - 3];
    }

    static int FindMaxIndex(int[] arr, int end) {
        int maxIndex = 0;
        for (int j = 0; j <= end; j++) {
            if (arr[j] > arr[maxIndex]) {
                maxIndex = j;
            }
        }
        return maxIndex;
    }
}
