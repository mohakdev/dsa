
public class Main {
    public static void main(String[] args) {
        int[] array = {2,1,0,-10};

        int[] sorted = SelectionSort.Sort(array);
        Helper.PrintArray(sorted);
    }
}