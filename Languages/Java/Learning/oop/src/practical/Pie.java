package practical;

/**
 * @author Zakir Hossain
 * Feb 21, 2020
 * This will be either lunch or dinner.
 */
public class Pie implements Edible {
    private String type;
    private String flavor;
    private int calories;
    private int carbs;

    public Pie(String type, String flavor, int calories, int carbs){
        this.type = type;
        this.flavor = flavor;
        this.calories = calories;
        this.carbs = carbs;
    }
    @Override
    public String getFoodGroup() {
        return type;
    }

    @Override
    // Each serving represent one piece.
    public int getCaloriesPerServing() {
        return calories;
    }

    @Override
    public int getTotalCarbs() {
        return carbs;
    }

    @Override
    public String toString() {
        return "practical.Pie {" +
                "type='" + type + '\'' +
                ", flavor='" + flavor + '\'' +
                ", calories=" + calories +
                ", carbs=" + carbs +
                '}';
    }
}
