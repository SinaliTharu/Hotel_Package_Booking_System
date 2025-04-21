package HotelReg;

import java.util.Scanner;

public class UserCardDetails {

    public static void CollectCardDetails(Scanner scan){

        String CardNumber;
        String ExpiryDate;
        String Cvv;

        while (true) {
            System.out.println("Enter Card Holder Name: ");
            String CardHolderName= scan.nextLine();

            if (CardHolderName.matches("[a-zA-Z\\s]+")) {
                break;
            } else {
                System.out.println("Invalid name. Please enter your CardHolder Name containing only letters and spaces.");
            }
        }


        while (true) {
            System.out.println("Enter the 16 digit card Number without spaces (only digits): ");
            CardNumber = scan.nextLine();

            if (CardNumber.matches("\\d{16}")) {
            break;
            } else {
                System.out.println("Invalid Card Number. Please enter again");
            }

        }


        while (true) {
            System.out.println("Enter the Expiry Date in format (MM/YY)(eg: 02/27): ");
            ExpiryDate = scan.nextLine();

            if (ExpiryDate.matches("(0[1-9]|1[0-2])/\\d{2}")) {
            break;
            } else {
                System.out.println("Invalid Expiry Date. Please enter again");
            }
        }

        while (true) {
            System.out.println("Enter the cvv: ");
            Cvv = scan.nextLine();

            if (Cvv.matches("\\d{3}")) {
                break;
            } else {
                System.out.println("Invalid cvv. Please enter again");
            }

        }

        System.out.println("Card Details Collected Successfully.");
        System.out.println("Booking............");

    }
}
