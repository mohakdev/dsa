package questions;

public class RecursionBasic {

    public static void main(String[] args) {
        factorial(5,1);
    }

    static void nToOne(int n) {
        if (n == 0) {
            return;
        } //base case
        System.out.println(n);
        nToOne(n - 1); //recursive case
    }

    static void oneToN(int n) {
        if (n == 0) {
            return;
        } //base case
        oneToN(n - 1); //recursive case
        System.out.println(n);
    }

    static int factorial(int n,int res) {
        if (n == 1) {
            return res;
        }
        res *= n;
        return factorial(n-1,res);
    }
}
