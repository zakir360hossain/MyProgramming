package practical;

/**
 * @author Zakir Hossain
 * Feb 21, 2020
 * This will be either lunch or dinner.
 */

public class Corn implements Edible {
    private String type;
    private int calories;
    private int carbs;


    public Corn(String type, int calories, int carbs){
        this.type =type;
        this.calories =calories;
        this.carbs =carbs;
    }


    @Override
    public String getFoodGroup() {
        return type;
    }

    @Override
    public int getCaloriesPerServing() {
        return calories;
    }

    @Override
    public int getTotalCarbs() {
        return carbs;
    }

    @Override
    public String toString() {
        return "practical.Corn {" +
                "type='" + type + '\'' +
                ", calories=" + calories +
                ", carbs=" + carbs +
                '}';
    }
}
