package practical;

/**
 * @author Zakir Hossain
 * Feb 21, 2020
 * This will be either lunch or dinner.
 */

public class Pasta implements Edible {
    private String type;
    private String sauceType;
    private int calories;
    private int carbs;


      public Pasta(String type, String sauceType, int calories, int carbs){
        this.type =type;
        this.calories =calories;
        this.carbs =carbs;
        this.sauceType = sauceType;
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

    public String getSauceType() {
        return sauceType;
    }

    @Override
    public String toString() {
        return "practical.Pasta {" +
                "type='" + type + '\'' +
                ", sauceType='" + sauceType + '\'' +
                ", calories=" + calories +
                ", carbs=" + carbs +
                '}';
    }
}
