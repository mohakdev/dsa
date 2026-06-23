package questions;

public class MagicNumber {

    public static void main(String[] args) {
        System.out.println(FindMagicNumber(4));
    }

    static int FindMagicNumber(int givenNo) {
        int multipleOf = 5;
        String binary = Integer.toBinaryString(givenNo);
        int ans = 0;

        for (int i = binary.length(); i > 0; i--) {
            ans += binary.charAt(binary.length() - i) == '1' ? Math.pow(multipleOf, i) : 0;
        }

        return ans;
    }
}
