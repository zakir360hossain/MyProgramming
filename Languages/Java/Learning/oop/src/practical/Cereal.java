package practical;

/**
 * @author Zakir Hossain
 * Feb 21, 2020
 * This will be breakfats.
 */

public class Cereal implements Edible {
    private String type;
    private int calories;
    private int carbs;
    private int protein;

      public Cereal(String type, int calories, int carbs, int protein){
        this.type =type;
        this.calories =calories;
        this.carbs =carbs;
        this.protein = protein;
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
        return "practical.Cereal {" +
                "type='" + type + '\'' +
                ", calories=" + calories +
                ", carbs=" + carbs +
                ", protein=" + protein +
                '}';
    }
}
