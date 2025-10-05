public class BubbleSort {
    public static int[] Sort(int[] arr) {
        boolean didSwap = false;
        // run the steps N-1
        for (int i = 0; i < arr.length; i++) {
            // for each step, max item will come at last so we
            // ignore that part every iteration
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j - 1] > arr[j]) // Swap if not in order
                {
                    // Basically swapping use temp variable
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                    didSwap = true;
                }
            }
            if(!didSwap) {break;}
        }
        return arr;
    }
}
