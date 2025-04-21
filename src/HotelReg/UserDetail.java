package HotelReg;
import java.util.Scanner;
public class UserDetail {

    public static String BookingDate;
    public static String name;
    private String ID;

    //Method to access private variable
    public void setID( String NIC){
        // private field can be accessed
        ID= NIC;
    }

    public String getID(){
        return ID; //return the private field
    }


    public static void CollectUserDetails() {

        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Enter your Full Name: ");
            name = scan.nextLine();

            if (name.matches("[a-zA-Z\\s]+")) {
                break;
            } else {
                System.out.println("Invalid name. Please enter your Full Name containing only letters and spaces.");
            }
        }

        System.out.println("Enter your email address: ");
        String email = scan.nextLine();

        String phoneNum;
        while (true) {
            System.out.println("Enter your phone number: ");
            phoneNum = scan.nextLine();

            if (phoneNum.matches("[0-9]+")) {
                break;
            } else {
                System.out.println("Invalid phone number.Please enter only digits");
            }
        }


        System.out.println("Enter your NIC Number: ");
        String NIC = scan.nextLine();

        System.out.println("Enter your Home address: ");
        String address = scan.nextLine();

        while (true) {

            System.out.print("Enter the Date of Booking in the format (DD/MM): ");
            BookingDate = scan.nextLine();

            if (BookingDate.matches("(0[1-9]|1[0-9]|2[0-9]|3[0-1])/\\d{2}")) {
                break;
            } else {
                System.out.println("Invalid Booking Date. Please enter again in the format (DD/MM)");
            }
        }


        System.out.println("User Details Collected Successfully!");


        System.out.println("Full Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Phone Number: " + phoneNum);
        System.out.println("NIC Number: " + NIC);
        System.out.println("Address: " + address);
        System.out.println("Booking Date: " + BookingDate);
    }

}
