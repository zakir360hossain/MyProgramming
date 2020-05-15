package practical;

public class Cake extends Dessert {
    private  String flavor;
    private int layers;

    public Cake(int calories, int numServing, double cost, String flavor, int layers) {
        super(calories, numServing, cost);
        this.flavor = flavor;
        this.layers = layers;
    }

    /*
    If the number of layer in the cake is greater than or equal to 2, then the price increases by 20%
     */
    public double costPerServing(){
        if(layers>=2){
            return super.costPerServing()*1.2;
        }
        else {
            return super.costPerServing();
        }

    }


    public String toString() {
        return "\npractical.Cake: "+ flavor + "\nNumber of Layers"+layers+ super.toString();
    }
}
