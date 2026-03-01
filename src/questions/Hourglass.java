package questions;

public class Hourglass {

    public static void main(String[] args) {
        int n = 6; //Please keep N even for hourglass
        for (int l = 0; l < n; l++) //for all lines
        {
            // Calculate distance from the edge (both top and bottom)
            int distance = l < n / 2 ? l : n - 1 - l;

            for (int s = 0; s < distance; s++) {
                System.out.print(" ");
            }
            for (int c = (n / 2) - 1 - distance; c >= 0; c--) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
