package practical;

/**
 * @author Zakir Hossain
 * Feb 22, 2020
 * This is the main class to test the practical.Edible interface with many impementations from this interface.
 */
public class RunEdible {
    public static void main(String[] args) {

        System.out.println("==================practical.Breakfast================\n");
        Breakfast BobsBreakfast = new Breakfast();

        // Foods to be eaten
        Apple redApple = new Apple("Fruit-Cortland", 70, 25);
        Yogurt blueberry = new Yogurt("Dairy-blueberry", 140, 9, 14);
        Cereal bowl = new Cereal("practical.Breakfast Food", 110, 50, 10);

        // Eating
        BobsBreakfast.eat(redApple, 2);
        BobsBreakfast.eat(blueberry, 1);
        BobsBreakfast.eat(bowl, 1);
        double breakfastCalories = BobsBreakfast.getMyTotalCalories();
        System.out.println(redApple + "\n");
        System.out.println(blueberry + "\n");
        System.out.println(bowl + "\n");
        System.out.println("\nTotal practical.Breakfast Calories:    "+breakfastCalories+ "\n\n");




        System.out.println("==================practical.Lunch==================\n");
        Lunch BobsLunch = new Lunch();

        // Foods to be eaten.
        Corn yellowCorn = new Corn("Plants-Maize", 80, 20);
        RoastBeef rb = new RoastBeef("Sandwich", "Brisket", "Rye", 300, 90,68);
        Pie creamPie = new Pie("practical.Dessert", "practical.Banana", 670, 200);
        Apple ambrosialApple = new Apple("Fruit-Ambrosia", 68, 30);

        // Eating
        BobsLunch.eat(yellowCorn, 2);
        BobsLunch.eat(rb, 1);
        BobsLunch.eat(creamPie, 1);
        BobsLunch.eat(ambrosialApple, 2);
        double lunchCalories = BobsLunch.getMyTotalCalories();
        System.out.println(yellowCorn + "\n");
        System.out.println(rb + "\n");
        System.out.println(creamPie + "\n");
        System.out.println(ambrosialApple + "\n");
        System.out.println("\nTotal practical.Lunch Calories:    "+lunchCalories + "\n\n");




         System.out.println("==================practical.Dinner==================\n");
        Dinner BobsDinner = new Dinner();

        // Food to be eaten
        Pasta pastaDish = new Pasta("Spaghettini", "Tomato sauce", 280, 38);
        Yogurt strawberry = new Yogurt("Dairy-strawberry", 10, 7, 1);
        Banana banana = new Banana("Fruit -  Musa Acuminata", 80, 31, 446);

        // Eating
        BobsDinner.eat(pastaDish, 1);
        BobsDinner.eat(strawberry, 10);
        BobsDinner.eat(banana, 2);
        System.out.println(pastaDish + "\n");
        System.out.println(strawberry + "\n");
        System.out.println(banana + "\n");
        double dinnerCalories = BobsDinner.getMyTotalCalories();

        System.out.println("\nTotal practical.Lunch Calories:    "+dinnerCalories+"\n\n");

        double dayCalories = breakfastCalories+lunchCalories+dinnerCalories;
        System.out.println("Calories for the entire day:     "+dayCalories);




    }
}
