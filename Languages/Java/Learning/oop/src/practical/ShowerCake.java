package practical;

public class ShowerCake extends Cake {

    private String text; // What's to be written on the cake.
    private int indicator; // girl=1, boy=2, unknown=3, wedding=4.
    public ShowerCake(int calories, int numServing, double cost, String flavor, int layers, String text, int indicator) {
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
        if(indicator==2){
            type = "Boy";
        }
        else if(indicator==1){
            type = "Girl";
        }
        else if(indicator==3){
            type = "Unknown";
        }
        else if(indicator==4){
            type = "Wedding";
        }

        return "nText: "+text+ "\nShower: "+type+ super.toString();
    }
}
