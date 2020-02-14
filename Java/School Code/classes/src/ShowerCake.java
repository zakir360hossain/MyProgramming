public class ShowerCake extends Cake {

    private String text; // What's to be written on the cake.
    private String indicator; // girl, boy, unknown, wedding.
    public ShowerCake(int calories, int numServing, double cost, String flavor, int layers, String text, String indicator) {
        super(calories, numServing, cost, flavor, layers);
        this.text = text;
        this.indicator = indicator;


    }
    /*
    There is an additional $8.5 for writing on the cake
     */
    public double costPerServing(){
        return super.costPerServing() + 8.50/super.getNumServing();
    }
    public String toString(){
        String type = "Boy";
        if(indicator.equalsIgnoreCase("boy")){
            type = "Boy";
        }
        else if(indicator.equalsIgnoreCase("baby")){
            type = "Baby";
        }
        else if(indicator.equalsIgnoreCase("wedding")){
            type = "wedding";
        }

        return "nText: "+text+ "\nShower: "+type+ super.toString();
    }
}
