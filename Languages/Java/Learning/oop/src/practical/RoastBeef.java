package practical;

/**
 * @author Zakir Hossain
 * Feb 21, 2020
 * This is the sandwhich for lunch or dinner.
 */
public class RoastBeef implements Edible {
     private String type;
     private String beefType;
     private String toastType;
    private int calories;
    private int carbs;
    private int protein;

    public RoastBeef(String type, String beefType, String toastType, int calories, int carbs, int protein){
        this.type = type;
        this.beefType = beefType;
        this.toastType = toastType;
        this.calories = calories;
        this.carbs = carbs;
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

    public String getBeefType() {
        return beefType;
    }

    public String getToastType() {
        return toastType;
    }

    public int getProtein() {
        return protein;
    }

    @Override
    public String toString() {
        return "practical.RoastBeef {" +
                "type='" + type + '\'' +
                ", beefType='" + beefType + '\'' +
                ", toastType='" + toastType + '\'' +
                ", calories=" + calories +
                ", carbs=" + carbs +
                ", protein=" + protein +
                '}';
    }
}
