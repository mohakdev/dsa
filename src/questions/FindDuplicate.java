package questions;

import java.util.Arrays;

public class FindDuplicate {

    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 2, 2};
        System.out.println(answer(arr));
    }

    static int answer(int[] arr) {
        int pointer = 0;
        while (pointer < arr.length) {
            int correctIndex = arr[pointer] - 1;
            //If not at the correct index then swap
            if (arr[pointer] != arr[correctIndex]) {
                // swap
                int temp = arr[pointer];
                arr[pointer] = arr[correctIndex];
                arr[correctIndex] = temp;
            } else {
                //move ahead only when no swap is needed
                pointer++;
            }
        }
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i + 1) {
                return arr[i];
            }
        }
        return arr.length;
    }
}
