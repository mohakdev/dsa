package questions;

import java.util.Arrays;

public class FirstMissingPositive {

    public static void main(String[] args) {
        int[] arr = {1, 2, 0};
        int ans = optimised(arr);
        System.out.println(ans);
    }

    static int optimised(int[] arr) {
        int pointer = 0;
        while (pointer < arr.length) {
            int correctIndex = arr[pointer] - 1;
            if (arr[pointer] <= 0 || arr[pointer] > arr.length) {
                pointer++;
                continue;
            }
            if (arr[pointer] != arr[correctIndex]) {
                //swap
                int temp = arr[pointer];
                arr[pointer] = arr[correctIndex];
                arr[correctIndex] = temp;
            } else {
                pointer++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i + 1) {
                System.err.println(Arrays.toString(arr));
                return i + 1;
            }
        }
        return arr.length + 1;
    }

    static int bruteForce(int[] arr) {
        boolean present = false;
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == i) {
                    present = true;
                }
            }
            if (!present) {
                return i;
            }
            present = false;
        }
        return arr.length + 1;
    }
}
