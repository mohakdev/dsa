package questions;

public class BitProblem {

    public static void main(String[] args) {
        int[] arr = {2, 2, 3, 2, 7, 7, 8, 7, 8, 8};
        //int occurance = 3;
        int ans = 0;

        for (int x : arr) {
            ans += Integer.parseInt(Integer.toBinaryString(x));
        }
        String output = Integer.toString(ans);
        String fin = "";
        for (int i =0; i < output.length(); i++) {
            fin += Integer.toString((output.charAt(i) - '0') % 3);
        }
        System.out.println(Integer.parseInt(fin, 2));
    }
}
