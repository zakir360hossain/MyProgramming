public class TestDessert {
    public static void main(String[] args) {
        Dessert pie = new Dessert(4000, 8, 15.50);
//        System.out.println("Pie" + pie);

        Cake round = new Cake(3000, 12, 12.25, "Vanilla", 2);
        System.out.println("Round Cake: "+ round);
//        System.out.println(round.costPerServing());

        ShowerCake boy = new ShowerCake(3000, 12, 12.00, "Chocolate", 2,
                "Congrats!","Boy");
        System.out.println(boy);
        System.out.println(boy.costPerServing());

    }
}
