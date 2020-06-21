package concurrency;

/*
2 Efficient ways to create lazy-loaded singleton:
1. Through a holder class that initializes a final instance
2. Through an enum
 */

public class Singleton_DoubleChecked {

    //adding "static" makes it Singleton.
    private static volatile Furniture f = null; // volatile is to not let JVM reorder operations.

    public Furniture getPurchasedFurniture(){
        //This is Double Check Locking
        if (f==null){ // 1st check
            synchronized (this){
                if (f==null){ // 2nd check
                    f = new Furniture();
                }
            }
        }
        return f;
    }

    class Furniture{
        String type;
        int cost;

        public Furniture(){}
        public Furniture(String type, int cost) {
            this.type = type;
            this.cost = cost;
        }
    }
}
