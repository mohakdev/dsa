package questions;

import java.util.Arrays;

public class PlusOne {

    public static void main(String[] args) {
        int[] digits = {9, 8, 9};
        System.out.println(Arrays.toString(plusOne(digits)));
    }

    static int[] plusOne(int[] digits) {
        int n = digits.length;
        boolean allNines = true;
        for (int num : digits) {
            if (num != 9) {
                allNines = false;
            }
        }
        //If all 9's then we overflow
        if (allNines) {
            int[] ans = new int[n + 1];
            ans[0] = 1;
            for (int i = 1; i < n; i++) {
                ans[i] = 0;
            }
            return ans;
        } //If last digit is 9
        else if (digits[n - 1] == 9) {
            int i = n - 1;
            while (i > 0) {
                if (digits[i] == 9) {
                    digits[i] = 0;
                }
                else {break;}
                i--;
            }
            digits[i] += 1;
        } else {
            //Normal cases
            digits[n - 1] += 1;
        }
        return digits;
    }
}
