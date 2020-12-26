package array;

/**
 * @author Zakir Hossain
 * December 9, 2019
 * This is the test of the class Chair. It instantiates 5 instances of chair objects with data. Calls certain methods
 * from the class and computes values.
 */
public class TestChair {
    public static void main(String[] args) {
        Chair[] HHSChairs = new Chair[5];

        // Th instantiation of 5 objects
        HHSChairs[0] = new Chair(900, "Ottoman", 3);
        HHSChairs[1] = new Chair(30.60, "Recliner", 6);
        HHSChairs[2] = new Chair(700.90, "Cubicle", 1);
        HHSChairs[3] = new Chair(290.30, "Windsor", 4);
        HHSChairs[4] = new Chair(600, "Folding", 6);

        // Accumulating the total costs of all chairs
        double total = 0;
        for (int i = 0; i < HHSChairs.length; i++) {
            total += HHSChairs[i].getCost();
        }
        System.out.println("Total cost of all chairs: $" + total + "\n");

        // Outputting the resale for each chair, including the chair type
        System.out.println("Chair Type: \t\t\t Resale Cost:");
        int deskCounter = 0;
        for (Chair each : HHSChairs) {
            System.out.println(each.getType() + "\t\t\t\t" + each.reSale());
            if (each.getType().equalsIgnoreCase("Desk")) {
                deskCounter += 1;
            }
        }

        // Outputting the 5 chairs, including the 3 attributes that are in each chair.
        System.out.println("\n");
        for (Chair each : HHSChairs) {
            System.out.println(each.toString());
        }

        // Calculating how many chairs are there with the type of desk
        System.out.println("\n");
        System.out.println("There are " + deskCounter + " 'Desk' type chairs out of all");


        System.out.println("\n");
        System.out.println(HHSChairs[2].compareCost(HHSChairs[4]));

    }
}
