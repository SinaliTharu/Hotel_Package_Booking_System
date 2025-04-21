package HotelReg;
import java.util.Scanner;

public class UserPayment {
    static final int FamilyPackage = 50000;
    static final int CouplePackage = 20000;
    static final int SinglePackage = 15000;
    static final int DayOutPackage = 3500;
    static final int AcRoom = 8000;
    static final int NonAcRoom = 4000;
    public static double totalAmount =0;
    public static String selectedPackage = "";

    //If number 4 selected, asking whether they want a room or not
    public static double dayOutRoomChoice(Scanner scan) {
        double roomCost = 0;

        while (true) {
            try {
                System.out.print("Do you want a room? (yes - enter 1 / no - enter 0): ");
                String roomChoice = scan.nextLine();

                if (roomChoice.equals("1")) {
                    while (true) {
                        System.out.print("A/C (1) or Non A/C (2): ");
                        String type = scan.nextLine();

                        if (type.equals("1")) {
                            roomCost += AcRoom;
                            break;
                        } else if (type.equals("2")) {
                            roomCost += NonAcRoom;
                            break;
                        } else {
                            System.out.println("Invalid input. Please enter 1 for A/C or 2 for Non A/C.");
                        }
                    }
                } else if (roomChoice.equals("0")) {
                    break;
                } else {
                    System.out.println("Invalid input. Please enter 1 (for yes) or 0 (for no).");
                    continue;
                }

                break; // exit after valid selection
            } catch (Exception e) {
                System.out.println("Invalid input. Please try again.");
                scan.nextLine(); // clear the input buffer
            }
        }

        return roomCost;
    }


    //Calculate Total amount
    public static void calculateTotalAmount(int packNum, Scanner scan) {

        // Get the package number
        System.out.println("1.Family Package");
        System.out.println("2.Couple Package");
        System.out.println("3.Single Package");
        System.out.println("4.Day out Package");

        while (true) {
            try {
                System.out.print("Enter the number of the package you selected (1-4): ");
                packNum = scan.nextInt();

                if (packNum < 1 || packNum > 4) {
                    System.out.println("Invalid package number. Please enter a number between 1 and 4.");
                    continue;
                }

                switch (packNum) {
                    case 1 -> {
                        totalAmount = FamilyPackage;
                        selectedPackage = "Family Package (Rs.50,000)";
                    }

                    case 2 -> {
                        totalAmount = CouplePackage;
                        selectedPackage = "Couple Package (Rs.20,000)";
                    }
                    case 3 -> {
                        System.out.print("Enter number of people: ");
                        int peopleNum = scan.nextInt();
                        scan.nextLine();
                        totalAmount = SinglePackage * peopleNum;
                        selectedPackage = "Single Package (Rs.15,000 per person)";
                    }
                    case 4 -> {
                        System.out.print("Enter number of people: ");
                        int peopleNum = scan.nextInt();
                        scan.nextLine();
                        totalAmount = DayOutPackage * peopleNum;
                        totalAmount += dayOutRoomChoice(scan);
                        selectedPackage = "Day Out Package (Rs.3,500 per person)";
                    }
                    default -> {
                        System.out.println("Invalid package number.");
                    }
                }

                break;
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a number.");
                scan.nextLine();
            }
        }

        System.out.println("Total Amount: Rs." + totalAmount);
    }
}

