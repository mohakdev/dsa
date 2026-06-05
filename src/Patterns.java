
import java.util.Scanner;

public class Patterns {

    static void PascalTriangle(int n) {
        for (int row = 0; row < n; row++) {
            //one for loop just for spaces
            for (int space = n - row; space > 0; space--) {
                System.out.print(" ");
            }

            int t = 1;
            for (int col = 0; col <= row; col++) {
                System.out.print(t + " ");
                t = t * (row - col) / (col + 1);
            }
            System.out.println();
        }
    }

    static void TriangleFusion(int n) {
        int no = 0;
        for (int i = 0; i < n; i++) {
            //For spaces
            for (int s = 0; s < i; s++) {
                System.out.print("  ");
            }

            int total = n * (n + 1);
            for (int j = 1; j <= 2 * (n - i); j++) {
                if (j <= n - i) {
                    no++;
                    System.out.print(no + " ");
                } else {
                    System.out.print((total - no + (j - (n - i))) + " ");
                }
            }
            System.out.println();
        }
    }

    static void NumberSquare(int n) {
        for (int row = 0; row < 2 * n - 1; row++) {
            for (int col = 0; col < 2 * n - 1; col++) {
                int smallest = Math.min(Math.min(row, col), Math.min(2 * n - 2 - row, 2 * n - 2 - col));
                System.out.print(n - smallest);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        NumberSquare(n);
    }
}
