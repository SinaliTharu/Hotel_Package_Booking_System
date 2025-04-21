package HotelReg;
import java.util.Scanner;

public class HotelPackageBooking{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        // Display Hotel name
        UserRegister.HotelName();

        // Package Display and User register
        UserRegister.PackageDisplay();
        UserRegister.Register();

        // Calls UserDetail class
        UserDetail.CollectUserDetails();

        // Call UserPayment class to calculate total amount
        int packNum = 0;
        UserPayment.calculateTotalAmount(packNum, scan);

        // Call PaymentGateway
        UserCardDetails.CollectCardDetails(scan);

        // Display Final Message
        System.out.println("\nBooking Successful!");
        System.out.println("Name: " + UserDetail.name);
        System.out.println("Package: " +UserPayment.selectedPackage);
        System.out.println("Total Price: Rs. " + UserPayment.totalAmount);
        System.out.println("Booking Date: " + UserDetail.BookingDate);

        System.out.println("Thank You!");

        scan.close();
    }
}

