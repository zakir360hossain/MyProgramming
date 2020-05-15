package practical;

/**
 * @author Zakir Hossain
 * Feb 14, 2020
 * This is the main class to create to instances for certain child classes, that extends to
 * their parent class. Some classes are multilevel inheritance.
 */

public class TestDessert {
    public static void main(String[] args) {
        Dessert pie = new Dessert(4000, 8, 15.50);
       System.out.println("practical.Pie" + pie);

        Cake round = new Cake(3000, 12, 12.25, "Vanilla", 2);
        System.out.println("Round practical.Cake: "+ round);
//        System.out.println(round.costPerServing());

        ShowerCake boy = new ShowerCake(3000, 12, 12.00, "Chocolate", 2,
                "Congrats!",2);
        System.out.println(boy);
        System.out.println(boy.costPerServing());

        // Birthday practical.Cake objects
        BirthdayCake bCake = new BirthdayCake(5000, 10, 20, "practical.Banana", 4,
                17, "Happy Birthday Michael!");
        System.out.println(bCake);
        System.out.println(bCake.costPerServing());

    }
}
