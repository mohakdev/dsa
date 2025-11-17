package sorting;
public class CyclicSort {
    public static int[] Sort(int[] arr) {
        int pointer = 0;
        while(pointer < arr.length) {
            int value = arr[pointer];
            if(pointer == value - 1) {
                pointer++; continue;
            }
            //Swap elements with their correct indexes
            int temp = arr[value-1];
            arr[value - 1] = arr[pointer];
            arr[pointer] = temp; 
        }
        return arr;
    }
}