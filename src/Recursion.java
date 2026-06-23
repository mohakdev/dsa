
public class Recursion {

    public static void main(String[] args) {
        int[] arr = {1, 4, 9, 13, 17, 23, 26};
        int target = 23;
        int ans = FindElement(arr, target, 0, arr.length - 1);
        System.out.println(ans);
    }

    static int FindElement(int[] arr, int target, int start, int end) {
        //Element not found
        if (start > end) {
            return -1;
        }

        int mid = start + (end - start) / 2;
        //base case
        if (target == arr[mid]) {
            return mid;
        } //recursive case
        else if (target > arr[mid]) {
            start = mid + 1;
            return FindElement(arr, target, start, end);
        } else if (target < arr[mid]) {
            end = mid - 1;
            return FindElement(arr, target, start, end);
        }
        return 0;
    }
}
