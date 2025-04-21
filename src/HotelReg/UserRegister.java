package HotelReg;

import java.util.Scanner;

public class UserRegister {
    public static void HotelName() {
        System.out.println("Welcome to Aura Hotel");
    }

    public static void PackageDisplay() {


        System.out.println("""
                1.Family Package(1 day)(6 people)- Rs.50,000
                \t(Morning 10:00 a.m to Next day Morning 9:00 a.m)
                \t\ti.Welcome Drink
                \t\tii.Lunch Buffet
                \t\tiii.Non-A/C Room
                \t\tiv.Pool Access
                \t\tv.High tea platter(serves 2 people)
                \t\tvi.Breakfast Buffet
                """);

        System.out.println("""
                2.Couple Package(1 day)(2 people)- Rs.20,000
                \t(Morning 10:00 a.m to Next day Morning 9:00 a.m)
                \t\ti.Welcome Drink
                \t\tii.Lunch Buffet
                \t\tiii.A/C Room
                \t\tiv.Pool Access
                \t\tv.High tea platter(serves 2 people)
                \t\tvi.Breakfast Buffet
                """);

        System.out.println("""
                3.Single Package(1 day)(per person)- Rs.15,000
                \t(Morning 10:00 a.m to Next day Morning 9:00 a.m)
                \t\ti.Welcome Drink
                \t\tii.Lunch Buffet
                \t\tiii.A/C Room
                \t\tiv.Pool Access
                \t\tv.Evening Refreshment
                \t\tvi.Breakfast Buffet
                """);

        System.out.println("""
                4.Day out Package(per person)- Rs.3,500
                \t(Morning 9:00 a.m to Evening 5:00 p.m)
                \t\ti.Welcome Drink
                \t\tii.Lunch Buffet
                \t\tiv.Pool Access
                \t\tv.Evening Refreshment
                \tIf you want you can have a A/c or Non A/c room for extra charge:
                \t\tA/c Room- Rs.8,000
                \t\tNon- A/c Room- Rs.4,000\s
                """);
    }

    public static void Register() {
        Scanner scan = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("Enter 1 to Book and 2 to Exit:");
                String input = scan.nextLine();
                int userOpt = Integer.parseInt(input);

                if (userOpt == 1) {
                    HotelName();
                    System.out.println("Processing....");
                    break; // proceed
                } else if (userOpt == 2) {
                    System.out.println("Exiting...");
                    System.exit(0); // exits the entire program
                } else {
                    System.out.println("Invalid option. Please enter 1 or 2.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a numeric value (1 or 2).");
            }
        }

        System.out.println("Enter your username:");
        String username = scan.nextLine();

        System.out.println("Welcome " + username + "!");

        // Display packages
        System.out.println("1. Family Package");
        System.out.println("2. Couple Package");
        System.out.println("3. Single Package");
        System.out.println("4. Day Out Package");

        int packNum = 0;
        boolean validInput = false;

        while (!validInput) {
            System.out.println("Enter the number of the package you selected (1, 2, 3, or 4):");
            try {
                String packageInput = scan.nextLine(); // use nextLine to safely parse
                packNum = Integer.parseInt(packageInput);
                if (packNum >= 1 && packNum <= 4) {
                    validInput = true;
                } else {
                    System.out.println("Invalid number. Please enter a number between 1 and 4.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number between 1 and 4.");
            }
        }

        // Confirm package selection
        String selectedPackage = switch (packNum) {
            case 1 -> "Family Package (Rs.50,000)";
            case 2 -> "Couple Package (Rs.20,000)";
            case 3 -> "Single Package (Rs.15,000)";
            case 4 -> "Day Out Package (Rs.3,500)";
            default -> "Unknown Package"; // this will never occur
        };

        System.out.println("You have selected: " + selectedPackage);
    }

}
