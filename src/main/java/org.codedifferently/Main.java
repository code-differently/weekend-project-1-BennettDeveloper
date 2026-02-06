package org.codedifferently;

public class Main {

    static void main()
    {
        //Gather all User Info from UserInput class methods
        UserInput userInput = new UserInput();
        String firstName = userInput.promptUserName(true);
        String lastName = userInput.promptUserName(false);
        double budget = userInput.promptUserBudget();
        String couponCode = userInput.promptCouponCode();

        System.out.println("----------------------------");
        System.out.println("Welcome to Walmart!");

        MathCalc mathCalc = new MathCalc();
        int visitID = mathCalc.generateRandomID(1000,9999);
        System.out.println("Visit ID: " + visitID);

        StringLogic stringLogic = new StringLogic();
        String receiptCode = stringLogic.generateReceiptCode(firstName, lastName);
        System.out.println("Receipt Code: " + receiptCode);


    }
}
