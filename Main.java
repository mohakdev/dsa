
public class Main {
    public static void main(String[] args) {
        int number = 6;
        boolean check = checkPerfectNumber(number);
        System.out.println(check);
    }

    public static boolean checkPerfectNumber(int num) {
        int i = 1;
        int counter = 0;
        while(i <= num / 2) {
            if(num%i == 0) {counter += i;}
            i++;
        }
        return counter == num;
    }
}