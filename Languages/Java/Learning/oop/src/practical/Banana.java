package practical;

/**
 * @author Zakir Hossain
 * Feb 21, 2020
 * This will be either lunch or dinner, fruit.
 */

public class Banana implements Edible {

    private String type;
    private int calories;
    private int carbs;
    private int potassiumAmount;

    public Banana(String type, int calories, int carbs, int potassiumAmount) {
        this.type = type;
        this.calories = calories;
        this.carbs = carbs;
        this.potassiumAmount = potassiumAmount;
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

    public int getPotassiumAmount() {
        return potassiumAmount;
    }

    @Override
    public String toString() {
        return "practical.Banana {" +
                "type='" + type + '\'' +
                ", calories=" + calories +
                ", carbs=" + carbs +
                '}';
    }
}
