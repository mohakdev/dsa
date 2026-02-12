package questions;

public class StringShuffle {

    public static void main(String[] args) {
        String test = "aiohn";
        int[] indices = {3, 1, 4, 2, 0};
        System.out.println(restoreString(test, indices));
    }

    //Only problem is this solution takes up extra space.
    public static String restoreString(String s, int[] indices) {
        char[] charArr = s.toCharArray();
        char[] answer = new char[charArr.length];

        for (int i = 0; i < charArr.length; i++) {
            answer[indices[i]] = charArr[i];
        }

        return new String(answer);
    }
}
