package questions;

public class MissingNumber {

    public static void main(String[] args) {
        int[] arr = {1, 0, 3};
        System.out.println(approach3(arr));
    }

    public static int approach3(int[] arr) {
        int pointer = 0;
        while (pointer < arr.length) {
            //If element is at correct position or element is N then skip and move forward
            if (arr[pointer] == pointer || arr[pointer] == arr.length) {
                pointer++;
                continue;
            }
            int value = arr[pointer];
            arr[pointer] = arr[value];
            arr[value] = value;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i) {
                return i;
            }
        }
        return arr[arr.length - 1];
    }

    public static int approach1(int arr[]) {
        int supposedSum = 0, currentSum = 0;
        for (int n : arr) {
            currentSum += n;
        }
        for (int i = 0; i <= arr.length; i++) {
            supposedSum += i;
        }
        return supposedSum - currentSum;
    }

    public static int approach2(int arr[]) {
        int i = 0;
        while (i < arr.length) {
            if (arr[i] >= arr.length) {
                i++;
                continue;
            }
            if (arr[i] != i) {
                int correctIndex = arr[i];
                int temp = arr[correctIndex];
                arr[correctIndex] = arr[i];
                arr[i] = temp;
            } else {
                i++;
            }
        }
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j) {
                return j;
            }
        }
        return -1;
    }
}
