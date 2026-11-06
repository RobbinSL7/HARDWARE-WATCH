import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;    // Require Imports Declared


public class Main {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        List<HardwareAsset> fleet = new ArrayList<>(); // Master Ledger Setup


            HardwareAsset item = new HardwareAsset();  // Outer Container Setup
            item.deviceState = new DeviceState();    // Inner Container Setup

            // Hardware Info Setup Test #1
            item.assetTag = "LAP-01";
            item.category = "CIL";
            item.purchaseCost = "$100.00";
                                                                       // Item Test #1
            // State Info Setup Test #1
            item.deviceState.deploymentStatus = "Active";
            item.deviceState.assignedUser = "John Hammond";

             fleet.add(item);


            // Hardware Info Setup Test #2
            item.assetTag = "PHO-01";
            item.category = "CIP";
            item.purchaseCost = "$90.00";
                                                                // Item Test #2
            // State Info Setup Test #2
            item.deviceState.deploymentStatus = "Active";
            item.deviceState.assignedUser = "John Hammond";

            fleet.add(item);

         int totalAssets = fleet.size();

        System.out.println(totalAssets);











    }
}