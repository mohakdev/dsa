public class Helper {
    public static void PrintArray(int[] arr) {
        for (int elem : arr) {
            if(elem == arr[arr.length - 1]) {
                System.err.print(elem);
                return;
            }
            System.out.print(elem + ",");
        }
    }
    public static void SwapElements(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
