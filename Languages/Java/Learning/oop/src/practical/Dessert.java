package practical;

public class Dessert {
    private int calories; // total calories in the dessert
    private int numServing;
    private double cost;

    public Dessert(int calories, int numServing, double cost){
        this.calories = calories;
        this.numServing = numServing;
        this.cost = cost;
    }

    public int getCalories() {
        return calories;
    }

    public int getNumServing() {
        return numServing;
    }

    public double getCost() {
        return cost;
    }

    public double costPerServing(){
        return cost/numServing;
    }
    public double calsPerServing(){
        return 1.0*calories/numServing;
    }
    public String toString(){
        return "\nCalories: "+calories + "\nNumber Served: "+numServing+"\nCost: "+cost;
    }
}
