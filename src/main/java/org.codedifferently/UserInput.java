package org.codedifferently;

import java.util.Scanner;

public class UserInput {

    public String promptUserName(boolean isFirstName) {
        System.out.println("Welcome to the Budget Calculator!");
        System.out.println((isFirstName) ? "What is your first name?" : "What is your last name?");
        Scanner scan = new Scanner(System.in);

        return scan.next();
    }

    public double promptUserBudget() {
        System.out.println("Okay.., what's your budget lookin' like today?:");
        Scanner scan = new Scanner(System.in);

        return scan.nextDouble();
    }

    public String promptCouponCode() {
        System.out.println("Alrighty.. put in your coupon code:");
        Scanner scan = new Scanner(System.in);
        return scan.next();
    }

}
