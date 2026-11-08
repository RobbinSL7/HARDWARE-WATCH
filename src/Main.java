import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;    // Require Imports Declared


public class Main {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        List<HardwareAsset> fleet = new ArrayList<>(); // Master Ledger Setup


            System.out.print("Welcome To Hardware-Watch");

            while (true) {
                System.out.print("Enter Asset Tag (Or Exit to finish) :");
                String tagInput = scnr.nextLine().trim();

                // Escape Hatch
                if(tagInput.equalsIgnoreCase("Exit")) {
                    System.out.print("Exiting Menu");
                    break;
                }

                // Intake Mode
                HardwareAsset item = new HardwareAsset();  // Outer Container Setup
                item.deviceState = new DeviceState();    // Inner Container Setup


                item.assetTag = tagInput;

                System.out.print("Enter The Asset Category:");
                 item.category = scnr.nextLine().trim();

                System.out.print("Enter the Asset Purchase Cost: ");
                 item.purchaseCost = scnr.nextLine().trim();

                System.out.print("Enter The Asset Status: ");
                item.deviceState.deploymentStatus = scnr.nextLine().trim();

                System.out.print("Enter The Assigned User: ");
                item.deviceState.assignedUser = scnr.nextLine().trim();

                fleet.add(item);
                System.out.println("Asset Successfully Logged");


                System.out.print("Would you like to add another? (Y/N)");
                String choice = scnr.nextLine().trim();

                if(choice.equalsIgnoreCase("N")) {
                    System.out.println("Exiting System,Thank You For Using Hardware-Watch!");


                    break;
                }


            }





    }
}