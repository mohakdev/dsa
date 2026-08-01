package questions;

import java.util.Scanner;

public class VIP {

    public static void main(String[] args) {
        System.out.println("Enter customer ID - ");
        Scanner sc = new Scanner(System.in);
        String id = sc.nextLine();
        if (id.startsWith("VIP")) {
            System.out.println("VIP CUSTOMER");
        } else {
            System.out.println("REGULAR CUSTOMER");
        }
    }
}
