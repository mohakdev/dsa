import sorting.CyclicSort;

public class Main {
    public static void main(String[] args) {
        int[] array = {5,4,3,2,1};

        int[] sorted = CyclicSort.Sort(array);
        Helper.PrintArray(sorted);
    }
}