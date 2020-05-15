package practical;

/**
 * @author Zakir Hossain
 * October 3, 2019
 * 			This program instantiate some objects and tests the 'GlassClass' class object.
 *
 */
public class TestGlass {
    public static void main(String[] args) {
        Glass CoffeeMug = new Glass(40);
        Glass IcedTea = new Glass(30);
        Glass WaterBottle = new Glass(56);

        CoffeeMug.setOunceInGlass(15);
        IcedTea.setOunceInGlass(11);
        WaterBottle.setOunceInGlass(19);

        CoffeeMug.setTempState("Cold");
        IcedTea.setTempState("Cold");
        WaterBottle.setTempState("Hot");

        System.out.println("Coffee mug:"+ "\n"+ CoffeeMug +"\n");
        System.out.println("Iced tea:"+ "\n"+ IcedTea+"\n");
        System.out.println("Water bottle:"+ "\n"+ WaterBottle +"\n\n\n");

        CoffeeMug.drinkFromGlass(10);
        CoffeeMug.gethasLid();  // Stating that the coffee mug has lid

        IcedTea.drinkFromGlass(10);

        WaterBottle.drinkFromGlass(20);   // This will set the current liquid volume to 0 because
        // 20 is greater than the value given to object during the instantiation, which is 19.
        WaterBottle.gethasLid();

        System.out.println("Coffee mug:"+ "\n" + CoffeeMug+"\n");
        System.out.println("Iced tea:"+ "\n" + IcedTea+"\n");
        System.out.println("Water bottle:"+ "\n" + WaterBottle +"\n");




        // comparing the two objects created above.


            if(CoffeeMug.equals(IcedTea)) {
                System.out.println("Coffee mug and the Iced Tea mug are same. ");
            }
            else {
                System.out.println("Coffee mug and the Iced Tea mug are not same. ");
            }

    }
}
