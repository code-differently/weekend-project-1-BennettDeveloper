package org.codedifferently;

public class StringLogic {

    public String generateReceiptCode(String firstName, String lastName) {

        String firstNameTruncate = (firstName.length() > 3) ? firstName.substring(0,3) : firstName;
        String lastNameTruncate = (lastName.length() > 3) ? lastName.substring(0,3) : lastName;
        String nameTruncated = firstNameTruncate + lastNameTruncate;

        MathCalc matchCalc = new MathCalc();
        int randomNum = matchCalc.generateRandomID(10,100);
        return nameTruncated + randomNum;
    }
}
