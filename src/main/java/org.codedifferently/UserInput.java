package org.codedifferently;

import java.util.Scanner;

public class UserInput {

    public String firstName;
    public String lastName;
    public double budget;
    public String couponCode;

    public void promptUserName() {
        System.out.println("Welcome to the Budget Calculator!");
        System.out.println("What is your first name?");
        Scanner scan = new Scanner(System.in);

        firstName = scan.next();
        System.out.println("What is your last name?");
        lastName = scan.next();
    }

    public void promptUserBudget() {
        System.out.println("Okay.., what's your budget lookin' like today?:");
        Scanner scan = new Scanner(System.in);

        budget = scan.nextDouble();
    }

    public void promptCouponCode() {
        System.out.println("Alrighty.. put in your coupon code:");
        Scanner scan = new Scanner(System.in);
        couponCode = scan.next();
    }

}
