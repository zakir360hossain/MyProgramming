/**
 * @author Zakir Hossain
 * December 9, 2019
 * This is the test of the class Chair. It instantiates 5 instances of chair objects with data. Calls certain methods
 * from the class and computes values.
 */
public class TestChair {
    public static void main(String[] args) {
        Chair[] HHSChairs = new Chair[5];

        HHSChairs[0] = new Chair(900, "Ottoman", 3);
        HHSChairs[1] = new Chair(30.60, "Recliner", 6);
        HHSChairs[2] = new Chair(700.90, "Cubicle", 1);
        HHSChairs[3] = new Chair(290.30, "Windsor", 4);
        HHSChairs[4] = new Chair(600, "Folding", 6);

        double total = 0;
        for (int i = 0; i < HHSChairs.length; i++) {
            total += HHSChairs[i].getCost();
        }
        System.out.println("Total cost of all chairs: $" + total + "\n");

        System.out.println("Chair Type: \t\t\t Resale Cost:");
        int deskCounter = 0;
        for (Chair elem : HHSChairs) {
            System.out.println(elem.getType() + "\t\t\t\t" + elem.reSale());
            if (elem.getType().equalsIgnoreCase("Desk")) {
                deskCounter += 1;
            }
        }

        System.out.println("\n");
        for (Chair elem : HHSChairs) {
            System.out.println(elem.toString());
        }

        System.out.println("\n");
        System.out.println("There are " + deskCounter + " 'Desk' type chairs out of all");

        System.out.println("\n");
        System.out.println(HHSChairs[2].compareTo(HHSChairs[4]));

    }
}
