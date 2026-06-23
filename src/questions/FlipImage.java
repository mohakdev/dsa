package questions;

public class FlipImage {

    public static void main(String[] args) {
        int[][] image = {{1, 1, 0}, {1, 0, 1}, {0, 0, 0}};
        PrintArray(flipAndInvertImage(image));
    }

    public static void PrintArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int elem : arr[i]) {
                System.out.print(elem + ",");
            }
            System.out.println();
        }
    }

    public static int[][] flipAndInvertImage(int[][] image) {
        int size = image.length;
        for (int i = 0; i < size; i++) {
            int[] inverted = new int[size];
            for (int j = 0; j < size; j++) {
                //Flip the image
                inverted[j] = image[i][size - 1 - j];
                //Invert the image
                inverted[j] = inverted[j] == 0 ? 1 : 0;
            }
            image[i] = inverted;
        }
        return image;
    }
}
