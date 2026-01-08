package questions;

import java.util.Arrays;

public class FindAllMissing {

    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 7, 8, 2, 3, 1};
        sort(arr);
        System.out.println(Arrays.toString(arr));
        int[] output = new int[arr.length];
        int count = 0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j + 1) {
                output[count] = j + 1;
                System.out.println(output[count]);
                count++;
            }
        }
    }

    static void sort(int arr[]) {
        int pointer = 0;
        while (pointer < arr.length) {
            int correctIndex = arr[pointer] - 1;

            if (arr[pointer] != arr[correctIndex]) {
                // swap
                int temp = arr[pointer];
                arr[pointer] = arr[correctIndex];
                arr[correctIndex] = temp;
            } else {
                // move ahead only when no swap is needed
                pointer++;
            }
        }
    }
}
